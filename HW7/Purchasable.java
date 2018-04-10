public interface Purchasable {

    /**
     * This interface allows the 3 types of methods to be implemented and create
     * a state Tax constant
     */

    double GA_TAX = 0.04;

    String getName();

    double getPrice();

    double getAfterTaxPrice();
}
