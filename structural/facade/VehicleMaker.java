package structural.facade;

import java.awt.Color;

public class VehicleMaker
{
    private Car car;
    private Motorcycle motorcycle;

    public void buildCar(Color color) {
        car = new Car(color);
        car.buildVehicle();
    }
    public void buildMotorcycle(Color color) {
        motorcycle = new Motorcycle(color);
        motorcycle.buildVehicle();
    }
}
