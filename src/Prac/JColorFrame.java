package Prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JColorFrame extends JFrame implements ActionListener
{
   private JPanel np = new JPanel();
   private JPanel sp = new JPanel();
   private JPanel ep = new JPanel();
   private JPanel wp = new JPanel();
   private int count = 0;
   private JColorFrame()
   {
      super("JColorFrame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container con = this.getContentPane();
      con.setLayout(new BorderLayout());
      Button colorButton = new Button("Change");
      JPanel cp = new JPanel();
      cp.add(colorButton);
      con.add(np, BorderLayout.NORTH);
      con.add(sp, BorderLayout.SOUTH);
      con.add(ep, BorderLayout.EAST);
      con.add(wp, BorderLayout.WEST);
      con.add(cp, BorderLayout.CENTER);
      colorButton.addActionListener(this);
   }
   public static void main(String[] args)
   {
      JColorFrame cFrame = new JColorFrame();
      cFrame.setSize(350,250);
      cFrame.setVisible(true);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      if(count%5 == 0)
         np.setBackground(Color.GREEN);
      else if(count%5==1)
         ep.setBackground(Color.MAGENTA);
      else if(count%5==2)
         wp.setBackground(Color.ORANGE);
      else if(count%5==3)
         sp.setBackground(Color.RED);
      else
      {
         ep.setBackground(Color.WHITE);
         sp.setBackground(Color.WHITE);
         np.setBackground(Color.WHITE);
         wp.setBackground(Color.WHITE);
      }
     ++count;
   }
}