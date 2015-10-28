package is.ru.tictactoe;

public class TicTacToeGrid {

	/****************************
	[0][1][2]
	[3][4][5]
	[6][7][8]
	****************************/
	private Character[] grid;
	private Character winnerToken = null;
	private int[][] possibleWins = 
	{
		{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
		{0, 3, 6}, {1, 4, 7}, {2, 5, 8},
		{0, 4, 8}, {2, 4, 6}
	};

	public TicTacToeGrid() {
		grid = new Character[9];
	}

	public Character[] getGrid(){
		return grid;
	}

	public void insertTokenToSlot(char token, int slotIndex) throws Exception {
		if(grid[slotIndex] != null) 
			throw new Exception("Slot already has token");
		
		grid[slotIndex] = token;
	}
}