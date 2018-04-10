import javax.swing.JFrame;

/**
 * This class creates and displays the application frame.
 * @author Sylvia Chan
 */
public class Vehicles {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vehicles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VehiclesPanel());
        frame.pack();
        frame.setVisible(true);
    }
}