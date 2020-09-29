import java.awt.Color;
import java.util.*;

public class TurtleLab

{   // make turtle
    World myWorld = new World(1920, 1080);
    Turtle wumbo = new Turtle(myWorld);
    public void TurtleRecursion(int sideNum, int sideLen) {
      
        // making a recursive polygon
        for (int i = 0;  i <= sideNum; i++) {
                  if (sideLen < 2){
                    break;
                }
           
                      
            int angle = (360/sideNum);
            wumbo.forward(sideLen);
            wumbo.turn(angle);
            TurtleRecursion(sideNum, sideLen-2);
          
        }
        
    }
}
