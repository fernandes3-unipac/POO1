/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;


import java.util.Scanner;
/**
 *
 * @author pedro
 */

public class Numeroprimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =  new Scanner(System.in);
        
        int vetor[] = new int[9]; // vetor [1,2,3,4,5,6,7,8,9]
        int vetorContador[] = new int[9]; // [
        
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite o valor a ser inserido no vetor na posição" + "["+i+"]: ");
            vetor[i] = sc.nextInt();
            System.out.print("\n");
        }
        
              
        
        
         int N,contador=0;
         
         for (int i = 0 ; i < vetor.length; i++){  //  vetor[0] = 25
             
             N = vetor[i]; // N = 25
             
             for(int j = 1 ; j <= N ; j++){
                 
                 if(vetor[i] % j == 0){
                     contador ++;
                  }
                 if (j == N){
                     vetorContador[i] = contador;
                     contador = 0;
                 }
         }
             
             if ( vetor[i] == 1 ||vetorContador[i] == 2){
                 System.out.println("O valor " + vetor[i] + " na posição " + "["+i+"]" + "é primo"  );
             }
             
             
        
   
    }
  }
    
}
