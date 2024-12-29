//program to Demo onthe Tic Tac Toe
class TicTacToe
{
	char board[][];
	public TicTacToe()
	{
		board=new board[3][3];		
		initBoard();
	}
	public void initBoard()
	{
		
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;i++)
			{
				board[i][j]=' ';
				
			}
		}
	}
	void display()
	{
		System.out.println("---------------");
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;i++)
			{
				System.out.println(board[i][j]+" | ");
				
			}
			System.out.println();
			System.out.println("------------");
		}
		
		
	}
}
public class LaunchGame
{
	public static void main(String ags[])
	{
		TicTacToe t=new TicTacToe();
		t.display();
		
		
		
	}
	
}