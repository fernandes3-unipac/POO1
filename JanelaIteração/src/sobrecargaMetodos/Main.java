/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaMetodos;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author pedro
 */
public class Main {
    
    public static void main (String args[]){
        
        
        mercadoria arroz = new mercadoria("Arroz",32.90);
        arroz.setDesconto(1.30);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String strPreco = df.format(arroz.getPreco()).replace(',','.');
        System.out.println(strPreco);
        double novoPreco = Double.parseDouble(strPreco);
        System.out.println(novoPreco);
        
       Date dataAtual = new Date();
       System.out.println(dataAtual);
       System.out.println(dataAtual.getDate());
       dataAtual.setDate(23);
       System.out.println(dataAtual);
       Date dataValidade = new Date(2021,7,20);
       
        medicamento dipirona;
        dipirona = new medicamento(200.0,Color.yellow, dataValidade, "Dipirona", 9.9);
        System.out.println(dipirona.getDataValidade());
        System.out.println(dipirona.getDataValidadeFormatada());        
       
    }
    
}
