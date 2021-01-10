package structural.decorator;

public class DQNAgent implements Agent{
    private final String policy;
    private double epsilon;
    private final double learnRate;

    public DQNAgent(String policy, double epsilon, double learnRate) {
        this.policy = policy;
        this.epsilon = epsilon;
        this.learnRate = learnRate;
    }

    public String getPolicy() {
        return policy;
    }
    public double getEpsilon() {
        return epsilon;
    }
    public void setEpsilon(double epsilon) {
        this.epsilon = epsilon;
    }
    public double getLearnRate() {
        return learnRate;
    }

    public void train(int episodes) {
        double loss = 3.0;

        for (int i = 0; i < episodes; i++)
            loss -= learnRate*10;
        System.out.println("Loss = " + loss);
    }

    @Override
    public String toString() {
        return "DQNAgent{" +
                "policy='" + policy + '\'' +
                ", epsilon=" + epsilon +
                ", learnRate=" + learnRate +
                '}';
    }
}
