package creational.abstractfactory;

import java.awt.Color;

public class Parent extends Pedestrian
{
    public Parent(Color color) {
        super(40, color);
    }

    @Override
    public void buildActor() {
        System.out.println(
                "Parent{" +
                        "age=" + super.getAge() +
                        ", color=" + super.getColor() +
                        '}');
    }
}
