package com.anjar.ContextManager;

public class ContextManager {
	public ContextManager() {
		initMap();
	}
	
	//BAGIAN MAP
	private char[][] map;
	private final char INVALID_LOCATION = 'X';
	private void initMap()
	{
		map = new char[4][4];
		for(int ii=0; ii<map.length; ii++)
		{
			for(int jj=0; jj<map[ii].length; jj++)
			{
				map[ii][jj] = INVALID_LOCATION;
			}
		}
		map[0][1] = 'A';
		map[0][2] = 'B';
		map[1][0] = 'C';
		map[1][1] = 'D';
		map[1][2] = 'E';
		map[2][2] = 'F';
		map[2][3] = 'G';
		map[3][1] = 'H';
		map[3][2] = 'I';
	}
	
	public char getLocation(int x, int y)
	{
		return map[x][y];
	}
	
	public boolean isValidLocation(int x, int y)
	{
		try
		{
			return map[x][y] != INVALID_LOCATION;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			return false;
		}
	}
}