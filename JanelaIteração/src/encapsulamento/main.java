/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author pedro
 */
public class main {
    
    public static void main(String args[]){
        alunos1 a = new alunos1();
        
        endereco e = new endereco();
        
        e.setRua("Antônio de Oliveira");
        e.setBairro("São Sebastião");
        e.setNumero(50);
        
        a.setEndereco(e);
        
        a.getEndereco().getBairro();
        
        System.out.println("Rua " + a.getEndereco().getRua());
        
    }
    
}
