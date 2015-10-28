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
		
		try { grid.insertTokenToSlot('X', 0); }
		catch(Exception e) {}

		assertArrayEquals(expectedGrid, grid.getGrid());	
	}

	@Test
	public void testInsertTokenToSlotThatIsNotEmpty() {
		Character[] expectedGrid = 
		{ 
			'X', null, null, 
			null, null, null, 
			null, null, null,
		};

		TicTacToeGrid grid = new TicTacToeGrid();
		
		try { grid.insertTokenToSlot('X', 0); }
		catch(Exception e){}

		try {
			grid.insertTokenToSlot('O', 0);
			fail("Should have thrown exception");
		}catch(SlotAlreadyFilledException e){
			assertEquals("Slot already has token", e.getMessage());
		}
	}
}