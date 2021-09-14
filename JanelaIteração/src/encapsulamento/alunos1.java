/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author pedro
 */
public class alunos1 {
    //Atributos
    private String nome;
    private int matricula;
    private double notas[] = new double[3];
    private endereco endereco;

    public endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }

    //Métodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
   
    public boolean retornarAprovado() {
        double soma = 0;

        for (int i = 0; i < 3; i++) {
            soma += notas[i];
        }
        return soma >= 60; // retorna true ou false
    }
    
    public void atualizarNotas(double pontoExtra){
        
        for (int i = 0; i < 3; i++){
            notas[i] += pontoExtra;
        }
        
    }
}
