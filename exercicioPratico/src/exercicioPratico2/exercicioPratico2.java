/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico2;

import javax.swing.*;

/**
 *
 * @author pedro
 */

public class exercicioPratico2 {

    float num1 = 0f;
    float num2 = 0f;

    public float soma(float num1, float num2) {

        return num1 + num2;
    }

    public float subtracao(float num1, float num2) {

        return num1 - num2;

    }

    public float multiplicacao(float num1, float num2) {

        return num1 * num2;

    }

    public float divisao(float num1, float num2) {
        float resultado = 0f;
        try {
            resultado = num1 / num2;
           
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Erro" + erro);
        }
        return resultado;
    }
    
}