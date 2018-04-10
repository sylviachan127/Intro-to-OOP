import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * This class allows the MainPanel to create Previewable object of PictureFile
 * file type of .jpg
 * @author Yuen Han Chan
 */

public class PictureFile extends JPanel implements Previewable {
    private String newText;
    private JLabel icon;

    /**
     * This Constructor takes the pictureFile file name as a String
     * @param pictureFile
     */

    public PictureFile(String pictureFile) {
        newText = pictureFile;
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
     * pictureFile file name in the list panel
     * @param userPanel
     */

    public void preview(JPanel userPanel) {
        userPanel.removeAll();
        userPanel.setLayout(new BoxLayout(userPanel, BoxLayout.Y_AXIS));
        ImageIcon image = new ImageIcon(newText);
        icon = new JLabel();
        icon.setIcon(image);
        userPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        userPanel.add(icon);
        userPanel.revalidate();
        userPanel.repaint();
    }
}