package creational.builder;

public abstract class Unit implements Item
{
    private final String name;
    private final double price;

    public Unit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
