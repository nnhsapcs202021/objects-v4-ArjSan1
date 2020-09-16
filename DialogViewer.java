
/**
 * Target: Type, compile, run, and modify a provided Java program in the BlueJ development environment.
 *
 * @author Arjun
 * @version 9/14/20
 */
import javax.swing.JOptionPane;
public class DialogViewer
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
      System.out.println("Hello" + " " + name + "!");
}
}