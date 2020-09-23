
/**
 * Write a description of class AddTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Rectangle;
public class AddTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 20, 30); box.add(0, 0);
        System.out.println("The expected location, width, and height of this box is" + box);
        System.out.print("The actual location, width, and height of the box is" + box);
    }
}
