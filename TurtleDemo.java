/*
* Every Java program contains one or more classes (e.g., TurtleDemo)
*
* In general every source file (e.g., TurtleDemo.java) contains one class (e.g. TurtleDemo)
*
* The Source file name must match the class name.
*
*
* By convention. class names start with an uppercase letter.
* 
* @author ArjSan1
* @version 09 Sept 2020
* method- an action that is associated with an object, they are unique to every object.
* statements - located in the body of a method, statements are necessary for invoking other things
* 
* {} - used to group code together
* 
* ; - statements end in a semicolon
* 
* comments - // - comment extends to end of line
* /* - comments extends until closing comment symbol
*   
*  
*/

import java.awt.Color;

public class TurtleDemo 
{
    /*
     * A class contains methods
     * 
     * 
     * Most Java programs contain a class with a main method
     * 
     * 
     *  The main method is executed when the program starts.
     *  
     */
    
    
    public static void main(String[] args)
    {
        World ocean = new World(); // Like the canvas for drawing on with Turtle objects
        Turtle crush = new Turtle(ocean); // place a new Turtle into the 'ocean' world
        Turtle leo = new Turtle(ocean); // a second Turtle
        crush.setPenColor(Color.BLUE);
        crush.penDown();
        crush.forward(50);
        
        /*
         * A method contains statements
         * 
         * Statements may invoke other methods (e.g., forward).
         * 
         * In general, methods are invoked on objects (e.g., crush).
         * 
         * When invoking a method, arguements are passed in parantheses (e.g., 50). 
         * 
         */
        
        crush.forward(25); // the crush object will move forward by 25 pixels
        
        
    }
}
