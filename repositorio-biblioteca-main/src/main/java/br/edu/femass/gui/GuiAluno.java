package br.edu.femass.gui;

import br.edu.femass.model.Aluno;
import br.edu.femass.dao.DaoAluno;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiAluno {
    private JTextField textCodigoAluno;
    private JTextField textNomeAluno;
    private JTextField textEnderecoAluno;
    public JFormattedTextField formattedTextTelefoneAluno;
    private JButton btnSalvar;
    private JPanel jPanelAluno;
    private JTextField textMatricula;
    private JScrollBar scrollBar1;
    public JList lstAluno;

    public GuiAluno() {
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Aluno aluno = new Aluno(textCodigoAluno.getText(), textNomeAluno.getText(), textEnderecoAluno.getText(), formattedTextTelefoneAluno.getText(), textMatricula.getText());
                    new DaoAluno().save(aluno);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public JPanel getjPanelAluno(){
        return jPanelAluno;
    }
}
