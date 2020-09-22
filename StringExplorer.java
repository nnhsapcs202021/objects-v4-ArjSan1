
/**
 * Exploring the String class and its methods.
 *
 * @author Arjun
 * @version 22sep2020
 */
public class StringExplorer
{
    public static void main(String[] args)
    {
        String river = new String("Mississippi");
        String river2 = "Mississippi"; // String Literal
        String riverX = river.replace("i", "x");
        System.out.println(riverX);
        
        /*
         * The replace method returns a reference to a new String.
         *  It does not chanfge the String object on which it is invoked.
         * The Syting class has no mutator methods. It is not possible to change a String Object
         *  Strings are immutable
         *  
         */
        
        
        
    }
}
