package structural.decorator;

public abstract class AgentDecorator implements Agent
{
    protected Agent agent;

    public AgentDecorator(Agent agent) {
        this.agent = agent;
    }

    public abstract void train(int episodes);
}
