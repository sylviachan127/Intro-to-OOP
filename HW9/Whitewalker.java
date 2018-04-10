import java.awt.Rectangle;

/**
 * @author Sylvia Chan This class creates a Whitewalker House. This also sets
 *         it's max age. It does not belong to neither NorthHouse nor
 *         SouthHouse. This House kills every other House besides its own and
 *         the Nightwatcher.
 */

public class Whitewalker extends House {
    private final static int initMaxAge = 200;

    public Whitewalker(int x, int y, Rectangle rect) {
        super(x, y, rect, "whitewalker.png", initMaxAge);
    }

    /*
     * This House cannot reproduce with any House.
     * @see House#canReproduceWithHouse(House)
     */
    @Override
    public boolean canReproduceWithHouse(House otherHouse) {
        return false;
    }

    /*
     * This House destroy any other house beside nightwatcher.
     * @see House#canDestroyHouse(House)
     */
    @Override
    public boolean canDestroyHouse(House otherHouse) {
        return !(otherHouse instanceof Nightwatcher);
    }

    /*
     * Whitewalker lives forever and does not die by old age This method ensure
     * that.
     * @see House#isOld()
     */
    @Override
    public boolean isOld() {
        return false;
    };

    /*
     * This decrease the number of whiteWalker when a whiteWalker's health is
     * down to 0.
     * @see House#isDead()
     */

    @Override
    public boolean isDead() {
        if (health <= 0) {
            Westeros.whitewalkerNum--;
            return true;
        }
        return false;
    }
}
