package creational.singleton;

public class NavigationAgent
{
    private final Vehicle vehicle = Vehicle.INSTANCE;

    public void navigate(double throttle) {
        vehicle.setThrottle(0.5);
    }
}
