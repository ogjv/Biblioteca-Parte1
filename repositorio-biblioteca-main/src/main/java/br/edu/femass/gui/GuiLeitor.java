package br.edu.femass.gui;

import br.edu.femass.dao.DaoAluno;
import br.edu.femass.dao.DaoProfessor;
import br.edu.femass.model.Aluno;
import br.edu.femass.model.Professor;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

public class GuiLeitor {
    private JButton btnSalvar;
    private JTextField textCodigo;
    private JTextField textNome;
    private JTextField textEndereco;
    private JFormattedTextField formattedTelefone;
    private JPanel jPanelLeitor;
    private JButton professorButton;
    private JButton alunoButton;

    public GuiLeitor() {
        alunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiAluno guiAluno = new GuiAluno();
                JFrame frame = new JFrame("Frame Aluno");
                frame.setContentPane(guiAluno.getjPanelAluno());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                MaskFormatter mascara = null;
                try {
                    mascara = new MaskFormatter("(##) #####-####");
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
                mascara.install(guiAluno.formattedTextTelefoneAluno);
                List<Aluno> alunos = null;
                try {
                    alunos = new DaoAluno().getAll();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                guiAluno.lstAluno.setListData(alunos.toArray());
                frame.setSize(800,800);
                frame.setLocation(600, 200);
                frame.pack();
                frame.setVisible(true);
            }
        });
        professorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiProfessor guiProfessor = new GuiProfessor();
                JFrame frame = new JFrame("Frame Professor");
                frame.setContentPane(guiProfessor.getjPanelProfessor());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                MaskFormatter mascara = null;
                try {
                    mascara = new MaskFormatter("(##) #####-####");
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
                mascara.install(guiProfessor.formattedTelefone);
                List<Professor> professores = null;
                try {
                    professores = new DaoProfessor().getAll();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                guiProfessor.lstProfessores.setListData(professores.toArray());
                frame.setSize(800,800);
                frame.setLocation(600, 200);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public JPanel getjPanelLeitor(){
        return jPanelLeitor;
    }
}
