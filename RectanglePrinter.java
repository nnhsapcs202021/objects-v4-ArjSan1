
/**
 * Write a description of class RectanglePrinter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
   import java.awt.Rectangle;

public class RectanglePrinter
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0, 0, 100, 50);
      Rectangle r2 = new Rectangle(0,0,100,50);
      System.out.println(r1);
      r2.grow(10,20);
      r2 = r1;
   }
}
/*
 * The out put for the first 4.1 and 4.2 is the rectangle r1
 * 
 * The output for 4.3 is still r1, because now both r2 and r1 are referencing the object rectange r1
 * 
 */

