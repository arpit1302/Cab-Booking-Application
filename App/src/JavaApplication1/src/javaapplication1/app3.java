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
public class app3 extends Applet {
    int x1[]={0,66,166,232,166,66,0};
    int y1[]={50,0,0,50,100,100,50};
    int n=7;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {g.drawPolygon(x1,y1,n);
    }
    }

    // TODO overwrite start(), stop() and destroy() methods

