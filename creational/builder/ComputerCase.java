package creational.builder;

public abstract class ComputerCase implements Item
{
    private final double height;
    private final double width;
    private final double depth;
    private final double price;

    public ComputerCase(double height, double width, double depth, double price) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.price = price;
    }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public double getDepth() {
        return depth;
    }
    public double getPrice() {
        return price;
    }
}
