

public class NumberVariablesPrinter
{
   public static void main(String[] args)
   {
      double n1 = 150;
      double n2 = n1;

      n2 = n2 * 20; // Grow n2

      System.out.println(n1);
      System.out.println(n2);
   }
}
// The output for this program will be 150 and 3000, because at first n1 is 150, and because we changed 
  // changed the variable n2 to store 150*20, n2 will print 3000.  