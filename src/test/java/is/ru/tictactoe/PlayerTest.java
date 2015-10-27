package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest
{
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("is.ru.tictactoe.PlayerTest");
	}

	@Test
	public void testIncrementWinCount() {

		Player player = new Player("Svessi", 'X');
		assertEquals(0 ,player.getWinCount());
		player.incrementWinCount();
		assertEquals(1, player.getWinCount());
	}
}