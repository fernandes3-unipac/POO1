/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import javax.swing.*;
/**
 *
 * @author pedro
 */
public class Revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Comentário de uma linha 
        /* Comentário de mais linhas*/
        
        
        
        // Declaração de variáveis PRIMITIVAS
        
        int idade;   // Armazena tipos inteiros
        idade = 22;
        char letra; // Armazena um único caracter
        double preco, desconto; // Armazena pontos flutuantes maiores
        preco = 2;
       // Declaração de variáveis PRIMITIVAS
       float notas[] = new float[3]; // Vetor de 3 posições ( inidice começando em 0)
       float notas1[][]= new float[5][5]; // Matriz 5x5;
       float x = 0; // Armazena pontos flutuantes;
       String nome;
       boolean boleana = true; // verdadeiro ou falso, so aceita TRUE or FALSE;
       
       
       /*Estruturas condicionais
       if(condicao){
            //comandos se condição = true;
       
       }else{
            comandos se condição = false;
       }
       */    
       
       if(preco > 5){
           System.out.println("O preço é maior que 5");
       }
       
       if(preco > 2 && preco == 6){
             System.out.println("O preço é maior que 2 e é igual a 6");
       }else{
           System.out.println("O preço inferior a 2");
       }
         
       // Switch/Case;
       
       switch(idade){
           case 20: System.out.println("O valor é isso ai mesmo");
           break;
           
           default : System.out.println("Idade inválida");
       }
       //Estruturas de repetição
       //for(inicializador , condição , atualizador // Comandos irão se repetir enquanto a condiçao fo verdadeira
       
       for(int i = 0; i < 5; i++ ){
           
           System.out.println("Valor de i: " + i);
       }
     
       /*  While(condição) 
            Comandos que irão se repetir enquanto a condição for verdadeira
       */
            System.out.println("");
       int j = 0 ;
       while(j < 5){
           System.out.println("Valor de j: " + j);
           j++;
       }
       
       
       /*  do....While(condição) 
            Comandos que irão se repetir enquanto a condição for verdadeira
       */
       System.out.println("");
       do {
            System.out.println("Valor de j: " + j);
            j++;
       } while(j < 10);
       
       // ENTRADA DE DADOS COM JOptionpane
       
       String nome3 = JOptionPane.showInputDialog("Digite seu nome: ");
       JOptionPane.showMessageDialog(null,"Ola " + nome3);
       
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade : "));
       
        switch(idade){
           case 20: JOptionPane.showMessageDialog(null,"O valor é isso ai mesmo");
           break;
           
           default : System.out.println("Idade inválida");
       }
      
    }
    
}
