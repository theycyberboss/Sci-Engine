
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
    private static LinkedList<GameObject> objects;
    private static int objectCount;
    
    public Handler()
    {
        objects = new LinkedList<GameObject> ();
        objectCount = 0;
    }
    
    public static void addObject(GameObject o)
    {
        objects.add(o);
        objectCount++;
    }
    
    public static void removeObject(GameObject o)
    {
        objects.remove(o);
        objectCount--;
    }
    
    public void update(Engine eng)
    {
        for(int i = 0; i < objectCount; i++)
        {
            GameObject temp = objects.get(i);
            temp.update(eng);
        }
    }
    
    public void render(Engine eng)
    {
        for(int i = 0; i < objectCount; i++)
        {
            GameObject temp = objects.get(i);
            temp.render(eng);            
        }
        
    }

}
