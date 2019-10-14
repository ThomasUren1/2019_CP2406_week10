package Prac;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
class JFlexiblePanel extends JPanel
{

   JFlexiblePanel(Color bkgd, Color frgd, Font fnt, String st)
   {
      JLabel label = new JLabel();
      this.add(label);
      label.setText(st);
      label.setFont(fnt);
      this.setBackground(bkgd);
      label.setForeground(frgd);
   }
}