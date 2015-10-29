package is.ru.tictactoe;

public class TicTacToeLogic {
	
	private int gameCount;
	private Player player1;
	private Player player2;
	private boolean isPlayer1Turn;
		
	public TicTacToeLogic(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public Player getPlayer1() {
		return this.player1;
	}
	
	public Player getPlayer2() {
		return this.player2;
	}
	
}