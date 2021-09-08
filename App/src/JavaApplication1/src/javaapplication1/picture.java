/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.applet.Applet;
import java.awt.*;
import java.net.*;

/**
 *
 * @author surin
 */
public class picture extends Applet {
    Image i;
    URL u;
    int w,h;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        u=getCodeBase();
        System.out.println(u);
        i=getImage(u,"pic1.jpg");
        w=getWidth();
        h=getHeight();
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {showStatus("width="+w+"height="+h);
    g.drawImage(i,0,0,w,h,this);
    }


    // TODO overwrite start(), stop() and destroy() methods
}
