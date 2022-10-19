package br.edu.femass.model;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataPrevistaDevolucao;
    private LocalDate dataDevolucao;

    public Emprestimo(){
        this.dataDevolucao=dataDevolucao;
        this.dataEmprestimo= LocalDateTime.now();
        this.dataPrevistaDevolucao=dataPrevistaDevolucao;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDateTime getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    @Override
    public String toString() {
       return dataDevolucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }
    public boolean equals(Object obj) {
        Emprestimo emprestimo = (Emprestimo) obj;
        return getDataEmprestimo().equals(this.dataEmprestimo);
    }

}
