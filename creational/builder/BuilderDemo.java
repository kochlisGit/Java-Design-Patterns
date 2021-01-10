package creational.builder;

// Builder pattern is used to build objects of the same interface.
public class BuilderDemo
{
    public static void main(String[] Args)
    {
        Computer myDesktop = ComputerBuilder.buildDesktop();
        myDesktop.preview();
        System.out.println( "Cost = " + myDesktop.computePrice() );

        Computer myLaptop = ComputerBuilder.buildLaptop();
        myLaptop.preview();
        System.out.println( "Cost = " + myLaptop.computePrice() );
    }
}
