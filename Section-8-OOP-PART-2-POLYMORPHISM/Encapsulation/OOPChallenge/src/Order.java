public class Order {

//    private Item item;
    private Burger burger;
    private Drinks drinks;
    private Side side;

    public Order() {
        burger = new Burger();
        drinks = new Drinks();
        side = new Side();
    }

    public void setBurger(String type, int toppings) {
        burger.setBurger(type, toppings);
    }

    public void setDrinks(String type, String size) {
        drinks.setDrinks(type, size);
    }

    public void setSide(String type) {
        side.setSide(type);
    }

    public double getTotal() {
        return burger.getPrice() + drinks.getPrice() + side.getPrice();
    }
}
