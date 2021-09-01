/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico3;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author pedro
 */
public class asterisco {

    public static void main(String[] args) {

        int value;
        value = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 10: "));
        int confirme = JOptionPane.showConfirmDialog(null, "Você Digitou " + value + " ,deseja continuar?","Janela de Confirmação" ,YES_NO_OPTION);
        switch (confirme) {
            case 0:
                for (int i = 1; i <= value; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Você não desejou continuar. Volte Sempre, Obrigado");
                break;
          
        }

    }
}
