package behavioral.observer;

import java.util.HashMap;
import java.util.Map;

public class TrafficLightManager
{
    private HashMap<TrafficLight, TrafficLightCounter> trafficMap;

    public TrafficLightManager() {
        trafficMap = new HashMap<>();
    }

    public void addLight(TrafficLight light, TrafficLightCounter counter) {
        trafficMap.put(light, counter);
    }

    public void incrementCounters() {
        for ( Map.Entry<TrafficLight, TrafficLightCounter> entry : trafficMap.entrySet() )
        {
            entry.getValue().increment();
            entry.getKey().setState( entry.getValue().getTime() );
        }
    }
}
