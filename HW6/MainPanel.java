import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

/**
 * This class creates the MainPanel that contains the 2 subPanels
 * @author Yuen Han Chan
 */

public class MainPanel extends JPanel {
    private JPanel previewSide;

    /**
     * This constructor creates the MainPanel that contains the 2 subPanels
     * @author Yuen Han Chan
     */

    public MainPanel() {
        setLayout(new BorderLayout());

        previewSide = new JPanel();
        previewSide.setPreferredSize(new Dimension(300, 400));
        PreviewListPanel listSide = new PreviewListPanel();

        Previewable shortText = new ShortFile("ugaJoke.txt");
        Previewable shortText2 = new ShortFile("shortCSJoke.txt");
        Previewable longText = new LongText("AlmaMater.txt");
        Previewable pictureFile = new PictureFile("Buzz.jpg");
        Previewable pictureFile2 = new PictureFile("awesome.jpg");

        listSide.addItem(shortText);
        listSide.addItem(shortText2);
        listSide.addItem(longText);
        listSide.addItem(pictureFile);
        listSide.addItem(pictureFile2);

        add(listSide, BorderLayout.WEST);

        add(previewSide, BorderLayout.CENTER);

        listSide.addActionListener(new UserActionListener());
    }

    /**
     * This method creates the MainPanel that contains listen to user's action
     * of selecting the file on the previewSide Panel.
     * @author Yuen Han Chan
     */

    private class UserActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Previewable display = (Previewable) event.getSource();
            display.preview(previewSide);
        }
    }
}
