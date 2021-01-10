package creational.builder;

public class GPU extends Unit
{
    public GPU(String name, double price) {
        super(name, price);
    }

    @Override
    public String preview() {
        return "GPU{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                '}';
    }
}
