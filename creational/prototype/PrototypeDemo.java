package creational.prototype;

import java.awt.*;

// Prototype pattern is used to clone / duplicate already created objects.
public class PrototypeDemo
{
    public static void main(String[] Args)
    {
        World world = new World();
        Vehicle ferrari = new Car( new Color(255, 0 , 0) );
        Vehicle honda = new Motorcycle( new Color(0, 0, 0) );

        world.addVehicles(ferrari, 6);
        world.addVehicles(honda, 2);
        world.render();
    }
}
