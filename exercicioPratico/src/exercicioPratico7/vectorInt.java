/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico7;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class vectorInt {
    
    public  void armazena(int vetor[]){
        
        for(int i = 0 ; i < vetor.length; i++){
            
           vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição " + (i)));
        }
    }
    
    public void imprime(int vetor[],String saida){
        
       
        for(int i = 9 ; i >= 0; i--){
           saida += vetor[i] +" ";
        }
        
            
           JOptionPane.showMessageDialog(null,"As posições são " +  " " + saida);
    }
}
