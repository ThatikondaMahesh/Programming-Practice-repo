// program for othelloBoard

import java.util.Scanner;

public class OthelloBoard
{

    private int board[][];
    final static int player1Symbol = 1;
    final static int player2Symbol = 2;

    public OthelloBoard()
    {
        board = new int[8][8];
        // Initialize the board with starting pieces
        board[3][3] = player1Symbol;
        board[3][4] = player2Symbol;
        board[4][3] = player2Symbol;
        board[4][4] = player1Symbol;
    }

    public void print()
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean move(int symbol, int x, int y)
    {
        if (x < 0 || x >= 8 || y < 0 || y >= 8 || board[x][y] != 0)
        {
            return false; // Invalid move: position out of bounds or occupied
        }

        int opponent = symbol == player1Symbol ? player2Symbol : player1Symbol;
        boolean validMove = false;

        // Check all eight directions for valid flips
        for (int dx = -1; dx <= 1; dx++)
        {
            for (int dy = -1; dy <= 1; dy++)
            {
                if (dx == 0 && dy == 0)
                {
                    continue; // Skip the current position
                }

                int nx = x + dx, ny = y + dy;
                if (nx < 0 || nx >= 8 || ny < 0 || ny >= 8 || board[nx][ny] != opponent)
                {
                    continue; // No opponent in this direction
                }

                // Check for a sequence of opponent's pieces followed by the player's piece
                while (nx >= 0 && nx < 8 && ny >= 0 && ny < 8 && board[nx][ny] == opponent)
                {
                    nx += dx;
                    ny += dy;
                }
                if (nx < 0 || nx >= 8 || ny < 0 || ny >= 8 || board[nx][ny] != symbol)
                {
                    continue; // No friendly piece to end the sequence
                }

                // Flip the opponent's pieces
                nx -= dx;
                ny -= dy;
                while (nx != x || ny != y)
                {
                    board[nx][ny] = symbol;
                    nx -= dx;
                    ny -= dy;
                }
                validMove = true;
            }
        }

        if (validMove)
        {
            board[x][y] = symbol;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean hasValidMove(int symbol)
    {
        for (int x = 0; x < 8; x++)
        {
            for (int y = 0; y < 8; y++)
            {
                if (move(symbol, x, y))
                {
                    // Undo the move
                    board[x][y] = 0;
                    return true;
                }
            }
        }
        return false;
    }

    public int getWinner()
    {
        int p1Count = 0;
        int p2Count = 0;

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (board[i][j] == player1Symbol) p1Count++;
                if (board[i][j] == player2Symbol) p2Count++;
            }
        }

        if (p1Count > p2Count) return player1Symbol;
        if (p2Count > p1Count) return player2Symbol;
        return 0; // Tie
    }
}
