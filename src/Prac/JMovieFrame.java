package Prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMovieFrame extends JFrame implements ActionListener
{
   private JButton northButton = new JButton("North by Northwest");
   private JButton southButton = new JButton("South Pacific");
   private JButton eastButton = new JButton("East of Eden");
   private JButton westButton = new JButton("West Side Story");
   private JButton centerButton = new JButton("Journey to the Center of the Earth");
   private JLabel northLabel = new JLabel("          1959, Cary Grant");
   private JLabel southLabel = new JLabel("          1958, Mary Martin");
   private JLabel eastLabel = new JLabel("1955, James Dean   ");
   private JLabel westLabel = new JLabel("1961, Natalie Wood   ");
   private JLabel centerLabel = new JLabel("         1959, Pat Boone");
   private JMovieFrame()
   {
      setTitle("JMovieFrame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      add(westButton,"West");
      add(centerButton,"Center");
      add(eastButton,"East");
      add(northButton,"North");
      add(southButton,"South");
      eastButton.addActionListener(this);
      centerButton.addActionListener(this);
      westButton.addActionListener(this);
      northButton.addActionListener(this);
      southButton.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == northButton)
      {
          remove(northButton);
          add(northLabel, BorderLayout.NORTH);
      }
      else
         if(source == southButton)
         {
             remove(southButton);
             add(southLabel, BorderLayout.SOUTH);
         }
         else
             if(source == eastButton)
             {
                remove(eastButton);
                add(eastLabel, BorderLayout.EAST);
             }
             else
               if(source == westButton)
               {
                  remove(westButton);
                  add(westLabel, BorderLayout.WEST);
               }
               else
               {
                  remove(centerButton);
                  add(centerLabel, BorderLayout.CENTER);
                }
      invalidate();
      validate();
   }
   public static void main(String[] args)
   {
      JMovieFrame movieFrame = new JMovieFrame();
      movieFrame.setSize(650,300);
      movieFrame.setVisible(true);
   }
}
