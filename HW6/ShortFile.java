import java.awt.Dimension;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class allows the MainPanel to create Previewable object of ShortText
 * file type of .txt
 * @author Yuen Han Chan
 */

public class ShortFile extends JPanel implements Previewable {
    private String newText;

    /**
     * This Constructor takes the shortText file name as a String
     * @param shortFile
     */

    public ShortFile(String shortFile) {
        newText = shortFile;
    }

    /**
     * This Method returns the nextText file name
     * @return newText
     */

    public String toString() {
        return newText;
    }

    /**
     * This method takes in a JPanel and edit the content when the user click an
     * shortText file name in the list panel
     * @param userPanel
     */

    public void preview(JPanel userPanel) {
        userPanel.removeAll();
        userPanel.setLayout(new BoxLayout(userPanel, BoxLayout.Y_AXIS));
        FileScanner scan = new FileScanner(newText);
        userPanel.add(Box.createRigidArea(new Dimension(0, 30)));

        int counter = 0;
        while (scan.hasNext() && (counter++) < 5) {
            JLabel newLine = new JLabel(scan.nextLine());
            newLine.setFont(new Font("Serif", Font.PLAIN, 18));
            userPanel.add(newLine);
        }
        if (counter > 5) {
            JLabel dot = new JLabel("...");
            userPanel.add(dot);
        }
        userPanel.revalidate();
        userPanel.repaint();
    }

}
