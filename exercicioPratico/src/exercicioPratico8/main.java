/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico8;
import exercicioPratico8.vetor;
import javax.swing.JOptionPane;
/**
 *
 * @author pedro
 */
public class main {
    
    public static void main(String args[]){
        int numero;
        vetor vetor1 = new vetor();
        
        vetor1.armazenaVetor(vetor1.vetorInt);
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser multiplicado: "));
        
        vetor1.calculaVetor(vetor1.vetorInt, numero);
        vetor1.imprimeVetor(vetor1.vetorInt, numero);
        
    }
    
}
