package creational.factory;

import java.awt.Color;

public class VehicleFactory
{
    public static final int TYPE_CAR = 1;
    public static final int TYPE_MOTORCYCLE = 2;

    public static Vehicle getVehicle(int type, Color color) {
        switch (type) {
            case TYPE_CAR:
                return new Car(color);
            case TYPE_MOTORCYCLE:
                return new Motorcycle(color);
            default:
                return null;
        }
    }
}
