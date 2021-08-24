/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacaoAlunos;

/**
 *
 * @author pedro
 */
public class alunos1 {
    //Atributos
    String nome;
    int matricula;
    double notas[] = new double[3];

    //Métodos
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
