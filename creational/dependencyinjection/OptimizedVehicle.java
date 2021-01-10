package creational.dependencyinjection;

public class OptimizedVehicle extends Vehicle
{
    private static final double AIR_RESISTANCE = 0.02;

    public OptimizedVehicle(double acceleration) {
        super(acceleration);
    }

    @Override
    public double getAcceleration() {
        return super.getAcceleration() * (1 - AIR_RESISTANCE);
    }
}
