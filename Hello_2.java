
/**
 * Write a description of class Hello_2 here.
 *
 * @author Arjun
 * @version 9/14/2020
 */
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Hello_2
{
    public static void main(String[] args) throws Exception
    {
      URL imageLocation = new URL("https://horstmann.com/violet/violet.jpg");
        JOptionPane.showMessageDialog(null, "Yo", "Title", JOptionPane.PLAIN_MESSAGE,
            new ImageIcon(imageLocation));
        
}
}