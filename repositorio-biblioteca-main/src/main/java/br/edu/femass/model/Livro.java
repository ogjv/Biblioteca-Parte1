package br.edu.femass.model;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String codigo;
    private String titulo;
    private List<Exemplar> exemplares;

    public Livro(){

    }
    public Livro(String codigo, String titulo){
        this.codigo=codigo;
        this.titulo=titulo;
        this.exemplares= new ArrayList<Exemplar>();
    }
    public void setCodigo(String codigo){

        this.codigo=codigo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    public String getCodigo()
    {
        return codigo;

    }
    public String getTitulo()
    {
        return titulo;

    }

    @Override
    public String toString() {
        return this.titulo;
    }

    @Override
    public boolean equals(Object obj) {
        Livro livro = (Livro) obj;
        return getTitulo().equals(this.titulo);
     }
}
