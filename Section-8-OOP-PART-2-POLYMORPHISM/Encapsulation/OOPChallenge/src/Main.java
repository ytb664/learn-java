public class Main {

    public static void main(String[] args) {

        Order myOrder = new Order();

        Order burger = new Order();
        burger.setBurger("BeefBurger", 3);

        Order drinks = new Order();
        drinks.setDrinks("lemon tea", "small");

        Order side = new Order();
        side.setSide("french fries");

        System.out.println(myOrder.getTotal());
    }
}
