package creational.dependencyinjection;

public class Vehicle
{
    private final double acceleration;
    private double speed;

    public Vehicle(double acceleration) {
        this.acceleration = acceleration;
    }

    public double getAcceleration() {
        return acceleration;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
