/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico8;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class vetor {

    int vetorInt[] = new int[15];

    

    public void armazenaVetor(int vetor[]) {

        int i = 0;

        while (i < 15) {

            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor na posição " + "[" + i + "]"));
            i++;
        }
    }
    
    public void calculaVetor( int vetor[], int numero){
        int i = 0;
        
        while(i < vetor.length){
            
            vetor[i] *= numero;
            i++;
        }
    }
    
    public void imprimeVetor(int vetor[], int numero){
        int i = 0;
        String imprime = "";
        while(i < vetor.length){
            
            imprime += vetor[i] + " ";
            i++;
        }
        
        JOptionPane.showMessageDialog(null, "Os valores multiplicados por " + numero + " resultam em: " + "\n"
                                      + imprime);
    }

}
