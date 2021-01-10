package structural.decorator;

// Decorator pattern is used to extend the functionality of a class, without affecting the already produced sub-classes.
public class DecoratorDemo
{
    public static void main(String[] Args)
    {
        Agent dqn = new DQNAgent("EpsilonGreedy", 0.1, 0.01);
        dqn.train(10);
        System.out.println(dqn);

        Agent nStepDQN = new MultiStepDQNAgent(3);
        nStepDQN.train(10);
        System.out.println(nStepDQN);
    }
}
