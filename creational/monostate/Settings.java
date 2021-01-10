package creational.monostate;

public class Settings
{
    private static int nRows;
    private static int nColumns;
    private static String stylesheet;

    static {
        nRows = 3;
        nColumns = 4;
        stylesheet = "Default";
    }

    public static int getnRows() {
        return nRows;
    }
    public static void setnRows(int nRows) {
        Settings.nRows = nRows;
    }
    public static int getnColumns() {
        return nColumns;
    }
    public static void setnColumns(int nColumns) {
        Settings.nColumns = nColumns;
    }
    public static String getStylesheet() {
        return stylesheet;
    }
    public static void setStylesheet(String stylesheet) {
        Settings.stylesheet = stylesheet;
    }

    public static void display()
    {
        System.out.println( "GridCell Rows: " + Settings.getnRows() );
        System.out.println( "GridCell Columns: " + Settings.getnColumns() );
        System.out.println( "GridCell Style: " + Settings.getStylesheet() );
    }
}
