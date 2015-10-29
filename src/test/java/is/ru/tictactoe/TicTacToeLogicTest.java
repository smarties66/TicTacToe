package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeLogicTest {
	
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeLogicTest");
	}
	
	@Test
	public void testIfCorrectPlayerReturned() {
		
		Player p1 = new Player("Simmi", 'X');
		Player p2 = new Player("Jói", 'O');
		
		TicTacToeLogic tic = new TicTacToeLogic(p1, p2);
		
		Player player1FromTic = tic.getPlayer1();
		assertEquals("Simmi", player1FromTic.getName());
		assertEquals('X', player1FromTic.getToken());
	}
	
}