package creational.singleton;

import java.awt.Color;

public enum Vehicle
{
    INSTANCE;

    private final int nWheels;
    private final Color color;
    private double throttle;

    Vehicle() {
        nWheels = 4;
        color = new Color(255, 255, 255);
        throttle = 0;
    }

    public void setThrottle(double throttle) {
        this.throttle = throttle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "nWheels=" + nWheels +
                ", color=" + color +
                ", throttle=" + throttle +
                '}';
    }
}
