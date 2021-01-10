package creational.monostate;

// Monostate pattern is used to access global classes fields.
public class MonoStateDemo
{
    public static void main(String[] Args)
    {
        int newNumOfRows = 6;
        int nenNumOfColumns = 6;

        Settings.display();

        Settings.setnRows(newNumOfRows);
        Settings.setnColumns(nenNumOfColumns);

        Settings.display();
    }
}
