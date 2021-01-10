package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class World
{
    private final List<Vehicle> vehicleList;

    public World() {
        vehicleList = new ArrayList<>();
    }

    public void addVehicles(Vehicle vehiclePrototype, int numOfVehicles) {
        for (int i = 0; i < numOfVehicles; i++)
            vehicleList.add( (Vehicle) vehiclePrototype.clone() );
    }

    public void render() {
        for (Vehicle v : vehicleList)
            v.buildVehicle();
    }
}
