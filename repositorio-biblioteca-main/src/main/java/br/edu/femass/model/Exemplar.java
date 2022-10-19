package br.edu.femass.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Exemplar{
    private long codigoEx;
    private LocalDate dataAquisicao;
    private List<Emprestimo> emprestimos;
    private static long proxCodEx=1L;
    private String livro;

    public Exemplar(){

    }
    public Exemplar (String livro){
        this.livro=livro;
        this.codigoEx=proxCodEx;
        proxCodEx++;
        this.dataAquisicao= LocalDate.now();
        this.emprestimos=new ArrayList<Emprestimo>();
    }
    public long getCodigoEx(){
        return codigoEx;
    }
    public LocalDate getDataAquisicao(){
        return dataAquisicao;
    }
    public String getLivro(){
        return livro;
    }

    @Override
    public String toString() {
        return (this.codigoEx + " - Exemplar do livro "+ this.getLivro()+"-"+ this.dataAquisicao);
    }
    public boolean equals(Object obj) {
        Exemplar exemplar = (Exemplar) obj;
        return getLivro().equals(this.livro);
    }


    
}
