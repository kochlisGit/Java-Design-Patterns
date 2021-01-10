package structural.decorator;

public class MultiStepDQNAgent extends AgentDecorator
{
    private final int nSteps;

    public MultiStepDQNAgent(int nSteps) {
        super(new DQNAgent("EpsilonDecayPolicy", 1.0, 0.01) );
        this.nSteps = nSteps;
    }

    @Override
    public void train(int episodes) {
        double loss = 3.0;
        double epsilon = ( (DQNAgent) super.agent ).getEpsilon();
        double learnRate = ( (DQNAgent) super.agent ).getLearnRate();

        for (int i = 0; i < episodes; i++) {
            loss -= learnRate*10*nSteps;
            epsilon -= 0.05;
        }
        ( (DQNAgent) super.agent ).setEpsilon(epsilon);

        System.out.println("Loss = " + loss);
    }

    @Override
    public String toString() {
        return "MultiStepDQNAgent{" +
                "nSteps=" + nSteps +
                ", agent=" + agent +
                '}';
    }
}
