import java.awt.Rectangle;
import java.util.Random;

/**
 * @author Sylvia Chan This class creates a Tully House. This also sets it's max
 *         age. It belongs to NorthHouse.
 */

public class Tully extends NorthHouse {
    private final static int destoryChance = 20;
    private final static int initMaxAge = 140;
    public static int children = 0;

    public Tully(int x, int y, Rectangle rect) {
        super(x, y, rect, "trout.png", initMaxAge);
    }

    /*
     * Check to see the house it is colliding is a Stark Try to limit to 3
     * children to prevent over-producing
     * @see House#canReproduceWithHouse(House)
     */
    @Override
    public boolean canReproduceWithHouse(House otherHouse) {
        if (otherHouse instanceof Stark) {
            Random random = new Random(System.currentTimeMillis());
            int chance = random.nextInt(100);
            // System.out.println("Tully canReproduceWithHouse "+otherHouse.getClass().getName()
            // +" "+ chance);
            return chance < reproduceChance - children * 5;
        }
        return false;
    }

    /*
     * Check to see the house it is colliding is a Lannister or not. If this is
     * colliding with Lannister, it has 20% chances of killing it.
     * @see House#canDestroyHouse(House)
     */

    @Override
    public boolean canDestroyHouse(House otherHouse) {
        if (otherHouse instanceof Lannister) {
            Random random = new Random(System.currentTimeMillis());
            return random.nextInt(100) < destoryChance;
        }
        return false;
    }
}
