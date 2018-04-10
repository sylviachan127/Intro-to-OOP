/**
 * This class creates a Ferrais, a child class of Cars
 * @author Sylvia Chan
 */

public class Ferrais extends Cars {

    public Ferrais() {
        super(3, ImageReader.getImageFromFileName("ferrari.jpg"));

    }

    /**
     * This method contrals the Ferrais of having a 5% chance of increasing the
     * speed by 1.
     */

    public void move(char keyPressed) {
        int su = getRandom(100);
        if (su <= 4) {
            this.speed += 1;
        }
        super.move(keyPressed);

    }

}
