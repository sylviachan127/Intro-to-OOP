import java.awt.Graphics;
import java.awt.Image;

/**
 * This class creates an abstract Cars Use this as a parent class to create more
 * specific cars
 * @author Sylvia Chan
 */
public abstract class Cars extends Vehicle {
    protected Image im;

    /**
     * This creates an abstract cars
     * @param speed
     * @param im
     */
    public Cars(int speed, Image im) {
        super(150, 150, speed);
        this.im = im;
    }

    /**
     * This methods controls the movement of the car when user pressed ASDW
     * @aram keyPressed
     */

    @Override
    public void move(char keyPressed) {
        if (keyPressed == 'a') {
            x -= speed;
        } else if (keyPressed == 'w') {
            y -= speed;
        } else if (keyPressed == 'd') {
            x += speed;
        } else if (keyPressed == 's') {
            y += speed;
        }
    }

    /**
     * This method draw a Cars into the userPanel
     * @param userPanel
     */
    public void draw(Graphics userPanel) {
        userPanel.drawImage(im, x, y, null);

    }

}
