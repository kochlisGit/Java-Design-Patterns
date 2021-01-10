package creational.builder;

public class CPU extends Unit
{
    public CPU(String name, double price) {
        super(name, price);
    }

    @Override
    public String preview() {
        return "CPU{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
