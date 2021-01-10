package creational.stepbuilder;

public class Computer
{
    private final String CPU;
    private final String GPU;
    private final String Case;

    public Computer(String CPU, String GPU, String aCase) {
        this.CPU = CPU;
        this.GPU = GPU;
        Case = aCase;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", Case='" + Case + '\'' +
                '}';
    }
}
