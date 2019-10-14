package Prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JMovingFrame extends JFrame implements ActionListener
{
   private final int MAX = 8;
   private JLabel[] blankLabel = new JLabel[MAX];
   private int x = 0;

   private JMovingFrame()
   {
      Container con = getContentPane();
      con.setLayout(new GridLayout(3,3));
      setTitle("Moving Frame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JButton button = new JButton("Press");
      con.add(button);
      button.addActionListener(this);
      int y;
      for(y = 0; y < MAX; ++y)
      {
         blankLabel[y] =  new JLabel("        ");
         JPanel[] panel = new JPanel[8];
         panel[y] = new JPanel();
         con.add(panel[y]);
         panel[y].add(blankLabel[y]);
      }
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      blankLabel[x].setText("        ");
      ++x;
      if(x == MAX)
         x = 0;
      blankLabel[x].setText("I'm here");
   } 
  
   public static void main(String[] args)
   {
      JMovingFrame mFrame = new JMovingFrame();
      mFrame.setSize(250, 300);
      mFrame.setVisible(true);
   }
}
