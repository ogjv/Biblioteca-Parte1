package br.edu.femass.gui;

import br.edu.femass.dao.DaoLivro;
import br.edu.femass.model.Livro;

import javax.swing.*;
import java.util.List;

public class GuiDsp {
    private JScrollBar scrollBar1;
    public JList lstLivros;
    private JPanel jPanelDisp;


    public JPanel getjPanelDisp(){
        return jPanelDisp;
    }

}
