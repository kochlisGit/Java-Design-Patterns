package creational.dependencyinjection;

public class VehicleMeasurement
{
    protected final Vehicle vehicle;

    public VehicleMeasurement(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double computeFutureSpeed(int seconds) {
        double acceleration = vehicle.getAcceleration();
        double speed = vehicle.getSpeed();
        return speed + acceleration*seconds;
    }
}
