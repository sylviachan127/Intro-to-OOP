import java.awt.Rectangle;
import java.util.Random;

/**
 * @author Sylvia Chan This class creates a Stark House. This also sets it's max
 *         age and the chance to destroy other house. It belongs to NorthHouse.
 */

public class Stark extends NorthHouse {
    private final static int destoryChance = 40;
    public final static int initMaxAge = 130;
    public static int children = 0;

    public Stark(int x, int y, Rectangle rect) {
        super(x, y, rect, "direwolf.png", initMaxAge);
    }

    /*
     * Check to see the house it is colliding is a Tully or not if not. Try to
     * limite to 3 children to prevent over-producing
     * @see House#canReproduceWithHouse(House)
     */
    @Override
    public boolean canReproduceWithHouse(House otherHouse) {
        if (otherHouse instanceof Tully) {
            Random random = new Random(System.currentTimeMillis());
            int chance = random.nextInt(100);
            // System.out.println("Stark canReproduceWithHouse "+otherHouse.getClass().getName()
            // +" "+ chance);
            return chance < reproduceChance - children * 5;
        }
        return false;
    }

    /*
     * Check to see the house it is colliding is a Lannister or not.
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
