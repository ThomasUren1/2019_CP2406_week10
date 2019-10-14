package Prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JFontSelector extends JFrame implements ActionListener
{
   private final int SMALL = 12;
   private int size = SMALL;
   private boolean isSmaller = true;
   private JButton hButton = new JButton("Helvetica");
   private JButton tButton = new JButton("Times Roman");
   private JButton cButton = new JButton("Courier");
   private JButton sButton = new JButton("Algerian");
   private JButton aButton = new JButton("Arial");
   private JButton sizeButton = new JButton("Larger/Smaller");
   private Font cFont = new Font("Courier", Font.PLAIN, size);
   private Font hFont = new Font("Helvetica", Font.PLAIN, size);
   private Font tFont = new Font("TimesRoman", Font.PLAIN, size);
   private Font sFont = new Font("Algerian", Font.PLAIN, size);
   private Font aFont = new Font("Arial", Font.PLAIN, size);
   private Font myFont = cFont;
   private JLabel label = new JLabel("Font demonstration message");
   private JFontSelector()
   {
      setTitle("JFontFrame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
      setLayout(new FlowLayout());
      add(hButton);
      add(tButton);
      add(cButton);
      add(sButton);
      add(aButton);
      add(sizeButton);
      add(label);
      label.setFont(cFont);
      Panel p = new Panel();
      add(p);
      hButton.addActionListener(this);
      tButton.addActionListener(this);
      cButton.addActionListener(this);
      sButton.addActionListener(this);
      aButton.addActionListener(this);
      sizeButton.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      if(e.getSource() == hButton)
      {
        myFont = hFont;
      }
      else if(e.getSource() == tButton)
      {
        myFont = tFont;
      }
      else if(e.getSource() == sButton)
      {
        myFont = sFont;
      }
      else if(e.getSource() == cButton)
      {
        myFont = cFont;
      }
      else if(e.getSource() == aButton)
      {
         myFont = aFont;
      }
      else if(e.getSource() == sizeButton)
      {
         if(isSmaller)
         {
            int LARGE = 24;
            myFont = myFont.deriveFont(Font.PLAIN, LARGE);
             isSmaller = false; 
         }
         else
         {
             myFont = myFont.deriveFont(Font.PLAIN, SMALL);
             isSmaller = true;
         }
      }
      label.setFont(myFont);
  }
  public static void main(String [ ] args)
  {
     JFontSelector ff = new JFontSelector();
     ff.setSize(500, 180);
     ff.setVisible(true);
  }
}