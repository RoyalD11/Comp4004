package A1_Poker;

import junit.framework.TestCase;

public class handTest extends TestCase {
	
	public void testMaxHandSize() {
		Hand playerP2 = new Hand();
		Deck deck = new Deck();
		
		deck.openFile("flush.txt");

	
		String cards[] = deck.drawFive();
		
		for (int i = 0; i<5; i++) {
			playerP2.hand.add(cards[i]);
		}
		
		assertEquals(5, playerP2.hand.size());

	}
	
	public void testGetSuit() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		
		deck.openFile("cards.txt");
		
		String cards[] = deck.drawFive();
		
		for (int i = 0; i<5; i++) {
			playerAIP.hand.add(cards[i]);
		}
		
		assertEquals(4, playerAIP.getSuit(playerAIP.hand.get(0)));
	}
	
	public void testGetRank() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		
		deck.openFile("cards.txt");
		
		String cards[] = deck.drawFive();
		
		for (int i = 0; i<5; i++) {
			playerAIP.hand.add(cards[i]);
		}
		
		assertEquals(14, playerAIP.getRank(playerAIP.hand.get(0)));
		
	}
}
