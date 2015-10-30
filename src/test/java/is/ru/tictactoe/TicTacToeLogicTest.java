package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TicTacToeLogicTest {
	
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeLogicTest");
	}

	@Test
	public void testGetPlayerName() {
		Player player1 = mock(Player.class);
		when(player1.getName()).thenReturn("Sverrir");

		Player player2 = mock(Player.class);
		when(player2.getName()).thenReturn("Agust");

		TicTacToeLogic logic = new TicTacToeLogic(player1, player2, new TicTacToeGrid());
		assertEquals(logic.getPlayer1Name(), "Sverrir");
		assertEquals(logic.getPlayer2Name(), "Agust");
	}
	
	@Test
	public void testGetPlayerScore() {
		Player player1 = mock(Player.class);
		when(player1.getWinCount()).thenReturn(2);

		Player player2 = mock(Player.class);
		when(player2.getWinCount()).thenReturn(3);

		TicTacToeLogic logic = new TicTacToeLogic(player1, player2, new TicTacToeGrid());
		assertEquals(logic.getPlayer1Score(), 2);
		assertEquals(logic.getPlayer2Score(), 3);
	}
	
	@Test
	public void testGetGameGrid() {
		TicTacToeGrid grid = mock(TicTacToeGrid.class);
		Player player1 = mock(Player.class);
		Player player2 = mock(Player.class);
		Character[] expectedGrid = 
		{ 
			null, null, null, 
			null, null, null, 
			null, null, null,
		};
		when(grid.getGrid()).thenReturn(expectedGrid);

		TicTacToeLogic logic = new TicTacToeLogic(player1, player2, new TicTacToeGrid());
		assertEquals(logic.getGameGrid(), expectedGrid);
	}
	
}