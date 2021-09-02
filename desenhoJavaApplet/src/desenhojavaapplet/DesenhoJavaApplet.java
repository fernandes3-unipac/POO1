/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenhojavaapplet;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author pedro
 */
public class DesenhoJavaApplet extends JApplet {
    TextField T1 = new TextField("FLAMENGO");
    @Override
    public void paint(Graphics g) {
        
        
        /*  PLACAR */
        g.setColor(Color.black);
        g.drawString(" FLAMENGO                                        3 X 1                                       VASCO", 330, 45);
        g.setColor(Color.black);
        g.drawRect(325, 5,400, 70);
        
        Color c = new Color(33, 94, 33);
        /* CAMPO */
        g.setColor(c);
        g.fillRect(100, 100, 848, 405);

        g.setColor(Color.white);
        g.drawRect(120, 118, 800, 370);

        /*  PEQUENA AREA / GRANDE AREA*/
        g.drawRect(120, 200, 130, 200);
        g.drawRect(120, 250, 50, 100);
        g.drawRect(870, 250, 50, 100);
        g.drawRect(790, 200, 130, 200);

        /* GOL */
        g.drawRect(100, 270, 20, 60);
        g.drawRect(920, 270, 20, 60);

        /* MEIO CAMPO */
        g.setColor(Color.white);
        g.drawOval(430, 215, 150, 150);
        g.drawLine(505, 500, 505, 100);
        g.setColor(Color.white);
        g.drawOval(500, 285, 10, 10);
        g.drawOval(500, 285, 10, 10);
        g.fillOval(190, 295, 10, 10);
        g.fillOval(835, 295, 10, 10);

        /*  ESCANTEIO */
        g.drawArc(100, 100, 35, 35, 360, -80);
        g.drawArc(900, 98, 35, 35, 635, -80);
        g.drawArc(900, 470, 35, 35, 545, -100);
        g.drawArc(100, 470, 35, 35, 442, -90);

        /* Jogadores */
        g.setColor(Color.black);
        /*Zagueiros*/
        g.fillRect(130, 300, 10, 10);
        g.fillRect(260, 340, 10, 10);
        
        /*Laterais*/
        g.fillRect(260, 250, 10, 10);
        g.fillRect(290, 140, 10, 10);
        
        /* VOlantes/MEIO */
        g.fillRect(290, 450, 10, 10);
        g.fillRect(350, 295, 10, 10);
        g.fillRect(420, 250, 10, 10);
        
        g.fillRect(420, 330, 10, 10);
        g.fillRect(475, 140, 10, 10);
        g.fillRect(475, 450, 10, 10);
        g.fillRect(500, 295, 10, 10);
        
        
        g.setColor(Color.red);
        g.fillRect(900, 300, 10, 10);
        g.fillRect(750, 340, 10, 10);
        g.fillRect(750, 250, 10, 10);
        
        g.fillRect(730, 450, 10, 10);
        g.fillRect(730, 140, 10, 10);
       
        
        g.fillRect(550, 450, 10, 10);
        g.fillRect(550, 140, 10, 10);

        
        g.fillRect(530, 300, 10, 10);
        g.fillRect(650, 280, 10, 10);
        g.fillRect(600, 250, 10, 10);
        g.fillRect(600, 325, 10, 10);
        /* JOGADORES*/
        
        /*  ARQUIBANCADA */
        
        g.setColor(Color.black);
        g.fillRect(200, 640, 650, 30);
        g.drawRect(220, 620,620, 30);
        g.drawRect(240, 590,590, 30);
         g.drawRect(250, 560,560, 30);
    }

    @Override
    public void init() {
        
        setSize(1500, 1000);
        
    }

}
