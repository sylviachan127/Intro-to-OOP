import javax.swing.JFrame;

/**
* This class creates a filled rectangle according to
* user inputs or the press of the random button
* @class: ColorChooserPanel.java
* @author: Yuen Han Chan
*/

public class ColorChooser {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Color Chooser");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ColorChooserPanel panel = new ColorChooserPanel();

      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}