import java.util.Scanner;

/**
 * This class act as your driver for the shopping cart program.
 * @author Yuen Han Chan
 */

public class GroceryStore {

    /**
     * This method displays the current items in the cart out of the max number
     * user can have possible. And it displays the subTotal and total price.
     */

    public static void displayCart(ShoppingCart sc) {
        System.out.println("You have " + sc.getNumCart() + "/"
                + sc.getMaxItems() + " in your cart");
        if ((sc.getNumCart()) != 0) {
            System.out.println(sc);
        }
        System.out.println("Subtotal: $" + sc.subTotal()
                + " Total (with tax): $" + sc.total() + "\n");
    }

    public static void main(String args[]) {
        char option = 'q';
        int option2 = 0;

        ShoppingCart sc = new ShoppingCart(10);
        System.out.println("Welcome to the Grocery Store!\n");

        do {
            if (!(sc.isFull())) {
                displayCart(sc);

                System.out.println("Press [1] for the Deli, or [2] for "
                        + "a custom item or 'q' to quit");
                Scanner scan = new Scanner(System.in);
                option = (scan.nextLine().charAt(0));

                if (option == '1') { // If user selects 1
                    System.out.println("What item would you like to buy?");
                    System.out.println("[1] Potato Salad\n[2] Ham\n[3] Egg");
                    option2 = scan.nextInt();
                    if (option2 == 1) {
                        sc.addItem(DeliFood.createPotatoSald());
                    } else if (option2 == 2) {
                        sc.addItem(DeliFood.createHam());
                    } else if (option2 == 3) {
                        sc.addItem(DeliFood.createEgg());
                    }
                }

                if (option == '2') { // If user selects 2
                    System.out.println("Enter the name of your item: ");
                    String foodName = scan.nextLine();
                    System.out.println("Enter the price (pre-tax) of "
                            + "your item: ");
                    double foodPrice = scan.nextDouble();

                    sc.addItem(new GroceryItem(foodName, foodPrice));
                }
            }
        } while (option != 'q'); // Repeat the do loop util user press 'q'

        sc.isEmpty();
        System.out.println("Your cart has been cleared. Enjoy your groceries!");
    }

}
