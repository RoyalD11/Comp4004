package A1_Poker;

import junit.framework.TestCase;

public class testGame extends TestCase {
	
	public void testFourOfAKind() {
		Hand  playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();
		
		deck.openFile("fourOAC.txt");
		
		String cards[] = deck.drawFive();
		
		for (int i = 0; i<5; i++) {
			playerAIP.hand.add(cards[i]);
		}
		
		assertEquals(true, game.duplicateRank(playerAIP.hand));

		
	}
	
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
	
	public void testStraight() {
		Hand  playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();
		
		deck.openFile("straight.txt");
		
		String cards[] = deck.drawFive();

		
		for (int i = 0; i<5; i++) {
			playerAIP.hand.add(cards[i]);
		}
		
		assertEquals(true, game.straight(playerAIP.hand));
	}
	
	public void testThreeOfAKind() {
		Hand  playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();
		
		deck.openFile("threeOAC.txt");
		
		String cards[] = deck.drawFive();
		
		for (int i = 0; i<5; i++) {
			playerAIP.hand.add(cards[i]);
		}
		
		assertEquals(true, game.duplicateRank(playerAIP.hand));

		
	}
	
	public void testPair() {
		Hand  playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();
		
		deck.openFile("pair.txt");
		
		String cards[] = deck.drawFive();
		
		for (int i = 0; i<5; i++) {
			playerAIP.hand.add(cards[i]);
		}
		
		assertEquals(true, game.duplicateRank(playerAIP.hand));

		
	}

	public void testHighCard() {
		Hand  playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();
		
		deck.openFile("highCard.txt");
		
		String cards[] = deck.drawFive();

		
		for (int i = 0; i<5; i++) {
			playerAIP.hand.add(cards[i]);
		}
		
		assertEquals("SA", game.highCard(playerAIP));
	}
}
