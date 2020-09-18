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
        crush.setPenColor(Color.ORANGE);
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

        /*
         * Identifiers are any combination of:
         * letters
         * digits (but not as first character)
         * underscores (_)
         * dollar signs ($)
         * 
         * These are the various identifiers:

         */

        int y, x2, x_y, x$;

        // This is not a valid identifier:
        // int 2y;

        /*
         * Identifiers are case sensitive (case matters).
         * 
         * These are different:
         * 
         */
        Turtle squirt, SQUIRT, SqQuiRt;

        /*
         * By convention, constant values are all uppercase. Use an underscore between words
         * 
         */
        int SPEED_OF_LIGHT = 300000000; // m/s

        /*
         * By convention, most identifiers start with a lowercase letter.
         * Subsequent words start with an uppercase letter (CamelCase)
         */

        World pacificOcean;

        
    }

    public static void drawLine()
    {
        /*
         * Objects are entities in a program
         * Objects have attributes
         * Objects are manipulated by invoking methods
         * 
         * ocean and crush are now variables that refernce objects
         * 
         * Classes describe a collection of objects
         *  All ovjects of a class have the same behavior (method).
         *      and they have the sane type of attributes (but they may have different values).
         * 
         * World and Turtle are classes
         */
        World ocean = new World();
        
        /*
         * We use the new operator to construct (create, instantiate) an object.
         * 
         * The class of the object specified immediately after the new operator (e.g. Turtle)
         * 
         * If we need to pass additianal information to contruct the object, arguements are
         *  specficied in parantheses after the class (e.g. ocean)
         */
        Turtle crush = new Turtle(ocean);
        /*
         * Variables store values to be used later
         *  Variables have a type (e.g. int), a name (e.g., width) and a value (e.g., 20)
         *  
         */
        int width; // declaring a variable
        width = 20; // assigning a value to a variable
        
        int width2, width3, width4; //assign multiples variables
        /*
         * Java has severak primitive data types
         *  booolean holds a value of true or false
         *  int holds an integer number
         *  double holds a real number (floating point)
         *  char holds a single character
         *  
         *  
         */
        // here is a boolean
        boolean isSummer = true;
        
        //here is a double
        double salesTaxRate = 0.075;
        
        //here is a char
        char letter = 'c';
        
        /*
         * When invoking methods we use the dot operator ('.') to invoke a method on an object
         * Some methods take no arguemths but still have parantheses (penDown)
         * Some methods take one ore more arguements
         * Mutator methods modify the state of the object
         */
        crush.penDown();
        crush.forward(50);
        crush.setPenColor(Color.RED);
        crush.forward(150);
        
        /*
         * Accesor method returns the cavalue of an attribue of the object
         *  The state of the object does not change
         *  
         *  getPenWidth is an accesor method
         */
        int penWidth = crush.getPenWidth();
    }
}
