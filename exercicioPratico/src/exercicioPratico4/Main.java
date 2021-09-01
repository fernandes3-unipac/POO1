/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPratico4;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Main {

    public static void main(String args[]) {
        float valorDelta = 0f;
        bhaskara equacao;
        equacao = new bhaskara();

        equacao.numeroa = Float.parseFloat(JOptionPane.showInputDialog("Dada a equação ax\u00B2" + " + "
                + " bx " + " + " + " c " + " = 0" + "\n" + "Digite o valor de a: "));

        equacao.numerob = Float.parseFloat(JOptionPane.showInputDialog("Dada a equação ax\u00B2" + " + "
                + " bx " + " + " + " c " + " = 0" + "\n" + "Digite o valor de b: "));

        equacao.numeroc = Float.parseFloat(JOptionPane.showInputDialog("Dada a equação ax\u00B2" + " + "
                + " bx " + " + " + " c " + " = 0" + "\n" + "Digite o valor de c: "));
        if (equacao.numeroa != 0 && equacao.numerob != 0 && equacao.numeroc != 0) {
            valorDelta = equacao.calculaDelta(equacao.numeroa, equacao.numerob, equacao.numeroc);

            if (equacao.validaDelta(valorDelta)) {
                if (valorDelta == 0) {

                    JOptionPane.showMessageDialog(null, "Dada a equação digitada : " + "\n" + equacao.numeroa + "x\u00B2"
                            + " + " + equacao.numerob + "x" + " + " + equacao.numeroc + " = 0 "
                            + "As raizes da equação são : " + "\n" + "x1 = "
                            + equacao.calculaRaiz0(valorDelta, equacao.numeroa, equacao.numerob, equacao.numeroc)
                            + "x2 = " + equacao.calculaRaiz0(valorDelta, equacao.numeroa, equacao.numerob, equacao.numeroc));
                } else {
                    JOptionPane.showMessageDialog(null, "Dada a equação digitada : " + "\n" + equacao.numeroa + "x\u00B2"
                            + " + " + equacao.numerob + "x" + " + " + equacao.numeroc + " = 0 "
                            + "\n"+ "As raizes da equação são : " + "\n" + "x1 = "
                            + equacao.calculaRaizx1(valorDelta, equacao.numeroa, equacao.numerob, equacao.numeroc)
                            + " x2 = " + equacao.calculaRaizx2(valorDelta, equacao.numeroa, equacao.numerob, equacao.numeroc));
                }

            } else {
                JOptionPane.showMessageDialog(null, "Não possui raiz real!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Não é uma equação de segundo grau");

        }

    }

}
