/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico5;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class hipotenuza {

    public static void main(String args[]) {
        double valueA = 0.0;
        double valueB = 0.0;
        double valueC = 0.0;
        double hipotenuza = 0.0;

        valueA = Double.parseDouble(JOptionPane.showInputDialog("Calculo da Hipotenuza :" + "\n" + "Digite o 1º cateto: "));
        valueB = Double.parseDouble(JOptionPane.showInputDialog("Calculo da Hipotenuza :" + "\n" + "Digite o 2º cateto: "));

        valueC = Math.pow(valueA, 2) + Math.pow(valueB, 2);

        hipotenuza = Math.sqrt(valueC);
        
        JOptionPane.showMessageDialog(null,"Dados os catetos digitados: " + "\n" + valueA + " e " 
                                       + valueB + "\n" + "a hipotenuza é = " + hipotenuza);

    }

}
