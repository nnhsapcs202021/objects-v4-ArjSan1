import java.awt.Color;
import java.util.*;

public class TurtleLab

{   
    World myWorld = new World(1920,1080); // make world
    // make turtles
    Turtle wumbo = new Turtle(myWorld);
    Turtle argon = new Turtle(myWorld);
    Turtle turtle = new Turtle(myWorld);
    Turtle t = new Turtle(myWorld);
    Turtle u = new Turtle(myWorld);
    Turtle r = new Turtle(myWorld);
    public void TurtleRecursion(int sideNum, int sideLen) {
        // Various methods
        wumbo.hide();
        wumbo.setPenColor(Color.BLUE);
        wumbo.setPenWidth(3);
        argon.hide();
        argon.setPenColor(Color.RED);
        argon.setPenWidth(3);
        turtle.hide();
        turtle.setPenColor(Color.GREEN);
        turtle.setPenWidth(3);
        t.hide();
        t.setPenColor(Color.ORANGE);
        t.setPenWidth(3);
        u.hide();
        u.setPenColor(Color.BLACK);
        u.setPenWidth(3);
        r.hide();
        r.setPenColor(Color.MAGENTA);
        r.setPenWidth(3);
        // Recursive Algorithm
        for (int i = 0;  i < sideNum; i++) {
            int angle = (360/sideNum);       
            t.forward(sideLen);
            t.turn(angle);
            turtle.forward(sideLen);
            turtle.turn(angle);
            argon.forward(sideLen);
            argon.turn(angle);
            wumbo.forward(sideLen);
            wumbo.turn(angle);
            u.forward(sideLen);
            u.turn(angle);
            r.forward(sideLen);
            r.turn(angle);
        }
        // Methods to make turtle move
        r.forward(1);
        r.turn(4);
        
        u.forward(2);
        u.turn(4);
        
        t.forward(3);
        t.turn(4);
        
        
        wumbo.forward(4);
        wumbo.turn(4);
        
        
        argon.forward(5);
        argon.turn(4);
        
        
        turtle.forward(6);
        turtle.turn(4);
        
        
        // Slow down the turtles
        
        try {
            Thread.sleep(100);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        // Run the method
        TurtleRecursion(sideNum, sideLen+2);
    }   

}

