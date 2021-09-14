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
public class endereco {
    private String rua,bairro;
    private int numero;

    public endereco(String rua, String bairro, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
    
    public endereco(){}
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
