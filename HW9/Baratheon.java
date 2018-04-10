import java.awt.Rectangle;
import java.util.Random;

/**
 * @author Sylvia Chan This class creates the Baratheon House It belongs to
 *         SouthHouse.
 */
public class Baratheon extends SouthHouse {
    private final static int initMaxAge = 120;
    public static int children = 0;

    /**
     * This constract a baratheon card.
     * @param x
     * @param y
     * @param rect
     */
    public Baratheon(int x, int y, Rectangle rect) {
        super(x, y, rect, "stag.png", initMaxAge);
    }

    /*
     * Check to see the house it is colliding is a Lannister or not Try to limit
     * to 3 children to prevent over-producing
     * @see House#canReproduceWithHouse(House)
     */
    @Override
    public boolean canReproduceWithHouse(House otherHouse) {
        if (otherHouse instanceof Lannister) {
            Random random = new Random(System.currentTimeMillis());
            int chance = random.nextInt(100);
            // System.out.println("Baratheon canReproduceWithHouse "+otherHouse.getClass().getName()
            // +" "+ chance);
            return chance < reproduceChance - children * 5;
        }
        return false;
    }

    /*
     * Check to see the house it is colliding is a Targaryan or not.
     * @see House#canDestroyHouse(House)
     */
    @Override
    public boolean canDestroyHouse(House otherHouse) {
        return otherHouse instanceof Targaryan;
    }
}
