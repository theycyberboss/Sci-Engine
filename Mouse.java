
/**
 * Write a description of class Mouse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.event.*;

public class Mouse extends MouseAdapter
{
  private static boolean mouseClicked,mousePressed,mouseReleased;
  private static int mx,my;
  private int clickCount,pastClickCount;
  private static boolean wasPressed;
    
    
  public Mouse()
  {
      mx = 0;
      my = 0;
      clickCount = 0;
      pastClickCount = 0;
      wasPressed = false;
      
      
      mouseClicked = false;
      mousePressed = false;
      mouseReleased = false;
  }
  
  public void mouseClicked(MouseEvent e)
  {
      
  }
  
  public void mouseDragged(MouseEvent e)
  {
      mx = e.getX();
      my = e.getY(); 
  }
  
  public void mouseMoved(MouseEvent e)
  {
      mx = e.getX();
      my = e.getY();
  }
  
  public void mousePressed(MouseEvent e)
  {
      wasPressed = false;
      mousePressed = true;
      mouseReleased = false;
  }
  
  public void mouseReleased(MouseEvent e)
  {
      wasPressed = true;
      
      mousePressed = false;
      mouseReleased = true;
  }
  
  public static boolean isClicked()
  {
      if(mouseReleased && wasPressed)
      { 
          wasPressed = false;
          return true;
      }
      
      return false;
  }
  
  public static boolean isPressed()
  {
      return mousePressed;
  }
  
  public static boolean isReleased()
  {
      return mouseReleased;
  }
  
  public static int getX()
  {
      return mx;
  }
  
  public static int getY()
  {
      return my;
  }
  
}
