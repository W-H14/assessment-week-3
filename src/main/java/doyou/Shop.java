package doyou;

public class Shop {
    public static double calculateTotal(Clothing[] clothingItems) {
        double total = 0.0;

        for(Clothing item : clothingItems){
            total += item.getPrice();
        }
        return total;


    }
    public static boolean isAFit(Customer customer, Clothing clothing) {
        return customer.getSize().equals(clothing.getSize());
    }
    public static void printDiscountAmmountOff(Discountable[] items, Clothing clothing) {
        double discountAmount = 0.0;

    }
}
