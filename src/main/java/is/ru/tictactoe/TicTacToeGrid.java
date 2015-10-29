package is.ru.tictactoe;

public class TicTacToeGrid {

	/****************************
	[0][1][2]
	[3][4][5]
	[6][7][8]
	****************************/
	private Character[] grid;
	private Character winnerToken = null;
	int tokenCounter = 0;
	private int[][] possibleWins = 
	{
		{0, 1, 2}, {3, 4, 5}, {6, 7, 8},
		{0, 3, 6}, {1, 4, 7}, {2, 5, 8},
		{0, 4, 8}, {2, 4, 6}
	};

	public TicTacToeGrid() {
		grid = new Character[9];
	}

	public TicTacToeGrid(Character[] grid) {
		this.grid = grid;
		checkGrid();
		fixTokenCounter();
		isWin();
	}

	private void checkGrid()
	{
		if(grid.length != 9)
			throw new IllegalStateException("TicTacToeGrid must be of size 9. Illegal Size: " + grid.length);
	}

	private void fixTokenCounter()
	{
		tokenCounter = 0;

		for(Character token : grid) {
			if(token != null) tokenCounter++;
		}
	}

	public Character[] getGrid(){
		return grid;
	}

	public void insertTokenToSlot(char token, int slotIndex) throws  SlotAlreadyFilledException {
		checkIndex(slotIndex);

		if(isGameOver()) 
			throw new IllegalStateException("Illegal State: Game over, token cannot be inserted"); 

		grid[slotIndex] = token;
		tokenCounter++;
		isWin();
	}

	private void checkIndex(int index) throws SlotAlreadyFilledException {
		if(index < 0 || index > 8)
			throw new IndexOutOfBoundsException("Index of slot ranges between 0 and 8. Invalid index: " + index);
		else if(grid[index] != null)
			throw new SlotAlreadyFilledException("Slot already has token");
	}

	public boolean isGameOver() {
		return winnerToken != null || tokenCounter == grid.length;
	}

	public boolean isWin() {
		
		if(winnerToken != null) return true;

		for(int[] i : possibleWins) {
			if(grid[i[0]] != null && grid[i[0]].equals(grid[i[1]]) && grid[i[1]].equals(grid[i[2]])) {
				winnerToken = grid[i[0]]; 
				return true;
			}
		}

		return false;
	}

	public Character getWinnerToken()
	{
		return winnerToken;
	}

	public boolean isDraw() {
		return tokenCounter == grid.length && winnerToken == null;
	}
}