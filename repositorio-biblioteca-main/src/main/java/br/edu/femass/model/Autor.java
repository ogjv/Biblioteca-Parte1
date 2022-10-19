package br.edu.femass.model;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome ;
    private String sobrenome ;
    protected String nacionalidade ;
    private List<Livro> livros;

    public Autor(){
        
    }

    public Autor (String nome, String sobrenome, String nacionalidade){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.nacionalidade=nacionalidade;
        this.livros= new ArrayList<Livro>();

    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome=sobrenome;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade=nacionalidade;
    }
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }

    @Override
    public String toString() {
        return (this.nome +" "+ this.sobrenome +" "+ this.getNacionalidade()) ;
    }
    public boolean equals(Object obj) {
        Autor autor = (Autor) obj;
        return getNome().equals(this.nome);
    }

}
