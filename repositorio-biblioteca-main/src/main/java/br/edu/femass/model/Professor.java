package br.edu.femass.model;

import br.edu.femass.model.Leitor;

public class Professor extends Leitor {
    private String disciplina="";
    Integer prazoMaximoDevolucao = 30;
    public Professor(){

    }
    public Professor(String codigoLeitor, String nome, String endereco, String telefone, String disciplina){
        super(codigoLeitor,nome,endereco,telefone);
        this.disciplina=disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getNome(){ return nome;}
    public String getEndereco(){ return endereco;}
    public Integer getPrazoMaximoDevolucao(){
        return prazoMaximoDevolucao;
    }
    public String getDisciplina(){
        return disciplina;
    }
    public String toString() {
        return (this.getCodigoLeitor() +" - "+this.getNome()+" - "+this.getDisciplina()) ;
    }
    public boolean equals(Object obj) {
        Professor professor = (Professor) obj;
        return getNome().equals(this.nome);
    }

}
