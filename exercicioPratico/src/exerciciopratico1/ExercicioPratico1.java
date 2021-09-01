/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopratico1;

import javax.swing.JOptionPane;


/*Escreva  um  aplicativo  que  o  usuário  informe  seu  nome  e  sua  idade,  separadamente.  A 
seguinte mensagem deverá ser exibida após a digitação: “Fulano de Tal, sua idade é: XX” 
(onde Fulano de Tal é o nome da pessoa e XX sua idade).*/
public class ExercicioPratico1 {

  
    public static void main(String[] args) {
        
        
        String name = JOptionPane.showInputDialog("Olá, insira seu nome: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Agora insira sua idade: "));
        
        JOptionPane.showMessageDialog(null,"Olá " + name + ", sua idade é " + age + " anos");
    }
    
}
