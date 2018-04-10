import java.math.BigDecimal;

/**
 * This class create the Deli Grocery
 * @author Yuen Han Chan
 */

public class DeliFood implements Purchasable {

    private String foodName;
    private double foodPrice;

    /**
     * This constructor prebuilt and not allow other classes to create new
     * grocery
     * @param foodName, foodPrice
     */

    private DeliFood(String foodName, double foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    /**
     * This method return the name of the Deli grocery entries
     * @return foodName
     */

    public String getName() {
        return foodName;
    }

    /**
     * This method return the price of the Deli grocery entries
     * @return foodPrice
     */

    public double getPrice() {
        return foodPrice;
    }

    /**
     * This method return the price of the GroceryItem plus the tax on the item
     * using the food tax constant.
     * @return foodPrice*GaTax
     */

    public double getAfterTaxPrice() {
        return foodPrice * (Purchasable.GA_TAX);
    }

    /**
     * This method creates a Purchasable object of Potato Salad
     * @return a Purchasable object
     */

    public static Purchasable createPotatoSald() {
        return new DeliFood("Potato Salad", 3.25);
    }

    /**
     * This method creates a Purchasable object of Ham
     * @return a Purchasable object
     */

    public static Purchasable createHam() {
        return new DeliFood("Ham", 1.24);
    }

    /**
     * This method creates a Purchasable object of Egg
     * @return a Purchasable object
     */

    public static Purchasable createEgg() {
        return new DeliFood("Egg", 3.00);
    }

    /**
     * This method over rides the toString method
     * @return "Premade" + foodName + ": $" + foodPrice
     */

    public String toString() {
        int decimalPlaces = 2;
        BigDecimal money = new BigDecimal(foodPrice);

        money = money.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
        foodPrice = money.doubleValue();

        return ("Premade" + foodName + ": $" + foodPrice);
    }
}
