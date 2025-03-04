import java.util.Scanner;

public class ticTacToe {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int isWon = 0;
        boolean validTurn1 = true;
        boolean validTurn2 = true;
        
        String turn1 = "X";
        String turn2 = "O";

        ticTacToeMethods game = new ticTacToeMethods();

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("The number associated with each cell is as follows:");
        System.out.println("[1] [2] [3]");
        System.out.println("[4] [5] [6]");
        System.out.println("[7] [8] [9]");

        while (isWon < 9) {
            while (validTurn1) {
                // Turn 1 input
                System.out.println("Player 1, please enter the number for the cell you would like to place your X in:");
                int cellSelection = input.nextInt();
                input.nextLine();

                int row1 = ticTacToeMethods.getRow(cellSelection);
                int col1 = ticTacToeMethods.getColumn(cellSelection);

                if (!ticTacToeMethods.checkTile(row1, col1)) {
                    System.out.println("That tile is already taken! Please select another tile.");
                    validTurn1 = true;
                    validTurn2 = false;
                } else {
                    ticTacToeMethods.printBoard(turn1, row1, col1);
                    isWon++;
                    validTurn1 = false;
                    validTurn2 = true;
                }

                if (ticTacToeMethods.checkWin()) {
                    System.out.println("Player 1 wins!");
                    System.exit(0);
                }
            }

            // Check for turn limit
            if (isWon >= 9) {
                System.out.println("The game is a draw!");
                break;
            }

            while (validTurn2) {
                // Turn 2 input
                System.out.println("Player 2, please enter the number for the cell you would like to place your O in:");
                int cellSelection2 = input.nextInt();
                input.nextLine();

                int row2 = ticTacToeMethods.getRow(cellSelection2);
                int col2 = ticTacToeMethods.getColumn(cellSelection2);

                if (!ticTacToeMethods.checkTile(row2, col2)) {
                    System.out.println("That tile is already taken! Please select another tile.");
                    validTurn2 = true;
                    validTurn1 = false;
                } else {
                    ticTacToeMethods.printBoard(turn2, row2, col2);
                    isWon++;
                    validTurn2 = false;
                    validTurn1 = true;
                }

                if (ticTacToeMethods.checkWin()) {
                    System.out.println("Player 2 wins!");
                    System.exit(0);
                }
            }
        }
        input.close();
    }
}