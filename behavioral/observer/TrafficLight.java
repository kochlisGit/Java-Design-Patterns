package behavioral.observer;

public class TrafficLight
{
    private final String id;
    private String state;

    public TrafficLight(String id) {
        this.id = id;
    }

    public void setState(int time) {
        if (time % 6 < 3)
            state = "Red";
        else
            state = "Green";
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "id='" + id + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
