
/**
 * Write a description of class Window here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import javax.swing.*;

public class Window
{
   private JFrame frame;
   private int baseWidth,baseHeight;
    
   public Window(int width, int height, String title)
   {
       frame = new JFrame(title);
       
       baseWidth = width;
       baseHeight = height;
       
       Dimension dim = new Dimension(width,height);
       frame.setPreferredSize(dim);
       //frame.setMaximumSize(dim);
       frame.setMinimumSize(dim);
       
       frame.setResizable(true);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
   }
   
   public void addComponent(Component c)
   {
       frame.add(c);
   }
   
   public int getWidth()
   {
       return frame.getWidth();
   }
   
   public int getHeight()
   {
       return frame.getHeight();
   }
   
   public int getBaseWidth()
   {
       return baseWidth;
   }
   
   public int getBaseHeight()
   {
       return baseHeight;
   }
}
