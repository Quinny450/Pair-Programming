import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int isWon = 0;
        String turn1 = "X";
        String turn2 = "O";

        ticTacToeMethods game = new ticTacToeMethods();

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("The number associated with each cell is as follows:");
        System.out.println("[1] [2] [3]");
        System.out.println("[4] [5] [6]");
        System.out.println("[7] [8] [9]");

        while (isWon < 9) {
            // Turn 1 input
            System.out.println("Player 1, please enter the cell you would like to place your X in:");
            int cellSelection = input.nextInt();
            input.nextLine();

            System.out.println("Prompt for String input into cellSelection");

            int row1 = ticTacToeMethods.getRow(cellSelection);
            int col1 = ticTacToeMethods.getColumn(cellSelection);

            if (ticTacToeMethods.checkTile(row1, col1)) {
                System.out.println("That tile is already taken! Please select another tile.");
                continue;
            }
            else {
                ticTacToeMethods.printBoard(turn1, row1, col1);
            }

            if (ticTacToeMethods.checkWin()) {
                System.out.println("Player 1 wins!");
                break;
            }

            isWon++;

            // Check for turn limit
            if (isWon >= 9) {
                System.out.println("The game is a draw!");
                break;
            }

            // Turn 2 input
            System.out.println("Player 2, please enter the cell you would like to place your O in:");
            int cellSelection2 = input.nextInt();
            input.nextLine();

            System.out.println("Prompt for String input into cellSelection2");

            int row2 = ticTacToeMethods.getRow(cellSelection2);
            int col2 = ticTacToeMethods.getColumn(cellSelection2);

            ticTacToeMethods.printBoard(turn2, row2, col2);

            if (ticTacToeMethods.checkWin()) {
                System.out.println("Player 2 wins!");
                break;
            }

            isWon++;
        }

        input.close();
    }
}
