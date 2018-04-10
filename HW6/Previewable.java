import javax.swing.JPanel;

/**
 * This interface allows the 3 types of files to implement this to create
 * Previewable object in the Panels.
 */

public interface Previewable {
    void preview(JPanel panel);

    String toString();
}
