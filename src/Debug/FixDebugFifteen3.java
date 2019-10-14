package Debug;// Lets user type keys
// Displays each key typed
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class FixDebugFifteen3 extends JFrame implements KeyListener
{
   char key;
   private JLabel label = new JLabel("Key Typed:");

   private FixDebugFifteen3()
   {
      setTitle("Debug Key Frame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container con = this.getContentPane();
      GridLayout grid = new GridLayout(2, 1);
      con.setLayout(grid);
      JTextArea textArea = new JTextArea(4, 25);
      con.add(textArea);
      con.add(label);
      addKeyListener(this);
      textArea.addKeyListener(this);
   }

   @Override
   public void keyTyped(KeyEvent e)
   {
      char c = e.getKeyChar();
      label.setText ("Key Typed: " + c);
   }
   @Override
   public void keyPressed(KeyEvent e)
   {
   }

   @Override
   public void keyReleased(KeyEvent e)
   {
   }

   public static void main(String[] args)
   {
      FixDebugFifteen3 kFrame = new FixDebugFifteen3();
      kFrame.setSize(300, 200);
      kFrame.setVisible(true);
   }
}


