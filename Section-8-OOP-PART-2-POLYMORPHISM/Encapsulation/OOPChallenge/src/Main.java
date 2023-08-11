public class Main {

    public static void main(String[] args) {

        Order firstOrder = new Order();
        firstOrder.newOrder();

        Order secondOrder = new Order("Ring");
        secondOrder.newOrder();

        Order thirdOrder = new Order("Beef", "Tea");
        thirdOrder.newOrder();

        Order fullOrder = new Order();
        fullOrder.setExtras(3, "Medium");
        fullOrder.newOrder();

        Drinks drinks = new Drinks();
        drinks.setAdditionalPrice("Large");
        System.out.println(drinks.getAdditionalPrice());
    }
}
