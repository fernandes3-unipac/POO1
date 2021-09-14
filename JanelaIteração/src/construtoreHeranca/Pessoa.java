/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtoreHeranca;

/**
 *
 * @author pedro
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private endereco endereco;
    private boolean isAtivo;

    

    public boolean isIsAtivo() {
        return isAtivo;
    }

    public void setIsAtivo(boolean isAtivo) {
        this.isAtivo = isAtivo;
    }

    public endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }
    
    /* 
    Método Construtor 
    - Não possui retorno = public Pessoa
    - Tem o mesmo nome da classe = public Pessoa
    - Sempre executado quando um objeto é instanciado    Pessoa person = new Pessoa("Joao", "123");
    */
    
    public Pessoa(){}
    
    public Pessoa(String nome, String cpf, endereco endereco, boolean isAtivo){
        this.isAtivo = isAtivo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public Pessoa(String nome, String cpf, endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    private void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    String getCpf(){
        return cpf;
    }
    
}
