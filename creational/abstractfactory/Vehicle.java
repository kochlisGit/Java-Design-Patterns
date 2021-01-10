package creational.abstractfactory;

import java.awt.Color;

public abstract class Vehicle implements Actor
{
    private final int nWheels;
    private final Color color;

    public Vehicle(int nWheels, Color color) {
        this.nWheels = nWheels;
        this.color = color;
    }

    public int getnWheels() {
        return nWheels;
    }
    public Color getColor() {
        return color;
    }
}
