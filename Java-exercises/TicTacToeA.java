//program to Demo onthe Tic Tac Toe
import java.util.*;
class TicTacToeA
{
	 static char[][] board;
	public TicTacToeA()
	{
		board=new char[3][3];		
		initBoard();
	}
	public static void initBoard()
	{
		
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j]=' ';
				
			}
		}
	}
	 public static  void disBoard()
	{
		System.out.println("--------------");
		for(int i=0;i<board.length;i++)
		{
			System.out.print(" | ");
			for(int j=0;j<board[i].length;j++)
			{
				System.out.print(board[i][j]+" | ");
				
			}
			System.out.println();
			System.out.println("---------------");
		}
	}
	 static void placeMark(int row,int col,char mark)
	{
		if(row>=0 && row<=2 &&col>=0 && col<=2)
		{
		  board[row][col]=mark;
		}
		else 
		{
			System.out.println("Invalid index");
		}
	}
	static boolean checkColWin()
	{
		for(int j=0;j<=2;j++)
		{
			if(board[0][j]!=' '&&(board[0][j]==board[1][j] &&board[2][j]==board[1][j] ))
			{
				return true;
			}
		}
		return false;
		
	}
	
	 static boolean checkRowWin()
	{
		for(int j=0;j<=2;j++)
		{
			if( board[j][0]!=' '&&( board[j][0]==board[j][1] &&board[j][1]==board[j][2] ))
			{
				return true;
			}
		}
		return false;
	}
	static boolean checkDaigWin()
	{
		
			if((board[0][0]!=' '&&board[0][0]==board[1][1] &&board[1][1]==board[2][2]) ||(board[0][2]!=' '&&board[0][2]==board[1][1] &&board[1][1]==board[2][0]))
			{
				return true;
			}
			else
			{
		      return false;
			}
		
	}
	
	
}

class AIPlayer
{
	String name;
	char mark;
	AIPlayer(String name,char mark)
	{
		this.name=name;
		this.mark=mark;		
	}
	void makeMove()
	{
		Scanner scan =new Scanner(System.in);
		int row;
		int col;
		do
		{
		   Random r=new Random();,,,,,,
			row=r.nextInt(3);
			col=r.nextInt(3);
			
		}while(!isValidMove(row,col));
		TicTacToeA.placeMark(row,col,mark);
	}
	boolean isValidMove(int row ,int col)
	{
		if(row>=0 && row<=2 &&col>=0 && col<=2)
		{
			if(TicTacToe.board[row][col]==' ')
			{
				return true;
			}
			
		}
		
		return false;	
	}
	
	
}
class HumanPlayer
{
	String name;
	char mark;
	HumanPlayer(String name,char mark)
	{
		this.name=name;
		this.mark=mark;		
	}
	void makeMove()
	{
		Scanner scan =new Scanner(System.in);
		int row;
		int col;
		do
		{
		 System.out.println("Enter the row and col");
			row=scan.nextInt();
			col=scan.nextInt();
			
		}while(!isValidMove(row,col));
		TicTacToe.placeMark(row,col,mark);
	}
	boolean isValidMove(int row ,int col)
	{
		if(row>=0 && row<=2 &&col>=0 && col<=2)
		{
			if(TicTacToe.board[row][col]==' ')
			{
				return true;
			}
			
		}
		
		return false;	
	}
	
	
}
public class LaunchGame
{
	public static void main(String ags[])
	{
		 TicTacToe t=new TicTacToe();
		 HumanPlayer p1=new HumanPlayer("Varun",'X');
		 AIPlayer p2=new AIPlayer("TAI",'O');
		 HumanPlayer cp;
		 cp=p1;
		 while(true)
		 {
		 System.out.println(cp.name+"turn");
		 cp.makeMove();
		 TicTacToe.disBoard();
		 if(TicTacToeA.checkColWin()||TicTacToeA.checkDaigWin()||TicTacToeA.checkRowWin())
		 {
			 System.out.println(cp.name+" Won");
			 break;
		 }
		 else
		 {
			 if(cp==p1)
			 {
				cp =p2;
				 
			 }
			 else
			 {
				 cp=p1;	 
			 }
		 }
	    }
		
	}
	
}