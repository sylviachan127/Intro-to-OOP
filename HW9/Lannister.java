import java.awt.Rectangle;
import java.util.Random;

/**
 * @author Sylvia Chan This class creates a Lannister House. This also sets it's
 *         max age. It belongs to SouthHouse.
 */

public class Lannister extends SouthHouse {
    private final static int initMaxAge = 110;
    public static int children = 0;

    public Lannister(int x, int y, Rectangle rect) {
        super(x, y, rect, "lion.png", initMaxAge);
    }

    /*
     * Check to see the house it is colliding is a Lannister or Baratheon Try to
     * limit to 3 children to prevent over-producing
     * @see House#canReproduceWithHouse(House)
     */
    @Override
    public boolean canReproduceWithHouse(House otherHouse) {
        if (otherHouse instanceof Lannister || otherHouse instanceof Baratheon) {
            Random random = new Random(System.currentTimeMillis());
            int chance = random.nextInt(100);
            // System.out.println("Lannister canReproduceWithHouse "+otherHouse.getClass().getName()
            // +" "+ chance);
            return chance < reproduceChance - children * 5;
        }
        return false;
    }

    /*
     * Check to see the house it is colliding is a Stark or Tully or not. If
     * this is colliding with Stark, it has 60% chances of killing it. If this
     * is colliding with Tully, it has 80% chances of killing it.
     * @see House#canDestroyHouse(House)
     */
    @Override
    public boolean canDestroyHouse(House otherHouse) {
        int destoryChance = 0;
        if (otherHouse instanceof Stark) {
            destoryChance = 60;
        } else if (otherHouse instanceof Tully) {
            destoryChance = 80;
        }
        if (destoryChance > 0) {
            Random random = new Random(System.currentTimeMillis());
            return random.nextInt(100) < destoryChance;
        }
        return false;
    }
}
