/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificarInstancia;

import java.awt.Color;

/**
 *
 * @author pedro
 */
public class mamifero  extends animal{
    
    private String anatomia;

    public mamifero(String anatomia, Color cor, int numeroPatas, double peso, double altura, String habitat, String descricao) {
        super(cor, numeroPatas, peso, altura, habitat, descricao);
        this.anatomia = anatomia;
    }
    
   public mamifero(String anatomia,double peso, String descricao) {
        super( peso, descricao);
        this.anatomia = anatomia;
    }
    
    
    public mamifero(String anatomia) {
        this.anatomia = anatomia;
    }
    
   
    public mamifero(){}

    public String getAnatomia() {
        return anatomia;
    }

    public void setAnatomia(String anatomia) {
        this.anatomia = anatomia;
    }
    
    public String retornaDados(){
        return "Descrição : " + super.getDescricao() + "\nPeso: " + super.getPeso() + "kg"
                 +"\nAntomia: " + getAnatomia();
    }
    
}
