import java.awt.Rectangle;

/**
 * @author Sylvia Chan This class inherits the House class. When houses of the
 *         South House roam in the South area, Their speed should increase by a
 *         bonus amount.
 */

public abstract class SouthHouse extends House {
    protected int speed_increase = 10;

    public SouthHouse(int x, int y, Rectangle rect, String fileName, int maxAge) {
        super(x, y, rect, fileName, maxAge);
    }

    /*
     * This override the House's move first then use the House's move afterward.
     * Do so to alter the House's speed.
     * @see House#move()
     */

    @Override
    public void move() {
        health -= 1;
        age += 1;
        int speed_increase_this = 0;
        if (x < 0) {
            speed_x = Math.abs(speed_x);
        } else if (x >= rectWidth - width) {
            speed_x = -speed_x;
        }
        if (y < 0) {
            speed_y = Math.abs(speed_y);
        } else {
            if (y >= (rectHeight - height)) {
                speed_y = -speed_y;
            }
            if (y > rectHeight / 2) {
                // South
                speed_increase_this = speed_increase;
            }
        }
        y += speed_y > 0 ? speed_y + speed_increase_this : speed_y
                - speed_increase_this;
        x += speed_x > 0 ? speed_x + speed_increase_this : speed_x
                - speed_increase_this;
    }
}
