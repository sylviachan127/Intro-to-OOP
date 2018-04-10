import java.awt.Rectangle;
import java.util.Random;

/**
 * @author Sylvia Chan This class creates a Targaryan House. This also sets it's
 *         max age. It does not belong to neither NorthHouse nor SouthHouse.
 */

public class Targaryan extends House {
    private final static int initMaxAge = 200; //
    public static int children = 0;

    public Targaryan(int x, int y, Rectangle rect) {
        super(x, y, rect, "dragon.png", initMaxAge);
    }

    /*
     * Check to see the house it is colliding is a Targaryan Try to limit to 3
     * children to prevent over-producing
     * @see House#canReproduceWithHouse(House)
     */

    @Override
    public boolean canReproduceWithHouse(House otherHouse) {
        if (otherHouse instanceof Targaryan) {
            Random random = new Random(System.currentTimeMillis());
            int chance = random.nextInt(100);
            // System.out.println("Targaryan canReproduceWithHouse "+otherHouse.getClass().getName()
            // +" "+ chance);
            return chance < reproduceChance - children * 5;
        }
        return false;
    }

    /*
     * Targaryan lives forever and does not die by old age This method ensure
     * that.
     * @see House#isOld()
     */
    @Override
    public boolean isOld() {
        return false;
    };

    /*
     * Check to see the house it is colliding is not a Targaryan. If not its own
     * house, it kills the other House when collide.
     * @see House#canDestroyHouse(House)
     */

    @Override
    public boolean canDestroyHouse(House otherHouse) {
        return !(otherHouse instanceof Baratheon);
    }
}
