package structural.facade;

import java.awt.*;

// Facade pattern is used to group functionalities of similar classes.
public class FacadeDemo
{
    public static void main(String[] Args)
    {
        VehicleMaker maker = new VehicleMaker();
        maker.buildCar( new Color(168, 31, 31) );
        maker.buildMotorcycle( new Color(26, 26, 82) );
    }
}
