public class Order {

    // Composition of the Order class
    private Burger burger;
    private Drinks drinks;
    private Side side;

    // no args constructor of order will assign the default order to Hamburger, Small Coke, and Fries
    public Order() {
        this("Fries");
    }

    // constructor with only side as the parameter, the burger and drinks assigned default type
    public Order(String side) {
        this("Ham", "Coke", side);
    }

    // constructor to assign the burger type and the drinks type, with the side assigned default
    public Order(String burger, String drinks) {
        this(burger, drinks, "Fries");
    }

    // Main constructor of the Order class, instantiate the Burger, Drinks, and Side classes
    public Order(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType);
        this.drinks = new Drinks(drinkType);
        this.side = new Side(sideType);
    }

    // Method to print out the order and the total price of the order
    public void newOrder() {

        double totalPrice = burger.getItemPrice() + drinks.getItemPrice() + side.getItemPrice();

        if (burger.getBurgerType() == 'D') {
            burger.initialPrice = totalPrice;
            burger.setItemPrice(totalPrice);
            drinks.setItemPrice(0.0d);
            side.setItemPrice(0.0d);
        }

        burger.makeOrder();
        drinks.makeOrder();
        side.makeOrder();

        System.out.println("-".repeat(20));

        System.out.printf("Total Price: %.3f%n%n", totalPrice);
    }

    public void setExtras(int toppings) {

        burger.setToppings(toppings);
        burger.setAdditionalPrice();

        drinks.setAdditionalPrice("Small");

        // Assigning the item price for ordered burger and drinks based on the base price + additional price
        burger.setItemPrice();
        drinks.setItemPrice();
    }

    // Method to assign the toppings for burger and the size for the drinks
    public void setExtras(int toppings, String size) {

        burger.setToppings(toppings);
        burger.setAdditionalPrice();

        drinks.setAdditionalPrice(size);

        // Assigning the item price for ordered burger and drinks based on the base price + additional price
        burger.setItemPrice();
        drinks.setItemPrice();
    }
}