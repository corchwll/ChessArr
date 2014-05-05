import java.io.Reader;
import java.io.Writer;

//Copyright © 2014 Tobias Fertig, Daniel Knogl

public class ChessBoard 
{
	char[][] board;
	int moveNumber;
	char onMove;
	
	public ChessBoard()
	{
		this.board = new char[5][6];
		this.moveNumber = 1;
		this.onMove = 'W';
	}
	
	public ChessBoard(String init)
	{
		
	}
	
	public ChessBoard(Reader reader)
	{
		
	}
	
	public String toString()
	{
		String result = "";
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				result = result + board[i][j];
			}
		}
		result = result + ":" + moveNumber + ":" + onMove;
		return result;
	}
	
	public void print(Writer writer)
	{
		
	}
}
