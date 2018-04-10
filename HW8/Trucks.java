/**
 * This class creates a truck, a child of Cars
 * @author Sylvia Chan
 */
public class Trucks extends Cars {
    public Trucks() {
        super(1, ImageReader.getImageFromFileName("truck.jpg"));

    }

    /**
     * This method extends the move method in Cars it calculated the 1% chance
     * of the truck being broke down or not
     */

    public void move(char keyPressed) {
        int work = getRandom(100);
        if (work == 0) {
            this.speed = 0;
        }
        super.move(keyPressed);

    }
}