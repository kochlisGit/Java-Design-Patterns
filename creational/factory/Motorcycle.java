package creational.factory;

import java.awt.*;

public class Motorcycle extends Vehicle
{
    public Motorcycle(Color color) {
        super(2, color);
    }

    @Override
    public void buildVehicle() {
        System.out.println(
                "Motorcycle{" +
                        "nWheels=" + super.getnWheels() +
                        ", color=" + super.getColor() +
                        '}');
    }
}