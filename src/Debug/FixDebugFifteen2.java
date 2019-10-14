package Debug;// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FixDebugFifteen2 extends JFrame
{

   private FixDebugFifteen2()
   {
      Container con = this.getContentPane();
      con.setLayout(new BorderLayout());
      // include layout positions ("North", etc) in add() method calls
      // Use button labels that correspond to the positions in the layout
      JButton nb = new JButton("Up    ");
      con.add(nb, BorderLayout.NORTH);
      JButton sb = new JButton("Down  ");
      con.add(sb, BorderLayout.SOUTH);
      JButton eb = new JButton("Right ");
      con.add(eb, BorderLayout.EAST);
      JButton wb = new JButton("Left  ");
      con.add(wb, BorderLayout.WEST);
      JButton cb = new JButton("Center");
      con.add(cb, BorderLayout.CENTER);
   }
   public static void main(String[] args)
   {
      FixDebugFifteen2 f = new FixDebugFifteen2();
      f.setSize(300, 300);
      f.setVisible(true);
   }
}