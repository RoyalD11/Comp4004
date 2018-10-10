package A1_Poker;

import junit.framework.TestCase;

public class testGame extends TestCase {

	public void testRoyalFlush() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();

		deck.openFile("royalFlush.txt");

		String cards[] = deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		assertEquals(true, game.royalFlush(playerAIP));
	}

	public void testStrightFlush() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();

		deck.openFile("straightFlush.txt");

		String cards[] = deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		assertEquals(true, game.straightFlush(playerAIP));
	}

	public void testFourOfAKind() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();

		deck.openFile("fourOAC.txt");

		String cards[] = deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		assertEquals(true, game.duplicateRank(playerAIP.hand, 4));
	}

	public void testFullHouse() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();

		deck.openFile("fullHouse.txt");

		String cards[] = deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		assertEquals(true, game.fullHouse(playerAIP));
	}

	public void testFlush() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();

		deck.openFile("flush.txt");

		String cards[] = deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		assertEquals(true, game.flush(playerAIP.hand));
	}

	public void testStraight() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();

		deck.openFile("straight.txt");

		String cards[] = deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		assertEquals(true, game.straight(playerAIP));
	}

	public void testThreeOfAKind() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();

		deck.openFile("threeOAC.txt");

		String cards[] = deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		assertEquals(true, game.duplicateRank(playerAIP.hand, 3));

	}

	public void testTwoPair() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();

		deck.openFile("twoPair.txt");

		String cards[] = deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		assertEquals(true, game.twoPair(playerAIP));
	}

	public void testPair() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();

		deck.openFile("pair.txt");

		String cards[] = deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		assertEquals(true, game.duplicateRank(playerAIP.hand, 2));

	}

	public void testHighCard() {
		Hand playerAIP = new Hand();
		Deck deck = new Deck();
		Game game = new Game();

		deck.openFile("highCard.txt");

		String cards[] = deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		assertEquals("SA", game.highCard(playerAIP));
	}

	public void testStrategy() {
		Hand playerAIP = new Hand();
		Game game = new Game();

		game.deck.openFile("strategy.txt");

		// Branch one test
		String cards[] = game.deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		assertEquals("First Branch", game.strategy(playerAIP));

		
		// Branch two test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		cards = game.deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
		}

		// assertEquals("Second Branch", game.strategy(playerAIP));

		
		// Branch three test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		game.deck.populateDeck();

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);

		assertEquals("Third Branch", game.strategy(playerAIP));

		
		// Branch four test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);

		assertEquals("Fourth Branch", game.strategy(playerAIP));
		
		
		// Branch Five test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);

		//assertEquals("Fifth Branch", game.strategy(playerAIP));

		
		// Branch Six test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);

		assertEquals("Sixth Branch", game.strategy(playerAIP));
		
		
		// Branch Seven test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);

		assertEquals("Seventh Branch", game.strategy(playerAIP));
		
		
		// Branch Eight test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);

		assertEquals("Eighth Branch", game.strategy(playerAIP));

	}

}
