package creational.singleton;

// Singleton pattern is used to share and access a global object.
public class SingletonDemo
{
    public static void main(String[] Args)
    {
        Vehicle vehicle = Vehicle.INSTANCE;
        NavigationAgent navigationAgent = new NavigationAgent();
        SafetyAgent safetyAgent = new SafetyAgent();

        navigationAgent.navigate(1.0);
        System.out.println(vehicle);
        safetyAgent.stopVehicle();
        System.out.println(vehicle);
    }
}
