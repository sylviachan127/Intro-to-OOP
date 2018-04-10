import java.awt.Color;
import java.awt.Graphics;

/**
 * This class creates a SailBoat, a child of Boat
 * @author Sylvia Chan
 */
public class SailBoats extends Boat {
    public SailBoats() {
        super(1);
    }

    /**
     * This method draw a flair on its black rectangle to denote it is a
     * sailboat
     * @param g
     */
    public void draw(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(x + 5, y - 20, 10, 30);
        g.setColor(Color.RED);

        int[] x1 = {x, x, x + 40 };
        int[] y1 = {y - 10, y - 50, y - 10 };
        g.fillPolygon(x1, y1, 3);
        super.draw(g);

    }
}
