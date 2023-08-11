public class Item {

    private String type;
    protected double initialPrice;
    private double additionalPrice;
    private double itemPrice;

    public Item() {
    }

    public Item(String type) {
        this.type = type;
    }

    public void makeOrder() {

        System.out.println("Creating a new order: ");
    }

    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

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
    private int toppings;

    public Burger() {
        this("Beef");
    }

    public Burger(String type) {
        super(type);

        setInitialPrice(type);
        setAdditionalPrice(toppings * 5.000d);
        setItemPrice(initialPrice + getAdditionalPrice());
    }



    public void setInitialPrice(String type) {

        char burgerType = type.toUpperCase().charAt(0);

        switch (burgerType) {
            case 'H' -> initialPrice += 45.000d;
            case 'B' -> initialPrice += 40.000d;
            default -> initialPrice += 0.0d;
        }
    }

    @Override
    public void makeOrder() {
        super.makeOrder();
        System.out.printf("1. Burger%n" +
                "Type: %s%n" +
                "Price: Rp%.3f%n" +
                "Toppings: %d%n" +
                "Item Price: Rp%.3f%n", super.getType(), initialPrice, toppings, super.getItemPrice());
    }

    public void setAdditionalPrice() {

        setAdditionalPrice(toppings * 5.000e);
    }

    public void setToppings(int toppings) {

        if (toppings < 0) {
            System.out.println("Toppings can't be negative.");
            this.toppings = 0;
        } else if (toppings > 3) {
            System.out.println("You can only have maximum of 3 toppings.");
            this.toppings = 3;
        } else {
            this.toppings = toppings;
        }
    }
}

class Drinks extends Item {
    private String size;

    public Drinks() {
        this("Coke");
    }

    public Drinks(String type) {
        super(type);

        setInitialPrice(type);
        setItemPrice(initialPrice + getAdditionalPrice());
    }

    public void setInitialPrice(String type) {

        char drinkType = type.toUpperCase().charAt(0);

        switch (drinkType) {
            case 'C' -> initialPrice += 12.000d;
            case 'T' -> initialPrice += 8.000d;
            default -> initialPrice += 0.0d;
        }
    }

    public void setAdditionalPrice(String size) {

        char drinkSize = size.toUpperCase().charAt(0);

        switch (drinkSize) {
            case 'S' -> super.setAdditionalPrice(2.000d);
            case 'M' -> super.setAdditionalPrice(5.000d);
            case 'L' -> super.setAdditionalPrice(10.000d);
            default -> super.setAdditionalPrice(0.0d);
        }
    }

    @Override
    public void makeOrder() {
        System.out.printf("2. Drink%n" +
                "Type: %s%n" +
                "Size: %s%n" +
                "Item Price: Rp%.3f%n", super.getType(), size, super.getItemPrice());
    }
}

class Side extends Item {

    public Side() {
        this("Ring");
    }

    public Side(String type) {
        super(type);

        setInitialPrice(type);
        setItemPrice(initialPrice);
    }

    public void setInitialPrice(String type) {

        char sideType = type.toUpperCase().charAt(0);

        switch (sideType) {
            case 'F' -> initialPrice += 10.000d;
            case 'R' -> initialPrice += 11.000d;
            default -> initialPrice += 0.0d;
        }
    }

    @Override
    public void makeOrder() {

        System.out.printf("3. Side%n" +
                "%s%n" +
                "Item Price: Rp%.3f%n", super.getType(), initialPrice, super.getItemPrice());
    }
}