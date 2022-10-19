package br.edu.femass.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeitorTest {

    @Test
    void getNome() {
        Leitor leitor = new Leitor("9876","Paula","Rua 1","99999999");
        String esperado = "Paula";
        Assertions.assertEquals(esperado,leitor.codigoLeitor);
    }

    @Test
    void getEndereco() {
        Leitor leitor = new Leitor("9876","Paula","Rua 1","99999999");
        String esperado = "Rua 1";
        Assertions.assertEquals(esperado,leitor.getEndereco());
    }

    @Test
    void getTelefone() {
        Leitor leitor = new Leitor("9876","Paula","Rua 1","99999999");
        String esperado = "99999999";
        Assertions.assertEquals(esperado,leitor.getEndereco());
    }

    @Test
    void getCodigoLeitor() {
        Leitor leitor = new Leitor("9876","Paula","Rua 1","99999999");
        String esperado = "9876";
        Assertions.assertEquals(esperado,leitor.getEndereco());
    }
}