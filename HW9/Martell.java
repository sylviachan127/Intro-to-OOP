import java.awt.Rectangle;
import java.util.Random;

/**
 * @author Sylvia Chan This class creates a Martell House. This also sets it's
 *         max age. It does not belong to neither NorthHouse nor SouthHouse.
 */

public class Martell extends House {
    private final static int initMaxAge = 125;

    public Martell(int x, int y, Rectangle rect) {
        super(x, y, rect, "martell.png", initMaxAge);
    }

    /*
     * When this class moves, it's age increases and health decrease Then call
     * on the House's move
     * @see House#move()
     */
    @Override
    public void move() {
        age += 1;
        health -= 1;
        super.move();
    }

    /*
     * This house can only reproduce with it's own house. It has a higer
     * reproducing Chance of 15%.
     * @see House#canReproduceWithHouse(House)
     */
    @Override
    public boolean canReproduceWithHouse(House otherHouse) {
        if (otherHouse instanceof Martell) {
            Random random = new Random(System.currentTimeMillis());
            int chance = random.nextInt(100);
            // System.out.println("Mine canReproduceWithHouse "+otherHouse.getClass().getName()
            // +" "+ chance);
            return chance < reproduceChance;
        }
        return false;
    }

    /*
     * As long as the house it collides with (excluding own house) has a health
     * less than 100, it can kill that house.
     * @see House#canDestroyHouse(House)
     */
    @Override
    public boolean canDestroyHouse(House otherHouse) {
        if (!(otherHouse instanceof Martell)) {
            return otherHouse.health < 100;
        }
        return false;
    }
}
