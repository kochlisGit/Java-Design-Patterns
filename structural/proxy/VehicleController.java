package structural.proxy;

public class VehicleController
{
    private final Vehicle vehicle;

    public VehicleController(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void buildVehicle() {
        vehicle.buildVehicle();
    }
}
