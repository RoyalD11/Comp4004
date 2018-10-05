package A1_Poker;

import junit.framework.TestCase;

public class testDeck extends TestCase{

	public void testOpenFile() {
		//Creates a deck object from the Deck class
		Deck allCards = new Deck();
	
		//Tests if the file is actually opened.
		assertEquals(true, allCards.openFile("cards.txt"));
	}
	
	public void testCloseFile() {
		//Creates a deck object from the deck class
		Deck allCards = new Deck();
		
		allCards.openFile("cards.txt");

		//Tests if the file is actually closed
		assertEquals(true, allCards.closeFile());

	}
	
	public void testDrawOne() {
		Hand  playerAIP = new Hand();
		Deck deck = new Deck();
		
		deck.openFile("cards.txt");
		
		String card = deck.draw();
		playerAIP.hand.add(card);

		assertEquals(1, playerAIP.hand.size());
	}
}
