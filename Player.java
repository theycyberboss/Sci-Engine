
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
public class Player implements GameObject
{
    private int x,y;
    
    public Player(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    
    public void render(Engine eng)
    {
        Graphics2D g = eng.getRenderer().getGraphicsScaled();
        
        g.setColor(Color.red);
        g.fillRect(x,y,32,32);
    }
    
    public void update(Engine eng)
    {
        if(Mouse.isClicked())
        {
            x = Mouse.getX();
        }
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}
