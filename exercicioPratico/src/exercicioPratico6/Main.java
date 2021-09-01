/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico6;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author pedro
 */
public class Main {

    public static void main(String args[]) {
        
        convertDegree conversao;
        conversao = new convertDegree();
        int resp = 25;
        DecimalFormat df = new DecimalFormat("0.00");

        do {

            int option = Integer.parseInt(JOptionPane.showInputDialog("Conversão de temperaturas" + "\n"
                    + "1 - Conversão de Celsius para Fahrenheit" + "\n"
                    + "2 - Conversão de Fahreneit" + "\n"
                    + "Digite sua opção:" ));

            switch (option) {
                case 1:
                    int grauC = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
                   
                    JOptionPane.showMessageDialog(null,"A temperatura " + grauC + "°C" + " corresponde a " 
                    +  df.format(conversao.convertToFahrenhite(grauC)) + "°F");
                    break;
                case 2 : 
                    int grauF = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
                   
                    JOptionPane.showMessageDialog(null,"A temperatura " + grauF + "°F" + " corresponde a " 
                    + df.format(conversao.convertToCelsius(grauF)) + "°C");
                    break;
                    
                default: JOptionPane.showMessageDialog(null, "Opção Inválida");
                
            }
            
            resp = JOptionPane.showConfirmDialog(null,"Deseja Continuar? ","Confirme",YES_NO_OPTION);
        } while (resp == 0);

    }

}
