import javax.swing.JFrame;

/**
 * This class creates the MainPanel that contains the 2 subPanels
 * @author Yuen Han Chan
 */

public class LayoutDisplay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Preview Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainPanel panel = new MainPanel();

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
