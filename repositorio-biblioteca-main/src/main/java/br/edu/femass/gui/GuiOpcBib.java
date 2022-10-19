package br.edu.femass.gui;

import br.edu.femass.dao.DaoAutor;
import br.edu.femass.dao.DaoLivro;
import br.edu.femass.model.Autor;
import br.edu.femass.model.Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GuiOpcBib {
    private JButton cadastrarLivrosButton;
    private JButton listaDeLivrosButton;
    private JPanel jPanelBib;

    public GuiOpcBib() {
        cadastrarLivrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAutor guiAutor = new GuiAutor();
                JFrame frame = new JFrame("Frame Autor");
                frame.setContentPane(guiAutor.getJPanelAutor());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                List<Autor> autores = null;
                try {
                    autores = new DaoAutor().getAll();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                guiAutor.lstAutores.setListData(autores.toArray());
                frame.setLocation(300, 100);
                frame.pack();
                frame.setVisible(true);

            }
        });
        listaDeLivrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiDsp guiDisp = new GuiDsp();
                JFrame frame = new JFrame("Frame Disponiveis");
                frame.setContentPane(guiDisp.getjPanelDisp());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                List<Livro> livros = null;
                try {
                    livros = new DaoLivro().getAll();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                guiDisp.lstLivros.setListData(livros.toArray());
                frame.setLocation(600, 100);
                frame.pack();
                frame.setVisible(true);

            }
        });
    }
    public JPanel getjPanelBib(){
        return jPanelBib;
    }
}
