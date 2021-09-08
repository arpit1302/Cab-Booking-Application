/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author surin
 */
public class app1 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */

    public void init() {
       
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
g.drawOval(100,100,100,100);
g.setColor(Color.green);
g.drawOval(90,140,10,25);
g.drawOval(200,140,10,25);
g.setColor(Color.orange);
g.drawArc(133,160,35,25,180,180);
g.setColor(Color.pink);
g.fillOval(112,125,25,10);
g.fillOval(162,125,25,10);
g.setColor(Color.blue);
g.drawLine(150,50,110,120);
g.drawLine(150,50,190,120);
g.setColor(Color.pink);
g.drawLine(150,140,150,170);
g.drawLine(150,170,140,160);
    
}
}
    
