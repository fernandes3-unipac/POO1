/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaMetodos;

/**
 *
 * @author pedro
 */
public class mercadoria {
    
    private String descricao;
    private double preco;

    public mercadoria(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public mercadoria(){}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public void setDesconto (double desconto){
        this.preco -= desconto;
    }
    
    public void setDesconto(int porcentagem){
        this.preco = this.preco - (this.preco * (porcentagem/100));
    }
    
    
}
