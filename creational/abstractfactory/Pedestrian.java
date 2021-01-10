package creational.abstractfactory;

import java.awt.Color;

public abstract class Pedestrian implements Actor
{
    private final int age;
    private final Color color;

    public Pedestrian(int age, Color color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }
    public Color getColor() {
        return color;
    }
}
