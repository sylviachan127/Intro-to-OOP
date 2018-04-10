import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

/**
* This class creates a filled rectangle according to
* user inputs or the press of the random button
* @mainClass: ColorChooser.java
* @author: Yuen Han Chan
*/

public class ColorChooserPanel extends JPanel {
   private JLabel inputLabelRed, inputLabelBlue, inputLabelGreen;
   private JTextField red, blue, green;
   private JButton randomColor;
   private int redInt = 0, blueInt = 0, greenInt = 0;
   private int randRed, randBlue, randGreen;

/**
* This method creates the windows with the button and text
*/

   public ColorChooserPanel() {
      setPreferredSize(new Dimension(500, 400));
      setBackground(Color.white);

      inputLabelRed = new JLabel("Red");
      inputLabelBlue = new JLabel("Blue");
      inputLabelGreen = new JLabel("Green");

      red = new JTextField(4);
      red.addActionListener(new RedListener());
      green = new JTextField(4);
      green.addActionListener(new GreenListener());
      blue = new JTextField(4);
      blue.addActionListener(new BlueListener());

      randomColor = new JButton("Random Color");
      randomColor.addActionListener(new ButtonListener());

      add(inputLabelRed);
      add(red);
      add(inputLabelBlue);
      add(blue);
      add(inputLabelGreen);
      add(green);
      add(randomColor);

   }

/**
* This class creates the actionListener for the red textbox
*/

   public class RedListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
         String redGet = red.getText();
         redInt = Integer.parseInt(redGet);
      }
   }

/**
* This class creates the actionListener for the blue textbox
*/

   public class BlueListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
         String blueGet = blue.getText();
         blueInt = Integer.parseInt(blueGet);
      }
   }

/**
* This class creates the actionListener for the green textbox
*/

   public class GreenListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
         String greenGet = green.getText();
         greenInt = Integer.parseInt(greenGet);
 }
   }

/**
* This class creates the actionListener for the random button
*/

   public class ButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
         Random rand = new Random();
         redInt = rand.nextInt(256);
         blueInt = rand.nextInt(256);
         greenInt = rand.nextInt(256);

         red.setText(Integer.toString(redInt));
         green.setText(Integer.toString(greenInt));
         blue.setText(Integer.toString(blueInt));
      }
   }

/**
* This method paints the filled rectangle after input
* is given or the random button is being push
*/

   public void paintComponent(Graphics page) {
      super.paintComponent(page);

      Color userColor = new Color(redInt, greenInt, blueInt);

      System.out.println(redInt);
      page.setColor(userColor);
      page.fillRect(100, 100, 200, 200);

      repaint();
   }
}