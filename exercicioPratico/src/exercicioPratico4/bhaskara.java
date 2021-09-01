/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico4;

/**
 *
 * @author pedro
 */
public class bhaskara {

    float numeroa;
    float numerob;
    float numeroc;

    public float calculaDelta(float numeroa, float numerob, float numeroc) {
        float delta = 0f;
        
        
        delta = (float) (Math.pow(numerob,2) - (4 * numeroa * numeroc));
        return delta;
    }

    public boolean validaDelta(float delta) {
        boolean resultado = true;
        if (delta < 0) {
            resultado = false;
        }
        return resultado;
    }

    public float calculaRaiz0(float delta, float numeroa, float numerob, float numeroc) {

        float raiz = 0f;

        raiz = (float) ((-1 * numerob + Math.sqrt(delta)) / 2 * numeroa);

        return raiz;
    }
    
    
    public float calculaRaizx1(float delta, float numeroa, float numerob, float numeroc){
        
        float x1 = 0f;
        x1 = (float) ((-1 * numerob + Math.sqrt(delta)) / 2 * numeroa);
        return  x1;
    }
    
    public float calculaRaizx2(float delta, float numeroa, float numerob, float numeroc){
        
        float x2 = 0f;
        x2 = (float) (( -1 * numerob - Math.sqrt(delta)) / 2 * numeroa);
        return  x2;
    }


}
