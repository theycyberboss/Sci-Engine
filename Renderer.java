
/**
 * Write a description of class Renderer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.image.*;

public class Renderer
{
    private Canvas canvas;
    private Graphics2D g;
    private BufferStrategy bs;
    
    public Renderer(Window window)
    {
        canvas = new Canvas();
        canvas.setSize(window.getWidth(),window.getHeight());
       
    }
    
    public void init()
    {
        canvas.createBufferStrategy(4);
    }
    
    public Canvas getCanvas()
    {
        return canvas;
    }
    
    public void updateGraphics()
    {    
        
        bs = canvas.getBufferStrategy();
        g = (Graphics2D) bs.getDrawGraphics();      
        g.setColor(Color.black);
        g.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
        
       
        
    }
    
    public void cleanUp()
    {
        bs.show();
        g.dispose();
    }
    
    public Graphics2D getGraphics()
    {
        return g;
    }
    
}
