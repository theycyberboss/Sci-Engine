
/**
 * Write a description of class Handler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
public class Handler
{
    private LinkedList<GameObject> objects;
    private int objectCount;
    
    public Handler()
    {
        objects = new LinkedList<GameObject> ();
        objectCount = 0;
    }
    
    public void addObject(GameObject o)
    {
        objects.add(o);
        objectCount++;
    }
    
    public void removeObject(GameObject o)
    {
        objects.remove(o);
        objectCount--;
    }
    
    public void update(Game game)
    {
        for(int i = 0; i < objectCount; i++)
        {
            GameObject temp = objects.get(i);
            temp.update(game);
        }
    }
    
    public void render(Game game)
    {
        for(int i = 0; i < objectCount; i++)
        {
            GameObject temp = objects.get(i);
            temp.render(game);            
        }
        
    }

}
