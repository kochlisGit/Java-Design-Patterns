package creational.singleton;

public class SafetyAgent
{
    Vehicle vehicle = Vehicle.INSTANCE;

    public void stopVehicle() {
        vehicle.setThrottle(0.0);
    }
}
