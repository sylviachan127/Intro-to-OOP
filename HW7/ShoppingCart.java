import java.math.BigDecimal;

/**
 * hold and perform calculations on Purchasable items (like GroceryItem and
 * DeliFood)
 * @author Yuen Han Chan
 */

public class ShoppingCart {
    private Purchasable[] purchaseItem;
    private int counter = 0;

    /**
     * This constructor take in an int that describes the maximum capacity of
     * the shopping cart. grocery
     * @param maxCap
     */

    public ShoppingCart(int maxCap) {
        purchaseItem = new Purchasable[maxCap];
    }

    /**
     * This method takes in an item that we want to add to the shopping cart and
     * returns whether or not we were successful at adding the item.
     */

    public void addItem(Purchasable item) {
        if (counter < purchaseItem.length) {
            purchaseItem[counter] = item;
            counter++;
        }
    }

    /**
     * This method clear out the cart and set its state to how it was after its
     * initial creation.
     */

    public void emptyCart() {
        for (int i = 0; i <= purchaseItem.length; i++) {
            purchaseItem[i] = null;
            counter = 0;
        }
    }

    /**
     * This constructor calculates the cost of all of the items in the cart
     * grocery
     * @param money
     */

    public double subTotal() {
        double money = 0.00;
        for (int i = 0; i < counter; i++) {
            money += purchaseItem[i].getPrice();
        }

        int decimalPlaces = 2;
        BigDecimal totalA = new BigDecimal(money);

        totalA = totalA.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
        money = totalA.doubleValue();
        return money;
    }

    /**
     * This constructor calculates the total cost of all of the items in the
     * cart grocery after tax is being added.
     * @param money
     */

    public double total() {
        double money = subTotal();
        for (int i = 0; i < counter; i++) {
            money += purchaseItem[i].getAfterTaxPrice();
        }

        int decimalPlaces = 2;
        BigDecimal totalA = new BigDecimal(money);

        totalA = totalA.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
        money = totalA.doubleValue();
        return money;
    }

    /**
     * This constructor checks rahter the cart is full or not.
     * @param boolean
     */

    public boolean isFull() {
        return (counter == purchaseItem.length);
    }

    /**
     * This constructor checks rahter the cart is empty or not.
     * @param boolean
     */

    public boolean isEmpty() {
        return (counter == 0);
    }

    /**
     * This constructor checks the max. number of items the cart can hold
     * @param purchaseItem.length
     */

    public int getMaxItems() {
        return (purchaseItem.length);
    }

    /**
     * This method over rides the toString method
     * @return purchaseItem[i].toString() + "\n"
     */

    public String toString() {
        String foodNames = "";
        for (int i = 0; i < counter; i++) {
            foodNames += (purchaseItem[i].toString() + "\n");
        }
        return foodNames;
    }

    /**
     * This method returns the number of item in the cart
     * @return counter
     */

    public int getNumCart() {
        return counter;
    }
}
