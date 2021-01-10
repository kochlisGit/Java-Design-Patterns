package creational.stepbuilder;

// Step Builder pattern is used to build an object step-by-step.
public class StepBuilderDemo
{
    public static void main(String[] Args)
    {
        Computer myComputer = new ComputerBuilder().newComputerBuilder()
                .setCPU("Intel-i7")
                .setGPU("Nvidia GeForce-980")
                .setCase("Desktop Case")
                .build();
        System.out.println(myComputer);

        Computer myLaptop = new ComputerBuilder().newComputerBuilder()
                .setCPU("Intel-i5")
                .setGPU("Nvidia GeForce-1060")
                .setCase("Laptop Case")
                .build();
        System.out.println(myLaptop);

    }
}
