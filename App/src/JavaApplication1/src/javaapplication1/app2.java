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
public class app2 extends Applet {


    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
   
    public void init() {
        resize(1000,1000);
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {
    int i;
    g.setClip(30,30,400,400);
    for(i=0;i<=1000;i=i+10)
    {g.setColor(Color.red);
    g.drawOval(100,i,100,100);
    try
    {Thread.sleep(100);
    }
    catch(Exception e)
    {
    }
    g.setColor(Color.white);
    g.drawOval(100,i,100,100);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
}
