package creational.prototype;

import java.awt.Color;

public abstract class Vehicle implements Cloneable
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

    public abstract void buildVehicle();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
