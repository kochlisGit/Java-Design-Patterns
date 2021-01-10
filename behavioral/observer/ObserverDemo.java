package behavioral.observer;

// Observer pattern is used to notify other objects, when detecting any change/update.
public class ObserverDemo
{
    public static void main(String[] Args)
    {
        TrafficLight light1 = new TrafficLight("light1");
        TrafficLightCounter counter1 = new TrafficLightCounter(2);

        TrafficLight light2 = new TrafficLight("light2");
        TrafficLightCounter counter2 = new TrafficLightCounter(4);

        TrafficLight light3 = new TrafficLight("light3");
        TrafficLightCounter counter3 = new TrafficLightCounter(1);

        TrafficLightManager trafficManager = new TrafficLightManager();
        trafficManager.addLight(light1, counter1);
        trafficManager.addLight(light2, counter2);
        trafficManager.addLight(light3, counter3);

        for (int i = 0; i < 12; i++) {
            trafficManager.incrementCounters();
            System.out.println("\nIteration " + i);
            System.out.println(light1);
            System.out.println(light2);
            System.out.println(light3);
        }

    }
}
