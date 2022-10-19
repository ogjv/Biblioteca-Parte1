package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @Test
    void getNome() {
        Autor autor = new Autor("Fulano", "de Tal","Brasileiro");
        String esperado ="Fulano";
        Assertions.assertEquals(esperado,autor.getNome());
    }

    @Test
    void getSobrenome() {
        Autor autor = new Autor("Fulano", "de Tal","Brasileiro");
        String esperado ="de Tal";
        Assertions.assertEquals(esperado,autor.getNome());
    }

    @Test
    void getNacionalidade() {
        Autor autor = new Autor("Fulano", "de Tal","Brasileiro");
        String esperado ="Brasileiro";
        Assertions.assertEquals(esperado,autor.getNome());
    }
}