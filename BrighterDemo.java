import java.awt.Color; import javax.swing.JFrame; 
public class BrighterDemo
{
    public static void main(String[] args)
    {
      Color color = new Color(50,100,150);
      color = color.brighter();
      System.out.print(color);
      JFrame frame = new JFrame();
      frame.setSize(200, 200);   
      frame.getContentPane().setBackground(color);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true); 
    }

}
