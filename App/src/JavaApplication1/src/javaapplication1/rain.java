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
public class rain extends Applet {
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
    {int a,i,j,k,l;
    for(a=1;a>=0;a++)
    {r=(int)(Math.round(Math.random()*255));
    g1=(int)(Math.round(Math.random()*255));
    b=(int)(Math.round(Math.random()*255));
    c=new Color(r,g1,b);
    i=(int)(Math.round(Math.random()*300));
    k=(int)(Math.round(Math.random()*20));
    j=(int)(Math.round(Math.random()*300));
    g.setColor(c);
    g.drawLine(i,j,i-k,j+k);
    try
    {Thread.sleep(100);
    }
    catch(Exception e)
    {}
    }
    }

    // TODO overwrite start(), stop() and destroy() methods
}
