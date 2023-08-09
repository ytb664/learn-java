public class Side {

    private StringBuilder type;
    private double price = 0.0d;

    public void setSide(String type) {

        char item = type.toUpperCase().charAt(0);

        switch (item) {
            case 'F' -> this.price += 15.000d;
            case 'R' -> this.price += 16.000d;
            case 'P' -> this.price += 17.000d;
            default -> this.price += 0.0d;
        }

        this.type = new StringBuilder(type);

        System.out.printf("%s is added to your order,%n" +
                "total side price: Rp%.3f%n%n", type, price);
    }

    public double getPrice() {
        return price;
    }
}
