package is.ru.tictactoe;

public class TicTacToeLogic {
	
	private int gameCount;
	private Player player1;
	private Player player2;
	private boolean isPlayer1Turn;
	private TicTacToeGrid grid;
		
	public TicTacToeLogic(Player player1, Player player2, TicTacToeGrid grid) {
		this.player1 = player1;
		this.player2 = player2;
		this.grid = grid;
	}

	public String getPlayer1Name() {
		return player1.getName();
	}

	public String getPlayer2Name() {
		return player2.getName();
	}
	
}