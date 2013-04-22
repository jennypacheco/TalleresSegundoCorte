/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author sala4
 */
import java.awt.Color;
import java.awt.Graphics;
import sun.java2d.Surface;

public class DrawGraphics {
    BouncingBox box;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
       box = new BouncingBox(200, 50,Color.blue);
       //box.setMovementVector(1, 0);
 
        
        
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
       // surface.drawLine(50, 50, 250, 250);
        
        box.draw(surface);
        surface.drawOval(110, 180, 15, 15);
        surface.drawOval(120, 150, 20, 20);
        surface.drawOval(140, 105, 40, 40);
        surface.drawString("Hola", 150, 130);
        surface.drawOval(50, 200, 100, 100);
        surface.drawOval(70, 220, 20, 20);
        surface.drawOval(90, 220, 20, 20);
        surface.drawArc(65, 250, 70, 50, 50, 360);
        surface.drawOval(85, 270, 30, 50);
        surface.setColor(Color.red);
        
    }  
} 