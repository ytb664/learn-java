public class Order {

    private Burger burger;
    private Drinks drinks;
    private Side side;

    public Order() {
        this("Fries");
    }

    public Order(String side) {
        this("Ham", "Coke", side);
    }

    public Order(String burger, String drinks) {
        this(burger, drinks, "Fries");
    }

    public Order(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType);
        this.drinks = new Drinks(drinkType);
        this.side = new Side(sideType);
    }

    public void newOrder() {

        burger.makeOrder();
        drinks.makeOrder();
        side.makeOrder();

        System.out.println("-".repeat(20));
        double totalPrice = burger.getItemPrice() + drinks.getItemPrice() + side.getItemPrice();
        System.out.printf("Total Price: %.3f%n%n", totalPrice);
    }

    public void setExtras(int toppings, String size) {

        burger.setAdditionalPrice(toppings);
        drinks.setAdditionalPrice(size);
    }
}