/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico6;

/**
 *
 * @author pedro
 */
public class convertDegree {

    float celsius = 0f;
    float fahrenhite = 0f;

    public double convertToFahrenhite(float celsius) {

        float resultado;

        resultado = (float) (((9.0/ 5.0)* celsius) + 32) ;

        return resultado;

    }

    public double convertToCelsius(float fahrenhite) {

        float resultado;
        
        resultado = (float) ((5.0 / 9.0) * (fahrenhite - 32));
        
        return resultado;
        

    }

}
