package Prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JVowelConsonant extends JFrame implements ActionListener
{
   Container con = null;
   private final int LETTERS_AT_A_TIME = 8;
   private JButton[] b = new JButton[LETTERS_AT_A_TIME];
   private final String[] LETTERS = {"A", "B", "C", "D","E","F", "G",
      "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
      "S", "T", "U", "V", "W", "X", "Y", "Z"};
   String[] vowles = {"A", "E", "I", "O", "U", "Y"};
   private JLabel infoLabel = new JLabel("");
   boolean alreadyUsed;
   private int x;
   private int ran;

   private JVowelConsonant()
   {
      int[] rans = {-1, -1, -1, -1, -1, -1, -1, -1};
      for(x = 0; x < LETTERS_AT_A_TIME; ++x)
      {
          ran = (int)(Math.random() * LETTERS.length);
          rans[x] = ran;
      }
      setLayout(new GridLayout(2, 2));
      JPanel p1 = new JPanel();
      p1.setLayout(new GridLayout(2, 2));
      JPanel p2 = new JPanel();
      p2.setLayout(new GridLayout(2, 2));
      for(x = 0; x < LETTERS_AT_A_TIME; ++x)
         b[x] = new JButton(LETTERS[rans[x]]);
      for(x = 0; x < 4; ++x)
         p1.add(b[x]);
      for(; x < LETTERS_AT_A_TIME; ++x)
         p2.add(b[x]);
      JPanel p3 = new JPanel();
      p3.add(infoLabel);
      add(p1);
      add(p2);
      add(p3);
      for(x = 0; x < LETTERS_AT_A_TIME; ++x)
         b[x].addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      for(x = 0; x < LETTERS_AT_A_TIME; ++x)
        if (source == b[x])
        {
           if(b[x].getText().equals("A") || b[x].getText().equals("E") ||
                   b[x].getText().equals("I") || b[x].getText().equals("O") ||
                   b[x].getText().equals("U"))
                 infoLabel.setText(b[x].getText() + " is a vowel");
           else
              infoLabel.setText(b[x].getText() + " is a consonant");
           ran = (int)(Math.random() * LETTERS.length);
           b[x].setText(LETTERS[ran]);
           x = LETTERS_AT_A_TIME;
        }
   }
   public static void main(String[] ags)
   {
       JVowelConsonant f = new JVowelConsonant();
       f.setSize(500, 500);
       f.setVisible(true);
   }
}
