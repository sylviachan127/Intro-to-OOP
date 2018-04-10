import java.awt.Rectangle;

/**
 * @author Sylvia Chan 
 * This class inherits the House class. When houses of the
 * NorthHouse roam in the North area, Their health should increase by a
 * bonus amount.
 */

public abstract class NorthHouse extends House {
    protected int health_increase = 2;

    public NorthHouse(int x, int y, Rectangle rect, String fileName, int maxAge) {
        super(x, y, rect, fileName, maxAge);
    }

    /*
     * This override the House's move first then use the House's move afterward.
     * Do so to add the health bouns.
     * @see House#move()
     */
    @Override
    public void move() {
        age += 1;
        if (y < rectHeight / 2) {
            // North
            health += health_increase;
        } else {
            health -= 1;
        }
        super.move();
    }
}
