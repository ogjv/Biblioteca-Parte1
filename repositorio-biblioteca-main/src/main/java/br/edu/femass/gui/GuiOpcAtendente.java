package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiOpcAtendente {
    private JButton cadastrarLeitorButton;
    private JPanel jPanelOpcAtendente;
    private JButton realizarEmpréstimoButton;
    private JButton realizarDevoluçãoButton;

    public GuiOpcAtendente() {
        cadastrarLeitorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiLeitor guiLeitor = new GuiLeitor();
                JFrame frame = new JFrame("Frame Leitor");
                frame.setContentPane(guiLeitor.getjPanelLeitor());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(800,800);
                frame.setLocation(300, 200);
                frame.setVisible(true);
            }
        });
        realizarEmpréstimoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        realizarDevoluçãoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public JPanel getjPanelOpcAtendente(){
        return jPanelOpcAtendente;
    }
}
