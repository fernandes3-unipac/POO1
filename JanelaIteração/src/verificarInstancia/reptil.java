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
public class reptil extends animal {
    
    private boolean hasEscamas;
    private boolean isVenenoso;

    public reptil(boolean hasEscamas, boolean isVenenoso, Color cor, int numeroPatas, double peso, double altura, String habitat, String descricao) {
        super(cor, numeroPatas, peso, altura, habitat, descricao);
        this.hasEscamas = hasEscamas;
        this.isVenenoso = isVenenoso;
    }
   public reptil(String descricao, double peso, boolean hasEscamas, boolean isVenenoso) {
        super( peso, descricao);
        this.hasEscamas = hasEscamas;
        this.isVenenoso = isVenenoso;
    }

    public reptil(boolean hasEscamas, boolean isVenenoso) {
        this.hasEscamas = hasEscamas;
        this.isVenenoso = isVenenoso;
    }
    public reptil(){}

    public boolean isHasEscamas() {
        return hasEscamas;
    }

    public void setHasEscamas(boolean hasEscamas) {
        this.hasEscamas = hasEscamas;
    }

    public boolean isIsVenenoso() {
        return isVenenoso;
    }

    public void setIsVenenoso(boolean isVenenoso) {
        this.isVenenoso = isVenenoso;
    }
    
     public String retornaDados(){
        return "Descrição : " + super.getDescricao() + "\nPeso: " + super.getPeso() + "kg"
                 +"\nVenenoso?: " + (isVenenoso? "Sim":"não");
    }
    
    
}
