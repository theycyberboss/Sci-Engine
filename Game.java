
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;

public class Game implements Runnable
{
   private Window window;
   private Renderer renderer;
   private boolean isRunning;
   private Thread thread;
   
   private int fps;
   
   private Player player;
   private Handler handler;
   private Keyboard keyboard;
   private Mouse mouse;
    
   public Game()
   {
       engineInit();
       gameInit();
   }
   
   public void engineInit()
   { 
       handler = new Handler();
       keyboard = new Keyboard();
       mouse = new Mouse();
       isRunning = false;
       fps = 0;
       
       window = new Window(720,480,"New Window");
       renderer = new Renderer(window);
       window.addComponent(renderer.getCanvas());
       
       renderer.getCanvas().addKeyListener(keyboard);
       renderer.getCanvas().addMouseListener(mouse);
       renderer.getCanvas().addMouseMotionListener(mouse);
       renderer.init();    
       

   }
   
   public void gameInit()
   {
       player = new Player(100,100);
       
       handler.addObject(player);

   }
   
   private void update()
   {
      handler.update(this);
   }
   
   private void render()
   {
       renderer.resizeGraphics(window.getBaseWidth(),window.getBaseHeight(),window.getWidth(),window.getHeight());
       
       Graphics2D g = renderer.getGraphics();
       g.setColor(Color.black);
       g.fillRect(0,0,100,100); 
       
       handler.render(this);
       
       g.setColor(Color.yellow);
       g.drawString("FPS: " + fps,10,20);
       
   }
   
   public synchronized void start()
   {
       thread = new Thread(this);
       thread.start();
       isRunning = true;
   }
   
   public synchronized void stop()
   {
        try{
           thread.join();
           isRunning = false;
        }catch(Exception e)
        {
            
        }
   }
   
   public void run()
   {
      long lastTime = System.nanoTime();
      double amountOfTicks = 60.0;
      double ns = 1000000000 / amountOfTicks;
      double delta = 0;
      long timer = System.currentTimeMillis();
      int frames = 0;
      while(isRunning) {
       long now = System.nanoTime();
       delta += (now - lastTime) / ns;
       lastTime = now;
       
       
       
       while(delta >= 1) {
        update();
        //updates++;
        delta--;
       }
       renderer.updateGraphics();
       render();
       renderer.cleanUp();
       frames++;

       if(System.currentTimeMillis() - timer > 1000) {
        timer += 1000;
        fps = frames;
        frames = 0;
        //updates = 0;
       }
       
       
      }
      stop();
       
   }
   
   public Renderer getRenderer()
   {
       return renderer;
   }
   
    
}
