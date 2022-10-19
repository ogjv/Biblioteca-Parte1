package br.edu.femass.gui;

import br.edu.femass.dao.DaoAutor;
import br.edu.femass.model.Autor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class GuiPrincipal {
    private JPanel jPanel;
    private JButton bibliotecárioButton;
    private JButton atendenteButton;

    public GuiPrincipal() {
        bibliotecárioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiOpcBib guiOpcBib = new GuiOpcBib();
                JFrame jFrame = new JFrame("Tela Opções Bibliotecário");
                jFrame.setContentPane(guiOpcBib.getjPanelBib());
                jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jFrame.setLocation(600, 200);
                jFrame.setSize(300,200);
                jFrame.setVisible(true);
            }
        });
        atendenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiOpcAtendente guiOpcAtendente = new GuiOpcAtendente();
                JFrame frame = new JFrame("Frame Opção Atendente");
                frame.setContentPane(guiOpcAtendente.getjPanelOpcAtendente());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocation(600, 200);
                frame.setSize(300,200);
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        GuiPrincipal guiPrincipal = new GuiPrincipal();
        JFrame jFrame = new JFrame("Tela Principal");
        jFrame.setContentPane(guiPrincipal.jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocation(600, 200);
        jFrame.setSize(300,200);
        jFrame.setVisible(true);
    }
}
