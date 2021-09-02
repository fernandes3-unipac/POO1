/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico9;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class main {

    public static void main(String args[]) {

        vetores x = new vetores();
        int validador = 0;
        x.preenche(x.vetor1);
        x.armazenaVetor2(x.vetor2);

        if (x.valida(x.vetor1, x.vetor2)) {

            x.contido(x.vetor1, x.vetor2);
        }else{
            x.naoContido(x.vetor1, x.vetor2);
        }

    }

}
