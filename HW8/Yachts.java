import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 * This class creates a Yacht, a child of Boat
 * @author Sylvia Chan
 */
public class Yachts extends Boat {
    public Yachts() {
        super(2);
    }

    /**
     * This method determine if there is a 15% chance it will 'skip' an extra 10
     * units in what ever direction it was moving.
     * @param keyPressed
     */
    public void move(char keyPressed) {
        int em = getRandom(100);
        if (em < 15) {
            if (super.getKey() == 'a') {
                x -= 10;
            } else if (super.getKey() == 'd') {
                x += 10;
            }
        }
        super.move(keyPressed);
    }

    /**
     * This method draw a bolded Y on its black rectangle to denote it is a
     * yacht
     * @param g
     */
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));
        g.drawString("Y", x + (20), y + (20));
    }
}