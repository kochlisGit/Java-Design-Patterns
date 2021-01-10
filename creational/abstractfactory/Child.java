package creational.abstractfactory;

import java.awt.Color;

public class Child extends Pedestrian
{
    public Child(Color color) {
        super(11, color);
    }

    @Override
    public void buildActor() {
        System.out.println(
                "Child{" +
                        "age=" + super.getAge() +
                        ", color=" + super.getColor() +
                        '}');
    }
}
