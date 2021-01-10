package creational.abstractfactory;

public class ActorFactoryProducer
{
    public static final int TYPE_VEHICLE_FACTORY = 1;
    public static final int TYPE_PEDESTRIAN_FACTORY = 2;

    public static ActorFactory getActorFactory(int type) {
        switch (type) {
            case TYPE_VEHICLE_FACTORY:
                return new VehicleFactory();
            case TYPE_PEDESTRIAN_FACTORY:
                return new PedestrianFactory();
            default:
                return null;
        }
    }
}
