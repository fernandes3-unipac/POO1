/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Importação do pacote javax para utilização das janelas de iteração
import javax.swing.JOptionPane;
/**
 *
 * @author pedro
 */
public class JanelaIteracao{
    
    // Atributos
    int valor;
    
    // Metodos
    public static int dobro (int numero){
        return numero * 2;
    }
    
    public static void main (String[] args){
        
        //Janela de mensagem
        JOptionPane.showMessageDialog(null, "Seja Bem Vindo ao meu arquivo");
        
        
        //Janela entrada de dados
        String entrada = JOptionPane.showInputDialog("Digite um número: ");
        System.out.println(entrada);
        
        
        // Conversao para inteiro
        
        int valor = Integer.parseInt(entrada);
    
        System.out.println(valor);
        
        // IF ternário 
         System.out.println(valor > 3 ? "valor maior que 3" : "valor menor que 3");
        
        
        JOptionPane.showMessageDialog(null, valor > 3 ? "valor maior que 3" : "valor menor que 3");
        JOptionPane.showMessageDialog(null, "O dobro do valor de " + valor + " é " + dobro(valor));
                
    }
}
