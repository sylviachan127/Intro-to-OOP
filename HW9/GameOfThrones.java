import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * This class is the driver of the HW9/ Game of Thrones program.
 * @author Sylvia Chan
 */
public class GameOfThrones {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Westeros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ControlPanel control = new ControlPanel();
        frame.add(control, BorderLayout.WEST);
        frame.add(new Westeros(control)); //defaults to CENTER
        frame.pack();
        frame.setVisible(true);
    }
}