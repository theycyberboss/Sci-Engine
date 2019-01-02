
/**
 * Write a description of interface GameObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface GameObject
{
    public void render(Engine eng);
    public void update(Engine eng);
    
    public void setX(int x);
    public void setY(int y);
    
    public int getX();
    public int getY();
}
