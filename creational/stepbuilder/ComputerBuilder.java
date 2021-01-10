package creational.stepbuilder;

public class ComputerBuilder
{
    private String CPU;
    private String GPU;
    private String Case;

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }
    public ComputerBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }
    public ComputerBuilder setCase(String aCase) {
        Case = aCase;
        return this;
    }

    public ComputerBuilder newComputerBuilder() {
        return this;
    }

    public Computer build() {
        return new Computer(CPU, GPU, Case);
    }
}
