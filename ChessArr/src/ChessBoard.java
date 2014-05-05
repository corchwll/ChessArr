import java.io.BufferedReader;
import java.io.IOException;
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
		board = new char[5][6];
		String[] parts = init.split(":");
		char[] positions = parts[0].toCharArray();
		
		int i = 0;
		int j = 0;
		for(char c : positions)
		{
			board[i][j] = c;
			j++;
			if(j == 6)
			{
				j = 0;
				i++;
			}
		}
		
		this.moveNumber = Integer.parseInt(parts[1]);
		this.onMove = parts[2].charAt(0);
	}
	
	public ChessBoard(Reader reader)
	{
		BufferedReader br = new BufferedReader(reader);
		board = new char[5][6];
		String init = "";
		try
		{
			init = br.readLine();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		String[] parts = init.split(":");
		char[] positions = parts[0].toCharArray();
		
		int i = 0;
		int j = 0;
		for(char c : positions)
		{
			board[i][j] = c;
			j++;
			if(j == 6)
			{
				j = 0;
				i++;
			}
		}
		
		this.moveNumber = Integer.parseInt(parts[1]);
		this.onMove = parts[2].charAt(0);
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
