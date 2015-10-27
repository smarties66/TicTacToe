package is.ru.tictactoe;

public class Player
{
	private String name;
	private int winCount;
	private char token;

	public Player(String name, char token) {
		this.name = name;
		this.token = token;
		this.winCount = 0;
	}

	public String getName() {
		return this.name;
	}

	public int getWinCount() {
		return this.winCount;
	}

	public char getToken() {
		return this.token;
	}

	public void setToken(char token) {
		this.token = token;
	}

	public void incrementWinCount() {
		this.winCount++;
	}
}