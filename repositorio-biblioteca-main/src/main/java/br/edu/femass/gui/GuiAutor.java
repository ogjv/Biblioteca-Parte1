package br.edu.femass.gui;

import br.edu.femass.dao.DaoAutor;
import br.edu.femass.dao.DaoLivro;
import br.edu.femass.model.Autor;
import br.edu.femass.model.Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GuiAutor {
    private JTextField textNome;
    private JTextField textSobrenome;
    private JTextField textNacionalidade;
    private JButton btnSalvar;
    private JPanel jPanelAutor;
    private JScrollBar scrollBar1;
    public JList lstAutores;

    public GuiAutor() {
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Autor autor = new Autor(textNome.getText(),textSobrenome.getText(),textNacionalidade.getText());
                    new DaoAutor().save(autor);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
                GuiLivro guiLivro = new GuiLivro();
                JFrame frame = new JFrame("Frame Livro");
                frame.setContentPane(guiLivro.getjPanelLivro());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                List<Livro> livros = null;
                try {
                    livros = new DaoLivro().getAll();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                guiLivro.lstLivros.setListData(livros.toArray());
                frame.setLocation(600, 200);
                frame.setSize(800,800);
                frame.setVisible(true);
            }
        });
    }
        public JPanel getJPanelAutor(){
            return jPanelAutor;
        }
}
