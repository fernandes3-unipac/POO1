/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtoreHeranca;

/**
 *
 * @author pedro
 */
public class Aluno extends Pessoa { // A classe Aluno é filha de Pessoa

    private int matricula;
    private double nota;

    public Aluno(int matricula, double nota, String nome, String cpf, int codigo, endereco endereco, boolean isAtivo) {
        // super = chamada do método construtor de classe mãe.
        super(nome, cpf, endereco,isAtivo);
        this.matricula = matricula;
        this.nota = nota;

    }

    public Aluno(){}
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public String getDados(){
        
        return "Dados do Aluno: \n" 
                + getNome() + "\n"
                + getCpf();
        
        
    }

}
