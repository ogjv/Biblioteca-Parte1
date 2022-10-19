package br.edu.femass.model;

public class Aluno extends Leitor {
    private String matricula;
    private Integer prazoMaximoDevolucao=15;
    public Aluno(){

    }
    public Aluno(String codigoLeitor, String nome, String endereco, String telefone, String matricula){
        super(codigoLeitor,nome,endereco,telefone);
        this.matricula=matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public Integer getPrazoMaximoDevolucao(){
        return prazoMaximoDevolucao;
    }
    public String toString() {
        return (this.getNome() +" - "+ this.matricula) ;
    }
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return getMatricula().equals(this.matricula);
    }
}
