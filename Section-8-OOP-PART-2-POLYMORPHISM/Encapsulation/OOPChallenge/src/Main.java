public class Main {

    public static void main(String[] args) {

        Order firstOrder = new Order();
        firstOrder.newOrder();

        Order secondOrder = new Order("Beef", "Coke", "Ring");
        secondOrder.setExtras(3);
        secondOrder.newOrder();

        Order fullOrder = new Order("Deluxe", "Coke", "Fries");
        fullOrder.setExtras(5, "Large");
        fullOrder.newOrder();
    }
}
