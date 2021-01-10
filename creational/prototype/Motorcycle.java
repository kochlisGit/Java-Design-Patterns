package creational.prototype;

import java.awt.Color;

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
