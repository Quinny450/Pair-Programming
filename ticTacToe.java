import java.util.Scanner;

public class ticTacToe
{
    public void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isWon = false;

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1, you are X. Player 2, you are O.");
        System.out.println("Player 1 goes first.");

        while (!isWon)
        {
            System.out.println("Promt for player 1 input (Cell to input to)");
            String cellSelection = input.nextLine();

            System.out.println("Prompt for String input into cellSelection");
            String turn1 = input.nextLine();

            int row1 = ticTacToeMethods.getRow(cellSelection);
            int col1 = ticTacToeMethods.getColumn(cellSelection);

            String gameState = ticTacToeMethods.printBoard(turn1, row1, col1);
            System.out.println(gameState);
        }
    }
}
