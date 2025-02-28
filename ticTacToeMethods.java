public class ticTacToeMethods {
    public static String[][] gameState;

    public ticTacToeMethods() {
        gameState = new String[][] {
            {"[ ]", "[ ]", "[ ]"},
            {"[ ]", "[ ]", "[ ]"},
            {"[ ]", "[ ]", "[ ]"}
        };
    }

    public static int getColumn(int cellSelection) {
        if (cellSelection == 1 || cellSelection == 4 || cellSelection == 7) {
            return 0;
        } else if (cellSelection == 2 || cellSelection == 5 || cellSelection == 8) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int getRow(int cellSelection) {
        if (cellSelection == 1 || cellSelection == 2 || cellSelection == 3) {
            return 0;
        } else if (cellSelection == 4 || cellSelection == 5 || cellSelection == 6) {
            return 1;
        } else {
            return 2;
        }
    }

    public static boolean checkWin() {
        // Check rows
        for (String[] row : gameState) {
            if (row[0].equals(row[1]) && row[1].equals(row[2]) && !row[0].equals("[ ]")) {
                return true;
            }
        }
        // Check columns
        for (int col = 0; col < gameState[0].length; col++) {
            if (gameState[0][col].equals(gameState[1][col]) && gameState[1][col].equals(gameState[2][col]) && !gameState[0][col].equals("[ ]")) {
                return true;
            }
        }
        // Check diagonal 1
        if (gameState[0][0].equals(gameState[1][1]) && gameState[1][1].equals(gameState[2][2]) && !gameState[0][0].equals("[ ]")) {
            return true;
        }
        // Check diagonal 2
        if (gameState[0][2].equals(gameState[1][1]) && gameState[1][1].equals(gameState[2][0]) && !gameState[0][2].equals("[ ]")) {
            return true;
        }

        return false;
    }

    // Checks if tile is already taken
    public static boolean checkTile(int row, int col) {
        if (gameState[row][col].equals("[ ]")) {
            return true;
        }
        else {
            return false;
        }
    }

    // Prints the gameState array
    public static void printBoard(String val, int row, int col) {
        gameState[row][col] = "[" + val + "]";
        for (int r = 0; r < gameState.length; r++) {
            for (int c = 0; c < gameState[0].length; c++) {
                System.out.print(gameState[r][c] + " ");
            }
            System.out.println();
        }
    }
}
