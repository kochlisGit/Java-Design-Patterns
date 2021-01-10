package creational.factory;

import java.awt.Color;

// Factory pattern is used to produce children objects of an abstract class or an interface.
public class FactoryDemo
{
    public static void main(String[] Args)
    {
        Vehicle newCar = VehicleFactory.getVehicle( VehicleFactory.TYPE_CAR, new Color(255, 0, 0) );
        newCar.buildVehicle();

        Vehicle newMotorcycle = VehicleFactory.getVehicle( VehicleFactory.TYPE_MOTORCYCLE, new Color(0, 0, 0) );
        newMotorcycle.buildVehicle();
    }
}
