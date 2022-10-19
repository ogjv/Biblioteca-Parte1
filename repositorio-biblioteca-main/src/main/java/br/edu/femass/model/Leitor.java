package br.edu.femass.model;
import java.util.ArrayList;
import java.util.List;

public class Leitor {
    protected String codigoLeitor;
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected Integer prazoMaximoDevolucao;
    protected List<Emprestimo> emprestimos;
    public Leitor(){

    }
    public Leitor(String codigoLeitor,String nome, String endereco, String telefone){
        this.codigoLeitor=codigoLeitor;
        this.nome=nome;
        this.endereco=endereco;
        this.telefone=telefone;
        this.emprestimos=new ArrayList<Emprestimo>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCodigoLeitor(String codigoLeitor) {
        this.codigoLeitor = codigoLeitor;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCodigoLeitor() {
        return codigoLeitor;
    }
    public String toString() {
        return (this.codigoLeitor +" - "+this.nome) ;
    }
    public boolean equals(Object obj) {
        Leitor leitor = (Leitor) obj;
        return getCodigoLeitor().equals(this.codigoLeitor);
    }

}
