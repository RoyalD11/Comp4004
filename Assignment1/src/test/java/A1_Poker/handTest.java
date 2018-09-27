package A1_Poker;

import junit.framework.TestCase;

public class handTest extends TestCase {
	
	public void testMaxHandSize() {
		Hand playerP2 = new Hand();
		Deck deck = new Deck();

		for (int i = 0; i<5; i++) {
			playerP2.hand.add(deck.draw());
		}
		
		
		assertEquals(5, playerP2.hand.size());

	}
}
