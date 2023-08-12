public class Main {

    public static void main(String[] args) {

//        Order firstOrder = new Order();
//        firstOrder.newOrder();
//
//        Order secondOrder = new Order("Ring");
//        secondOrder.newOrder();
//
//        Order thirdOrder = new Order("Beef", "Tea");
//        thirdOrder.newOrder();

        Order fullOrder = new Order("Beef", "Coke");
        fullOrder.setExtras(3, "Large");
        fullOrder.newOrder();

        Burger burger = new Burger();
        burger.setToppings(3);
        burger.setAdditionalPrice();
        System.out.println(burger.getAdditionalPrice());

        Drinks drinks = new Drinks();
        drinks.setAdditionalPrice("Medium");
        System.out.println(drinks.getAdditionalPrice());
    }
}
