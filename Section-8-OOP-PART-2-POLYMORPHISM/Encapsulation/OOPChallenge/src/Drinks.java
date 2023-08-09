public class Drinks {

    private StringBuilder type;
    private String size;
    private Double price = 0.0d;

    public void setType(String type) {

        char item = type.toUpperCase().charAt(0);

        switch (item) {
            case 'C', 'L' -> this.price += 9.500d;
            case 'M' -> this.price += 13.000d;
            default -> this.price += 0.0d;
        }

        this.type = new StringBuilder(type);
    }

    public void setSize(String size) {

        char glass = size.toUpperCase().charAt(0);

        switch (glass) {
            case 'M' -> this.price += 2.500d;
            case 'L' -> this.price += 5.000d;
        }

        System.out.printf("your ordered drinks: %s %s%n" +
                "Drink Price: %.3f%n%n", size, type, price);

        this.size = size;
    }

    public void setDrinks(String type, String size) {
        setType(type);
        setSize(size);
    }

    public Double getPrice() {
        return price;
    }
}
