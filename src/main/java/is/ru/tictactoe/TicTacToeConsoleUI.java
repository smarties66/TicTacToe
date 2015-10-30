package is.ru.tictactoe;

public class TicTacToeConsoleUI extends TicTacToeLogic {
	
	private int gridIndex = 0;
	
	private Player player1 = new Player 
	{
		name = "Agust",
		Token = 'X',
		winCount = 0
	};
	
	private Player player2 = new Player 
	{
		name = "Andri",
		Token = 'O',
		winCount = 0
	};
	
	public void start() {
		System.out.println("Hello World!");	
		
	}
	
	public int getPlayer1Score() {
		return 0;
	}
	
	public int getPlayer2Score() {
		return 0;
	}
	
	public Character[] getGameGrid() {		
		Character[] gameGrid = new Character[9];		
		return gameGrid;
	}
	
	public void newGame() {
		/*
			TODO: Implement
		*/
	}
	
	public void switchPlayerTokens() {
		/*
			TODO: Implement
		*/
	}
	
	public void insertTokenToGrid(int[][] gridIndex) {
		/*
			TODO: Implement
		*/
	}
	
	public Player getPlayerWhoHasTurn() {
		return player1;
	}
	
	public boolean isRoundOver() {
		return false;
	}
	
	public Player getRoundWinner() {
		return player2;
	}
}