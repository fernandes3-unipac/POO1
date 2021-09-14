/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtoreHeranca;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class main {

    public static void main(String args[]) {

        

        String nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
        String cpf = JOptionPane.showInputDialog(null, "Digite o cpf: ");
        
        
        
        
        String rua = JOptionPane.showInputDialog("Digite sua rua: ");
        String bairro = JOptionPane.showInputDialog("Digite seu bairro: ");
        int numeroc = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número: "));
        endereco end = new endereco(rua, bairro, numeroc);
        Pessoa pe3 = new Pessoa(nome, cpf, end);
        
        JOptionPane.showMessageDialog(null,"Pessoa Cadastrada com sucesso \n" 
                + "Nome: " + pe3.getNome() + "\n" 
                + "Cpf: " +  pe3.getCpf() + "\n"
                + "Rua: " + pe3.getEndereco().getRua() + "\n"
                + "Bairro: " + pe3.getEndereco().getBairro() + "\n"
                + "Número: " + pe3.getEndereco().getNumero());
        
        
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a mátricula: "));
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
        
        Aluno a = new Aluno(matricula, nota, nome, cpf, 4, end, true );
        
        JOptionPane.showMessageDialog(null,a.getDados());
        
        
    }
    
       
        
}
