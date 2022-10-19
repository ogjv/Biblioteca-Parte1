package br.edu.femass.gui;

import br.edu.femass.dao.DaoExemplar;
import br.edu.femass.model.Exemplar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class GuiExemplar {
    private JTextField textNome;
    private JButton btnSalvar;
    private JPanel jPanelExemplar;
    private JScrollBar scrollBar1;
    public JList lstExemplares;

    public GuiExemplar() {
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Exemplar exemplar = new Exemplar(textNome.getText());
                    new DaoExemplar().save(exemplar);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
    }
    public JPanel getjPanelExemplar(){
        return jPanelExemplar;
    }
}
