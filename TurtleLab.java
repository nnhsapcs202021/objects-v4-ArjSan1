import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World myWorld = new World(1000, 1000);

        Turtle wumbo = new Turtle(myWorld);
        wumbo.setPenColor(Color.RED);
        wumbo.penDown();
        wumbo.hide();
        wumbo.forward(100);

    }
}
