package creational.builder;

public class ComputerBuilder
{
    public static Computer buildDesktop()
    {
        Computer desktop = new Computer();
        desktop.addItem( new DesktopCase(60, 20, 60, 35.99) );
        desktop.addItem( new CPU("Intel i7-4970", 120.49) );
        desktop.addItem( new GPU("Nvidia GeForce 1060", 139.99) );
        return desktop;
    }

    public static Computer buildLaptop()
    {
        Computer laptop = new Computer();
        laptop.addItem( new DesktopCase(5, 30, 30, 100.0) );
        laptop.addItem( new CPU("Intel i5-10900", 69.79) );
        laptop.addItem( new GPU("Nvidia GeForce 960", 50.55) );
        return laptop;
    }
}
