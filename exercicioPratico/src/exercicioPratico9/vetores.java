/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico9;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class vetores {

    int[] vetor1 = new int[10];
    int[] vetor2 = new int[3];
    Random random = new Random();
   
    public void preenche( int vetor[]){
    
    for (int i = 0 ; i < vetor.length;i++){
        
    vetor[i] = random.nextInt(10);
}
    }


    public void armazenaVetor2(int vetor11[]) {

        int i = 0;
        while (i < vetor11.length) {

            vetor11[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor na posição " + (i) ));
            i++;
        }

    }

    public boolean valida(int vetor[], int vetor1[]) {
        int i = 0;
        int j = 0;
        int z = 0;
        

        for (i = 0; i < vetor1.length; i++) {
            for (j = 0; j < vetor.length; j++) {

                if (vetor1[i] == vetor[j]) {
                    z++;
                    
                }
            }
        }

      return z >= 3;

    }

    public void contido(int vetor1[], int vetor2[]) {
        String vetorString = " ";
        String vetorString2 = " ";
        int i = 0;
        while (i < vetor1.length) {
            vetorString += vetor1[i] + " ";
            i++;
        }

        int j = 0;
        while (j < vetor2.length) {
            vetorString2 += vetor2[j] + " ";
            j++;
        }

        JOptionPane.showMessageDialog(null, "O vetor " + vetorString2 + "\n" + "está contido no vetor: " + "\n"
                + vetorString);
    }
    
    
    
     public void naoContido(int vetor1[], int vetor2[]) {
        String vetorString = " ";
        String vetorString2 = " ";
        int i = 0;
        while (i < vetor1.length) {
            vetorString += vetor1[i] + " ";
            i++;
        }

        int j = 0;
        while (j < vetor2.length) {
            vetorString2 += vetor2[j] + " ";
            j++;
        }

        JOptionPane.showMessageDialog(null, "O vetor " + vetorString2 + "\n" + " não está contido no vetor: " + "\n"
                + vetorString);
    }


}
