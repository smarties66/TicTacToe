package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeGridTest {

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeGridTest");
	}

	@Test
	public void testGetGrid() {
		Character[] expectedGrid = 
		{ 
			null, null, null, 
			null, null, null, 
			null, null, null,
		};

		TicTacToeGrid grid = new TicTacToeGrid(); 
		assertArrayEquals(expectedGrid, grid.getGrid());
	}

	@Test
	public void testInsertXToASlot() {
		Character[] expectedGrid = 
		{ 
			'X', null, null, 
			null, null, null, 
			null, null, null,
		};

		TicTacToeGrid grid = new TicTacToeGrid();
		grid.insertTokenToSlot('X', 0);
		assertArrayEquals(expectedGrid, grid.getGrid());	
	}
}