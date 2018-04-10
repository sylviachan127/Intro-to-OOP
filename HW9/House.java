import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

/**
 * This class sets up the hierarcy for the Houses of the Game of Thrones. All
 * houses should use this class as either a parent or grandparent class.
 * @author Sylvia Chan
 */
public abstract class House {
    protected final static int initHealth = 150;
    protected final static int initSpeedX = 18;
    protected final static int initSpeedY = 18;
    protected final int reproduceChance = 15;

    protected Image im;
    protected double rectWidth = 0, rectHeight = 0;
    protected int age = 0;
    protected int maxAge = 0;
    protected int speed_x, speed_y;
    protected int children = 0;//

    public int x, y;
    public int health;
    public int width = 0, height = 0;

    /**
     * This constructor set up the basic elements of each houses.
     * @param x: Upper left corner of the x position.
     * @param y: Upper left corner of the y position.
     * @param rect: The shape of the card that represents each house.
     * @param fileName: picture file name of the housing image.
     * @param maxAge: maxAge of each house.
     */

    public House(int x, int y, Rectangle rect, String fileName, int maxAge) {
        this.x = x;
        this.y = y;
        this.rectWidth = rect.getWidth();
        this.rectHeight = rect.getHeight();
        // String appPath = this.getClass().getResource("/").getPath() +
        // "/res/";
        // im = ImageReaders.getImageFromFileName(appPath + fileName);
        im = ImageReaders.getImageFromFileName(fileName);
        width = im.getWidth(null);
        height = im.getHeight(null);
        this.maxAge = maxAge;

        this.health = initHealth;
        this.speed_x = initSpeedX;
        this.speed_y = initSpeedY;
    }

    /**
     * This method controls how each houses move. It ensures the card that was
     * currently moving does not exit the bound.
     */
    public void move() {
        if (x < 0) {
            speed_x = Math.abs(speed_x);
        } else if (x >= rectWidth - width) {
            speed_x = -speed_x;
        }
        if (y < 0) {
            speed_y = Math.abs(speed_y);
        } else if (y >= (rectHeight - height)) {
            speed_y = -speed_y;
        }
        y += speed_y;
        x += speed_x;
    }

    public final void draw(Graphics g) {
        g.drawImage(im, x, y, null);
    }

    /**
     * This methods check rather the houses collide or not
     * @param otherHouse
     * @return boolean rather the Houses collide
     */
    public final boolean collidesWithHouse(House otherHouse) {
        return (otherHouse.x + otherHouse.width > x)
                && (otherHouse.x < x + width)
                && (otherHouse.y + otherHouse.height > y)
                && (otherHouse.y < y + height);
    }

    public abstract boolean canReproduceWithHouse(House otherHouse);

    /**
     * This method sets up the status of the children when produce by Houses'
     * collisions.
     * @param otherHouse
     * @return a new baby of that House
     */

    public House reproduceWithHouse(House otherHouse) {
        try {
            House baby = (House) otherHouse.clone();
            baby.x = otherHouse.x;
            baby.y = otherHouse.y;
            baby.health = initHealth;
            baby.age = 0;
            baby.speed_x = initSpeedX;
            baby.speed_y = initSpeedY;
            children++;
            return baby;
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * This method checks if the house is too old.
     * @return boolean
     */
    public boolean isOld() {
        return age > maxAge;
    };

    public abstract boolean canDestroyHouse(House otherHouse);

    /**
     * This method sets old houses' health to 0 to ends its life.
     * @param otherHouse
     */
    public final void destroyHouse(House otherHouse) {
        otherHouse.health = 0;
    }

    /**
     * This method kills a house's card.
     */
    public final void die() {
        health = 0;
    }

    /**
     * This method checks if the hosue's card is still alive accords to its
     * health.
     * @return
     */
    public boolean isDead() {
        return health <= 0;
    }

}
