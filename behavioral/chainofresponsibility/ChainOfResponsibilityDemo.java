package behavioral.chainofresponsibility;

// This pattern is used to execute a sequence of tasks one after another.
public class ChainOfResponsibilityDemo
{
    public static void main(String[] Args)
    {
        ItemBuilder skeletonBuilder = new SkeletonBuilder(1200);
        ItemBuilder doorBuilder = new DoorBuilder(520);
        ItemBuilder wheelBuilder = new WheelBuilder(320);
        ItemBuilder steeringWheel = new SteeringWheel(280);

        skeletonBuilder.setNextBuilder(doorBuilder);
        doorBuilder.setNextBuilder(wheelBuilder);
        wheelBuilder.setNextBuilder(steeringWheel);

        skeletonBuilder.build();
    }
}
