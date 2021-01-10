package creational.dependencyinjection;

// Dependency Injection Pattern is used to remove hard dependency between a classes.
public class DependencyInjectionDemo
{
    public static void main(String[] Args)
    {
        Vehicle vehicle = new Vehicle(8);
        vehicle.setSpeed(20);

        VehicleMeasurement measurement = new VehicleMeasurement(vehicle);
        System.out.println( "Vehicle's current speed is " + vehicle.getSpeed() );
        System.out.println( "Vehicle's acceleration is " + vehicle.getAcceleration() );
        System.out.println( "Vehicle's speed after 5 seconds: " + measurement.computeFutureSpeed(5) );

        OptimizedVehicle optVehicle = new OptimizedVehicle(8);
        optVehicle.setSpeed(20);

        measurement = new VehicleMeasurement(optVehicle);
        System.out.println( "Vehicle's current speed is " + optVehicle.getSpeed() );
        System.out.println( "Vehicle's acceleration is " + optVehicle.getAcceleration() );
        System.out.println( "Vehicle's speed after 5 seconds: " + measurement.computeFutureSpeed(5) );
    }
}
