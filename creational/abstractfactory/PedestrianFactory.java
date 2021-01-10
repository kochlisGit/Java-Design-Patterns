package creational.abstractfactory;

import java.awt.Color;

public class PedestrianFactory extends ActorFactory
{
    public static final int TYPE_CHILD = 1;
    public static final int TYPE_PARENT = 2;

    public Actor getActor(int type, Color color) {
        switch (type) {
            case TYPE_CHILD:
                return new Child(color);
            case TYPE_PARENT:
                return new Parent(color);
            default:
                return null;
        }
    }
}