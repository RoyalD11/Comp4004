package A1_Poker;

import junit.framework.TestCase;

public class handTest extends TestCase {
	
	public void testMaxHandSize() {
		Hand playerP2 = new Hand();
		Deck deck = new Deck();
		
		deck.openFile("cards.txt");

		for (int i = 0; i<5; i++) {
			playerP2.hand.add(deck.draw());
		}
		
		
		assertEquals(5, playerP2.hand.size());

	}
	
	public void testGetSuit() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		
		deck.openFile("cards.txt");
		
		playerAIP.hand.add(deck.draw());
		
		assertEquals("S", playerAIP.hand.getSuit(playerAIP.hand.get(0)));
	}
}
