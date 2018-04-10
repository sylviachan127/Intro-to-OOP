import java.math.BigDecimal;

/**
 * This class create the custom grocery entries
 * @author Yuen Han Chan
 */

public class GroceryItem implements Purchasable {
    private double gaTax = 0.02;

    private String foodName;
    private double foodPrice;

    /**
     * This constructor constructs a grocery object
     * @param foodName, foodPrice
     */

    public GroceryItem(String foodName, double foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    /**
     * This method return the name of the custom grocery entries
     * @return foodName
     */

    public String getName() {
        return foodName;
    }

    /**
     * This method return the price of the custom grocery entries
     * @return foodPrice
     */

    public double getPrice() {
        return foodPrice;
    }

    /**
     * This method return the price of the GroceryItem plus the tax on the item
     * using the food tax constant.
     * @return foodPrice*GA_FOOD_TAX
     */

    public double getAfterTaxPrice() {
        return foodPrice * gaTax;
    }

    /**
     * This method over rides the toString method
     * @return foodName + ": $" + foodPrice
     */

    public String toString() {
        int decimalPlaces = 2;
        BigDecimal money = new BigDecimal(foodPrice);

        money = money.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
        foodPrice = money.doubleValue();

        return (foodName + ": $" + foodPrice);
    }

}
