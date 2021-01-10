package creational.abstractfactory;

import java.awt.Color;

public class Motorcycle extends Vehicle
{
    public Motorcycle(Color color) {
        super(2, color);
    }

    @Override
    public void buildActor() {
        System.out.println(
                "Motorcycle{" +
                        "nWheels=" + super.getnWheels() +
                        ", color=" + super.getColor() +
                        '}');
    }
}
