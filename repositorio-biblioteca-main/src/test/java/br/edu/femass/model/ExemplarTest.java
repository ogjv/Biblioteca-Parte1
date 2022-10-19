package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ExemplarTest {

    @Test
    void getCodigoEx() {
        Exemplar exemplar = new Exemplar("A cabana");
        String esperado = "A cabana";
        Assertions.assertEquals(esperado,exemplar.getCodigoEx());

    }


    @Test
    void getLivro() {
        Exemplar exemplar2 = new Exemplar("Nada");
        String esperado = "Nada";
        Assertions.assertEquals(esperado,exemplar2.getLivro());
    }
}