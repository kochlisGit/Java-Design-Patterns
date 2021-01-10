package creational.abstractfactory;

import java.awt.Color;

public abstract class ActorFactory {
    public abstract Actor getActor(int type, Color color);
}
