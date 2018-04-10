import java.awt.Rectangle;

/**
 * @author Sylvia Chan This class creates a Nightwatcher House. This also sets
 *         it's max age. It belongs to NorthHouse.
 */

public class Nightwatcher extends NorthHouse {
    private final static int initMaxAge = Stark.initMaxAge;

    public Nightwatcher(int x, int y, Rectangle rect) {
        super(x, y, rect, "nightwatcher.png", initMaxAge);
    }

    /*
     * Always return false since this House cannot reproduce
     * @see House#canReproduceWithHouse(House)
     */

    @Override
    public boolean canReproduceWithHouse(House otherHouse) {
        return false;
    }

    /*
     * This house can only destroy Whitewalker
     * @see House#canDestroyHouse(House)
     */

    @Override
    public boolean canDestroyHouse(House otherHouse) {
        return otherHouse instanceof Whitewalker;
    }

}
