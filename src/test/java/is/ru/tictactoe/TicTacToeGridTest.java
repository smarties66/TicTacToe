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
		TicTacToeGrid grid = new TicTacToeGrid();
		
		try { grid.insertTokenToSlot('X', 0); }
		catch(Exception e){}

		try {
			grid.insertTokenToSlot('O', 0);
			fail("Should have thrown SlotAlreadyFilledException");
		}catch(SlotAlreadyFilledException e){
			assertEquals("Slot already has token", e.getMessage());
		}
	}

	@Test
	public void testInsertTokenOutOfBounds() {
		TicTacToeGrid grid = new TicTacToeGrid();

		try { 
			grid.insertTokenToSlot('X', 10);
			fail("Should have thrown IndexOutOfBoundsException"); 
		}
		catch(IndexOutOfBoundsException e) {
			assertEquals("Index of slot ranges between 0 and 8. Invalid index: 10", e.getMessage());	
		}catch(Exception e) {/*DO NOTHING*/}
	}

	@Test
	public void testSetTicTacToeGridStateConstructor() {
		Character[] inputGrid = 
		{ 
			'X', 'O', 'X', 
			'O', 'O', 'X', 
			'X', 'X', 'O',
		};

		TicTacToeGrid grid = new TicTacToeGrid(inputGrid);
		assertArrayEquals(inputGrid, grid.getGrid());

	}

	@Test
	public void testInitGridWithInvalidSize() {
		Character[] inputGrid = new Character[10];

		try {
			TicTacToeGrid grid = new TicTacToeGrid(inputGrid);
			fail("Should have thrown IllegalStateException");
		}catch(IllegalStateException e) {
			assertEquals("TicTacToeGrid must be of size 9. Illegal Size: 10", e.getMessage());
		}
	}

	@Test
	public void testIsWin() {
		Character[] inputGrid = 
		{ 
			'X', 'O', 'X', 
			'O', 'O', 'X', 
			'X', 'X', 'O',
		};

		TicTacToeGrid grid = new TicTacToeGrid(inputGrid);
		assertEquals(false, grid.isWin());

		Character[] inputGrid2 = 
		{ 
			'X', 'X', 'X', 
			'O', 'X', 'O', 
			'X', 'O', 'O',
		};

		grid = new TicTacToeGrid(inputGrid2);
		assertEquals(true, grid.isWin());
	}

	@Test
	public void testIsWinWithNullSlots() {
		Character[] inputGrid = 
		{ 
			'X', null, null, 
			'O', 'O', 'X', 
			'X', 'X', 'O',
		};

		TicTacToeGrid grid = new TicTacToeGrid(inputGrid);
		assertEquals(false, grid.isWin());
	}
}