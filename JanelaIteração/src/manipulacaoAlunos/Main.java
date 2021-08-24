
package manipulacaoAlunos;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Main {
    
    public static void main(String args[]){
        // Declaração de objetos
        
        alunos1 aluno1;
        alunos1 aluno2,aluno3;
        
        // Instânciar o objeto da classe
        
        aluno1 = new alunos1();
        aluno2 = new alunos1();
        aluno3 = new alunos1();
        
        // Acessar os atributos do objeto, através do .(PONTO);
        aluno1.nome = "Pedro";
        aluno1.matricula = 191002982;
        
        for (int i = 0; i < 3; i++){
            aluno1.notas[i] = 20;
        }
     
        aluno1.atualizarNotas(3);
        

        for (int i = 0; i < 3; i++){
            System.out.println("As notas são : " + aluno1.notas[i]);
        }
        
        
        aluno2.nome = JOptionPane.showInputDialog("Digite seu nome: ");
        aluno2.matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matricula: "));
        
        for(int i = 0; i < 3; i++){
            aluno2.notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (i + 1) + " do aluno"));
        }
       
        
      
       JOptionPane.showMessageDialog(null, aluno1.nome + " está " + (aluno1.retornarAprovado() ? " Aprovado" : "Reprovado"));
        
    }
    
}
