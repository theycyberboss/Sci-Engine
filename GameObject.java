
/**
 * Write a description of interface GameObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.awt.geom.*;
public abstract class GameObject
{
    private AffineTransform old;
    private double rotation = 0;
    
    private int x,y;
    
    public abstract void render(Engine eng);
    public abstract void update(Engine eng);
    
    public abstract void setX(int x);
    public abstract void setY(int y);
    
    public abstract int getX();
    public abstract int getY();
    
    public void setRotation(double degrees){
        rotation = degrees;
         
    }
    
    public AffineTransform getTransform(){
        return old;
    }
    
    public void setTransform(AffineTransform at){
        old = at;
    }
    
    public double getRotation(){
        return rotation;
    }
  
    

    
}
