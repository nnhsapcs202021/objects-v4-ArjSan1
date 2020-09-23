
/**
 * Write a description of class ConcatDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConcatDemo
{
    public static void main(String[] args)
   {
      String animal1 = new String( "quick brown fox " );
      String animal2 = new String( "lazy dog" );
      String article = new String( "the " );
      String action = new String( "jumps over " );
      String message = article.concat(animal1).concat(action).concat(article).concat(animal2);
      System.out.println(message);
   }
}
