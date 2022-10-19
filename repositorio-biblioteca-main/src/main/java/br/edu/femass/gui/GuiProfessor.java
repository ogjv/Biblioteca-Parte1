package br.edu.femass.gui;

import br.edu.femass.dao.DaoProfessor;
import br.edu.femass.model.Professor;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

public class GuiProfessor {
    private JFormattedTextField formattedTextTel;
    private JTextField textField3;
    private JButton btnSalvar;
    private JPanel jPanelProfessor;
    private JLabel textNomeProf;
    private JLabel textEnderecoProf;
    private JLabel textDisciplina;
    private JTextField textCodigoProf;
    private JScrollBar scrollBar1;
    public JList lstProfessores;
    private JTextField txtCodigo;
    private JTextField txtNome;
    private JTextField txtEndereco;
    public JFormattedTextField formattedTelefone;

    public GuiProfessor() {
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Professor professor = new Professor(txtCodigo.getText(),txtNome.getText(),txtEndereco.getText(),formattedTelefone.getText(),textDisciplina.getText());
                    new DaoProfessor().save(professor);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
    }

    public JPanel getjPanelProfessor(){
        return jPanelProfessor;
    }
}
