import java.awt.Color;
import java.util.*;

public class TurtleLab

{   // make turtle
    World myWorld = new World(1920, 1080);
    Turtle wumbo = new Turtle(myWorld);
    Turtle argon = new Turtle(myWorld);
    Turtle turtle = new Turtle(myWorld);
    public void TurtleRecursion(int sideNum, int sideLen) {
        wumbo.hide();
        wumbo.setPenColor(Color.BLUE);
        argon.hide();
        argon.setPenColor(Color.CYAN);
        
        // making a recursive polygon
        for (int i = 0;  i < sideNum; i++) {
                  
           
                      
            int angle = (360/sideNum);
            wumbo.forward(sideLen);
            wumbo.turn(angle);
            argon.forward(sideLen);
            argon.turn(angle);
            turtle.forward(sideLen);
            turtle.turn(angle);
        }
           wumbo.forward(2);
           wumbo.turn(4);
           wumbo.forward(5);
           argon.forward(8);
           argon.turn(-4);
           argon.forward(-6);
           turtle.forward(4);
           turtle.turn(3);
           turtle.backward(8);
           
           
           try {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            TurtleRecursion(sideNum, sideLen-2);
          
        
        
    }
}
