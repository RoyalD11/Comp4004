package A1_Poker;

import junit.framework.TestCase;

public class testGame extends TestCase {
	
	public void testFlush() {
		Hand  playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();
		
		deck.openFile("flush.txt");
		
		String cards[] = deck.drawFive();

		
		for (int i = 0; i<5; i++) {
			playerAIP.hand.add(cards[i]);
		}
		
		assertEquals(true, game.flush(playerAIP.hand));
	}
	
	public void testDuplicateRank() {
		Hand  playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();
		
		deck.openFile("fourOAC.txt");
		
		String cards[] = deck.drawFive();
	}

}
