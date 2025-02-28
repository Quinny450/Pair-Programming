import java.util.Scanner;

public class ticTacToe
{
    public void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isWon = false;

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("The number assiciated with each cell is as follows:");
        System.out.println("[1] [2] [3]");
        System.out.println("[4] [5] [6]");
        System.out.println("[7] [8] [9]");

        while (!isWon)
        {
            System.out.println("Promt for player 1 input (Cell to input to)");
            int cellSelection = input.nextInt();

            System.out.println("Prompt for String input into cellSelection");
            String turn1 = input.nextLine();

            int row1 = ticTacToeMethods.getRow(cellSelection);
            int col1 = ticTacToeMethods.getColumn(cellSelection);

            String gameState = ticTacToeMethods.printBoard(turn1, row1, col1);
            System.out.println(gameState);
        }
    }
}
