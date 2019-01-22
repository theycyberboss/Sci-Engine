
/**
 * Write a description of class Launcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Launcher
{
    public static void main(String[] args)
    {
        MainGame Game = new MainGame();
        
        
        Engine mainEngine = new Engine(Game,720,480,"Game Engine",true);
        
        mainEngine.start();
    }
}
