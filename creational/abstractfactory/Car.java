package creational.abstractfactory;

import java.awt.Color;

public class Car extends Vehicle
{
    public Car(Color color) {
        super(4, color);
    }

    @Override
    public void buildActor() {
        System.out.println(
                "Car{" +
                "nWheels=" + super.getnWheels() +
                ", color=" + super.getColor() +
                '}');
    }
}
