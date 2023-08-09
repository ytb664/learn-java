public class Burger {

    private StringBuilder type;
    private int toppings;
    private Double price = 0.0d;

    public void setType(String type) {

        char item = type.toUpperCase().charAt(0);

        switch (item) {
            case 'C' -> this.price += 40.000d;
            case 'B' -> this.price += 35.000d;
            default -> this.price += 0.0d;
        }

        String burgerType = type.substring(0, type.indexOf("Burger"));

        this.type = new StringBuilder(burgerType + " Burger");

        System.out.printf("%s is added to the order, current order price: " +
                "Rp%.3f%n", this.type, price);
    }

    public void setToppings(int toppings) {

        if (toppings > 3) {
            System.out.println("You can only add 3 toppings!");
        }

        this.price += toppings * 7.500d;

        System.out.printf("%dx toppings is added, current order price: " +
                "Rp%.3f%n", toppings, price);

        this.toppings = toppings;
    }

    public void setBurger(String type, int toppings) {
        setType(type);
        setToppings(toppings);

        System.out.printf("Your Order:%n" +
                "1. %s%n" +
                "2. %dx toppings%n" +
                "Total Price: %.3f%n%n", this.type, toppings, price);
    }

    public Double getPrice() {
        return price;
    }
}
