package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void getCodigo() {
        Livro livro = new Livro("2345","A cabana");
        String esperado = "2345";
        Assertions.assertEquals(esperado,livro.getCodigo());
    }

    @Test
    void getTitulo() {
        Livro livro = new Livro("9876","Qualquer");
        String esperado = "Qualquer";
        Assertions.assertEquals(esperado,livro.getTitulo());
    }
}