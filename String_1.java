
/**
 * Write a description of class String_1 here.
 *
 * @author Arjun
 * @version 22sep2020
 */
public class String_1
{
   public static void main(String[] args)
    {
    String greeting = new String("Hello, World!");
    int n = greeting.length();
    
    String river = new String( "Mississippi" );
    String bigRiver = river.toUpperCase();
    String newString = new String("This is a Test");
    String lowercase = newString.toLowerCase();
    System.out.println(lowercase);
    // Replace "smallTestString" with the name you used for your lowercase string
    lowercase = new String( "whisper" );
    String bigTestString = lowercase.toUpperCase(); 
    System.out.println(bigTestString);
} // makes the statement uppercase
}
    
