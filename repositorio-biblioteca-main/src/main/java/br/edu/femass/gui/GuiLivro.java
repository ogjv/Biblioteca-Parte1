package br.edu.femass.gui;

import br.edu.femass.dao.DaoExemplar;
import br.edu.femass.dao.DaoLivro;
import br.edu.femass.model.Exemplar;
import br.edu.femass.model.Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GuiLivro {
    private JTextField textCodigo;
    private JTextField textTitulo;
    private JButton btnSalvar;
    private JPanel jPanelLivro;
    private JScrollBar scrollBar1;
    public JList lstLivros;

    public GuiLivro() {
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Livro livro = new Livro(textCodigo.getText(),textTitulo.getText());
                    new DaoLivro().save(livro);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
                GuiExemplar guiExemplar = new GuiExemplar();
                JFrame frame = new JFrame("Frame Exemplar");
                frame.setContentPane(guiExemplar.getjPanelExemplar());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                List<Exemplar> exemplares = null;
                try {
                    exemplares = new DaoExemplar().getAll();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                guiExemplar.lstExemplares.setListData(exemplares.toArray());
                frame.setLocation(600, 200);
                frame.setSize(800,800);
                frame.setVisible(true);
            }
        });
    }
    public JPanel getjPanelLivro(){
        return jPanelLivro;
    }
}
