//***************************************
//  Logo.java      Author: Yuen Han Chan
//
//***************************************

import javax.swing.JApplet;
import java.awt.*;

public class Logo extends JApplet
{
   //-------------------------------------
   // Create a new logo for Red Sox
   //-------------------------------------
   public void paint (Graphics redS)
   {
      redS.setColor(Color.MAGENTA);
      redS.drawRect (0,0,400,400);
      Color newRed = new Color (255,0,0);
      redS.setColor(newRed);
      redS.fillRect (74,90,250,230);
      Color newBlack = new Color (0,0,0);
      redS.setColor(newBlack);
      redS.drawRoundRect(130,210,123,54,23,78);
      redS.fillOval(143,150,20,20);
      redS.fillOval(243,150,20,20);
      redS.drawLine(123,210,260,266); 
      redS.drawLine(123,220,260,276); 
      redS.drawString ("RED SOX", 250,370);
   }
}