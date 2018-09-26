package A1_Poker;

import junit.framework.TestCase;

public class testDeck extends TestCase{

	public void testOpenFile() {
		//Creates a player object from the hand class
		Deck allCards = new Deck();

		
		//Tests if the file is actually opened.
		assertEquals(true, allCards.openFile("cards.txt"));

	}
}
