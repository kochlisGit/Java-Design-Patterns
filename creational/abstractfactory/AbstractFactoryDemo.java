package creational.abstractfactory;

import java.awt.Color;

// Abstract Factory pattern is used to produce similar children, but with different factories.
public class AbstractFactoryDemo
{
    public static void main(String[] Args)
    {
        ActorFactory actorFactory;

        actorFactory = ActorFactoryProducer.getActorFactory(ActorFactoryProducer.TYPE_VEHICLE_FACTORY);
        Actor car = actorFactory.getActor( VehicleFactory.TYPE_CAR, new Color(255, 0, 0) );
        Actor motorcycle = actorFactory.getActor( VehicleFactory.TYPE_MOTORCYCLE, new Color(0, 0, 0) );

        car.buildActor();
        motorcycle.buildActor();

        actorFactory = ActorFactoryProducer.getActorFactory(ActorFactoryProducer.TYPE_PEDESTRIAN_FACTORY);
        Actor child = actorFactory.getActor( PedestrianFactory.TYPE_CHILD, new Color(255, 255, 255) );
        Actor parent = actorFactory.getActor( PedestrianFactory.TYPE_PARENT, new Color(255, 255, 0) );

        child.buildActor();
        parent.buildActor();
    }
}
