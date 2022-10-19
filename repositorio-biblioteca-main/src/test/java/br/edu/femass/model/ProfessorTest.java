package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void getNome() {
        Professor professor = new Professor("1234","Alan","rua J","2199999999","Prog 3");
        String esperado = "Alan";
        Assertions.assertEquals(esperado,professor.getNome());
    }

    @Test
    void getEndereco() {
        Professor professor2 = new Professor("8765","Anselmo","rua A","2188888888","Prog 2");
        String esperado = "rua A";
        Assertions.assertEquals(esperado,professor2.getEndereco());
    }

    @Test
    void getPrazoMaximoDevolucao() {
        Professor professor2 = new Professor("8765","Anselmo","rua A","2188888888","Prog 2");
        Integer esperado = 30;
        Assertions.assertEquals(esperado,professor2.getPrazoMaximoDevolucao());
    }

    @Test
    void getDisciplina() {
        Professor professor = new Professor("1234","Alan","rua J","2199999999","Prog 3");
        String esperado = "Prog 3";
        Assertions.assertEquals(esperado,professor.getDisciplina());
    }
}