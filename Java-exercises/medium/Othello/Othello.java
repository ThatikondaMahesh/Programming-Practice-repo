import java.util.Scanner;

public class Othello
{

    final static int player1Symbol = 1;
    final static int player2Symbol = 2;

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        OthelloBoard b = new OthelloBoard();
        boolean p1Turn = true;

        while(true)
        {
            b.print();
            if (!b.hasValidMove(p1Turn ? player1Symbol : player2Symbol))
            {
                System.out.println("No valid moves for player " + (p1Turn ? "1" : "2") + ". Game over.");
                break;
            }

            System.out.println("Player " + (p1Turn ? "1" : "2") + "'s turn. Enter move (x y):");
            int x = s.nextInt();
            int y = s.nextInt();

            boolean validMove = p1Turn ? b.move(player1Symbol, x, y) : b.move(player2Symbol, x, y);

            if (validMove)
            {
                p1Turn = !p1Turn;
            }
            else
            {
                System.out.println("Invalid move. Try again.");
            }
        }

        int winner = b.getWinner();
        if (winner == 0)
        {
            System.out.println("The game is a tie!");
        }
        else
        {
            System.out.println("Player " + (winner == player1Symbol ? "1" : "2") + " wins!");
        }

        s.close();
    }
}
