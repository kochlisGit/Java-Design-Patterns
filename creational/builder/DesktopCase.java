package creational.builder;

public class DesktopCase extends ComputerCase
{
    public DesktopCase(double height, double width, double depth, double price) {
        super(height, width, depth, price);
    }

    @Override
    public String preview() {
        return "DesktopCase{" +
                "height=" + super.getHeight() +
                ", width=" + super.getWidth() +
                ", depth=" + super.getDepth() +
                ", price=" + super.getPrice() +
                '}';
    }
}
