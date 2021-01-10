package behavioral.observer;

public class TrafficLightCounter
{
    public int time;

    public TrafficLightCounter(int time) {
        this.time = time;
    }
    public void increment() {
        time++;
    }
    public int getTime() {
        return time;
    }
}
