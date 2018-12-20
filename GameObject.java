
/**
 * Write a description of interface GameObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface GameObject
{
    public void render(Game game);
    public void update(Game game);
    
    public void setX(int x);
    public void setY(int y);
    
    public int getX();
    public int getY();
}
