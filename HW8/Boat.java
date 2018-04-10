import java.awt.Color;
import java.awt.Graphics;

/**
 * This class creates a Boat
 * @author Sylvia Chans
 */
public abstract class Boat extends Vehicle {
    protected char keyPress;

    public Boat(int speed) {
        super(150, 300, speed);
    }

    /**
     * This class overrides the draw method in Vehicle
     * @param g
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 50, 30);
    }

    /**
     * This method calculates a 10% chance it will move in the vertical
     * direction by 1. There is a 50% chance this vertical direction will be up
     * and a 50% chance it will be down.
     * @param keyPressed
     */
    public void move(char keyPressed) {
        int mv = getRandom(100);
        if (mv < 10) {
            int mu = getRandom(100);
            if (mu < 50) {
                this.y += 1;
            } else if (mu >= 50) {
                this.y -= 1;
            }
        }
        if (keyPressed == 'a') {
            x -= speed;
            keyPress = 'a';
        } else if (keyPressed == 'd') {
            x += speed;
            keyPress = 'd';
        }
    }

    /**
     * This method returns the key pressed by the User
     * @return keyPress
     */
    public char getKey() {
        return keyPress;
    }

}
