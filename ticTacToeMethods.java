public class ticTacToeMethods
{
    public String[][] gameState = new String[3][3];
    gameState = new String[][]
    {
        {"[ ]", "[ ]", "[ ]"},
        {"[ ]", "[ ]", "[ ]"},
        {"[ ]", "[ ]", "[ ]"}
    };

    public static int getColumn(int cellSelection)
    {
        if (cellSelection == 1 || cellSelection == 4 || cellSelection == 7)
        {
            return 0;
        }
        else if (cellSelection == 2 || cellSelection == 5 || cellSelection == 8)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }

    public static int getRow(int cellSelection)
    {
        if (cellSelection == 1 || cellSelection == 2 || cellSelection == 3)
        {
            return 0;
        }
        else if (cellSelection == 4 || cellSelection == 5 || cellSelection == 6)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }

    // Prints the gameState array
    public static String printBoard(String val, int row, int col)
    {

    }
}
