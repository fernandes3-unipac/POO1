/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificarInstancia;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Main {
    
    public static void main (String args[]){
       // mamifero mam[] = new mamifero[5];
        animal animais[] = new animal[2];
        
        
        
        
        for(int i = 0; i < animais.length; i++){
            int tipo = Integer.parseInt(JOptionPane.showInputDialog(null,"*****CADASTRO DE ANIMAIS*****"));
            
                    
            String descricao = JOptionPane.showInputDialog("Descrição: ");
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
            if (tipo == 1){
            String anatomia = JOptionPane.showInputDialog("Digite Antomia: ");
            animais[i]  = new mamifero(descricao,peso,anatomia);
        }else{
                int isVenenoso = Integer.parseInt(JOptionPane.showInputDialog("Venenoso?"));
                int hasEscamas = Integer.parseInt(JOptionPane.showInputDialog("Escamas?"));
                animais[i] = new reptil(descricao,peso, hasEscamas == 1, isVenenoso == 1);
                
            }
        }
        
        for(int i = 0 ; i < animais.length; i++){
            
            //instanceof
            
            if(animais[i] instanceof mamifero){
                mamifero m = (mamifero) animais[i];
                System.out.println(m.retornaDados());
            }else if(animais[i] instanceof reptil){
                reptil r = (reptil) animais[i];
                System.out.println(r.retornaDados());
                
            }
            
        }
       
    }
    
}
