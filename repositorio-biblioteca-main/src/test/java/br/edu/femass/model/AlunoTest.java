package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void getMatricula() {
        Aluno a1 = new Aluno("2345","Joao","Rua B","1277777777","0987");
        String esperado = "0987";
        Assertions.assertEquals(esperado,a1.getMatricula());
    }

    @Test
    void getPrazoMaximoDevolucao() {
        Aluno a2 = new Aluno ("8765","Victor","Rua H","3189898989","1234");
        Integer esperado = 15;
        Assertions.assertEquals(esperado,a2.getPrazoMaximoDevolucao());
    }
}