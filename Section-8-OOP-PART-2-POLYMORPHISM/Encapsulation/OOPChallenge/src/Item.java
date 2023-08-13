public class Item {

    // Item's fields
    private String type;
    protected double initialPrice;
    private double additionalPrice;
    private double itemPrice;

    // Main constructor of the Item class
    public Item(String type) {
        this.type = type;
    }

    // Method to print the order
    public void makeOrder() {

        System.out.println("Creating a new order: ");
    }

    // Setters methods
    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public void setItemPrice() {
        this.itemPrice = initialPrice + additionalPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    // Getters Methods
    public String getType() {
        return type;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}

class Burger extends Item {
    // Burger unique field
    private int toppings;

    // No args constructor will set the default burger type to "Beef"
    public Burger() {
        this("Beef");
    }

    // Main constructor for Burger class
    public Burger(String type) {
        // Calling the Item's main constructor
        super(type);

        // Assigning the base price for the ordered burger
        setInitialPrice(type);
        // Assigning the additional price for the ordered toppings
        double toppingsPrice = toppings * 5.000d;
        setAdditionalPrice(toppingsPrice);
        // Assigning the total price for the burger item
        setItemPrice();
    }

    // Method to assign the base price of the Burger
    public void setInitialPrice(String type) {

        // Getting the burger type based on the first character of the argument
        char burgerType = type.toUpperCase().charAt(0);

        // Assigning the base price for burger based on the burger type
        switch (burgerType) {
            case 'H' -> initialPrice = 45.000d;
            case 'B' -> initialPrice = 40.000d;
            case 'D' -> initialPrice = 50.000d;
            default -> initialPrice = 0.0d;
        }
    }

    // Printing the ordered Burger type, the base price for the Burger type, the toppings added, and the total price for the Burger
    @Override
    public void makeOrder() {
        super.makeOrder();
        System.out.printf("1. Burger%n" +
                "Type: %s%n" +
                "Price: Rp%.3f%n" +
                "Toppings: %d%n" +
                "Item Price: Rp%.3f%n", super.getType(), initialPrice, toppings, super.getItemPrice());
    }

    @Override
    public void setItemPrice(double itemPrice) {
        super.setItemPrice(itemPrice);
    }

    // Method to assign the additional price for Burger
    public void setAdditionalPrice() {

        double additionalPrice;

        // Setting the additional price based on the toppings added, Rp5.000 per topping
        if (getBurgerType() != 'D') {
            additionalPrice = toppings * 5.000d;
            initialPrice += additionalPrice;
        } else {
            initialPrice += 3 * 5.000d;
        }
    }

    // Method to assign the toppings of Burger
    public void setToppings(int toppings) {

        // Checking if the toppings is not negative or more than 3 for any type of Burger unless the Deluxe Burger
        if (toppings < 0) {
            System.out.println("Toppings can't be negative.");
            this.toppings = 0;
        } else if (toppings > 5 && getBurgerType() == 'D') {
            System.out.println("Deluxe Burger can only have maximum of 5 toppings.");
            this.toppings = 5;
        } else if (toppings > 3 && getBurgerType() != 'D') {
            System.out.println("You can only have maximum of 3 toppings.");
            this.toppings = 3;
        } else {
            this.toppings = toppings;
        }
    }

    public char getBurgerType() {

        String type = super.getType();
        return type.toUpperCase().charAt(0);
    }
}

class Drinks extends Item {
    // Drinks unique field
    private String size = "Small";

    // No args constructor will set the default type of drinks to "Coke"
    public Drinks() {
        this("Coke");
    }

    // Main constructor of drinks class to assign the type of drinks ordered
    public Drinks(String type) {
        // Calling the item constructor
        super(type);

        // Setting the base price for the drinks
        setInitialPrice(type);
        // Setting the total drink price based on the base price and the additional price
        setItemPrice();
    }

    // Base price for the drinks item
    public void setInitialPrice(String type) {

        // Getting the drink type based on the first character of the type argument
        char drinkType = type.toUpperCase().charAt(0);

        // Assigning the base price for drinks based on the drink type
        switch (drinkType) {
            case 'C' -> initialPrice += 12.000d;
            case 'T' -> initialPrice += 8.000d;
            default -> initialPrice += 0.0d;
        }
    }

    // Additional price for the drinks item
    public void setAdditionalPrice(String size) {

        this.size = size;

        // Getting the drink size based on the first character of the size argument
        char drinkSize = size.toUpperCase().charAt(0);

        // Assigning the additional price for drinks based on the drink size
        switch (drinkSize) {
            case 'S' -> setAdditionalPrice(2.000d);
            case 'M' -> setAdditionalPrice(5.000d);
            case 'L' -> setAdditionalPrice(10.000d);
            default -> setAdditionalPrice(0.0d);
        }
    }

    // Printing the ordered drink, the size, and the total price for the drinks based on the type and size
    @Override
    public void makeOrder() {
        System.out.printf("2. Drink%n" +
                "Type: %s%n" +
                "Size: %s%n" +
                "Item Price: Rp%.3f%n", super.getType(), size, super.getItemPrice());
    }

    @Override
    public void setItemPrice(double itemPrice) {
        super.setItemPrice(itemPrice);
    }
}


class Side extends Item {

    // No args Constructor will set the default Side to "Fries"
    public Side() {
        this("Fries");
    }

    // Main Constructor
    public Side(String type) {
        // Calling the Item Constructor
        super(type);

        // Setting the base price for Side based on the ordered Side
        setInitialPrice(type);
        setItemPrice();
    }

    // Base price for the side item
    public void setInitialPrice(String type) {

        // Getting the side item type based on the first character
        char sideType = type.toUpperCase().charAt(0);

        // Assigning the base price based on the type
        switch (sideType) {
            case 'F' -> initialPrice += 10.000d;
            case 'R' -> initialPrice += 11.000d;
            default -> initialPrice += 0.0d;
        }
    }

    // Printing the ordered side item and the price
    @Override
    public void makeOrder() {

        System.out.printf("3. Side%n" +
                "%s%n" +
                "Item Price: Rp%.3f%n", super.getType(), getItemPrice());
    }

    @Override
    public void setItemPrice(double itemPrice) {
        super.setItemPrice(itemPrice);
    }
}