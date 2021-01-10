package creational.abstractfactory;

import java.awt.Color;

public class VehicleFactory extends ActorFactory
{
    public static final int TYPE_CAR = 1;
    public static final int TYPE_MOTORCYCLE = 2;

    public Actor getActor(int type, Color color) {
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
