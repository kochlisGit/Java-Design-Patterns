package structural.proxy;

import java.awt.Color;

// Proxy pattern is used to control a real object and hide its details from outside world.
public class ProxyDemo
{
    public static void main(String[] Args)
    {
        VehicleController vehicleController = new VehicleController( new Car( new Color(25, 25, 200) ) );
        vehicleController.buildVehicle();
        vehicleController = new VehicleController( new Car( new Color(200, 25, 25) ) );
        vehicleController.buildVehicle();
    }
}
