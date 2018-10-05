package A1_Poker;

import junit.framework.TestCase;

public class testGame extends TestCase {
	
	public void testFlush() {
		Hand  playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();
		
		deck.openFile("cards.txt");
		
		for (int i = 0; i<5; i++) {
			String card = deck.draw();
			playerAIP.hand.add(card);
		}
		
		assertEquals(true, game.flush(playerAIP.hand));
	}

}
