/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico2;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Main {

    public static void main(String[] args) {

        exercicioPratico2 calculo;
        calculo = new exercicioPratico2();

        calculo.num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor :"));
        calculo.num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor :"));

        JOptionPane.showMessageDialog(null, calculo.num1 + " + " + calculo.num2 + " = "
                + calculo.soma(calculo.num1, calculo.num2) + "\n"
                + calculo.num1 + " - " + calculo.num2 + " = " + calculo.subtracao(calculo.num1, calculo.num2) + "\n" 
                + calculo.num1 + " * " + calculo.num2 + " = " + calculo.multiplicacao(calculo.num1, calculo.num2)+ "\n"
                + calculo.num1 + " / " + calculo.num2 + " = " + calculo.divisao(calculo.num1, calculo.num2));
    }
}
