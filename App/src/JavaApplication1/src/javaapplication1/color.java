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
public class color extends Applet {
    int r,g1,b;
    Color c;
    

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {r=(int)(Math.round(Math.random()*255));
    g1=(int)(Math.round(Math.random()*255));
    b=(int)(Math.round(Math.random()*255));
    c=new Color(r,g1,b);
    setBackground(Color.cyan);
    setForeground(Color.magenta);
    g.drawString("Colorfull Umbrella",160,125);
    g.setColor(c);
    g.fillArc(10,10,120,120,0,180);
    g.setColor(Color.blue);
    g.drawLine(70,70,70,175);
    g.drawArc(70,154,40,40,0,-180);
    try
    {Thread.sleep(1000);
    g.clearRect(0,0,270,250);
    repaint();
    }
    catch(Exception e)
    {}
    }
    

    // TODO overwrite start(), stop() and destroy() methods
}
