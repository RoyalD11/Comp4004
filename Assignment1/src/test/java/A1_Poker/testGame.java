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
		Hand playerP2 = new Hand();
		Deck deck = new Deck();
		Game game = new Game();

		deck.openFile("flush.txt");

		String cards[] = deck.drawFive();
		String cards2[] = deck.drawFive();

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.add(cards[i]);
			playerP2.hand.add(cards2[i]);
		}

		assertEquals(true, game.flush(playerAIP.hand));
		assertEquals(false, game.flush(playerP2.hand));
		
		System.out.println("\n\n\nInside Flush Test\n-----------------\nPlayerAIP's Hand: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerAIP.hand.get(i) + " ");
		}
		
		System.out.println("\n\nPlayerP2's Hand: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerP2.hand.get(i) + " ");
		}		
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
		game.deck.populateDeck();


		// Branch one test
		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);

		System.out.println("Inside Strategy Test Branch 1\n-----------------------------");
		
		assertEquals("First Branch", game.strategy(playerAIP));

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		assertEquals("First Branch", game.strategy(playerAIP));

		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		assertEquals("First Branch", game.strategy(playerAIP));
		
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		assertEquals("First Branch", game.strategy(playerAIP));
		
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		assertEquals("First Branch", game.strategy(playerAIP));
		
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		assertEquals("First Branch", game.strategy(playerAIP));
		
		
		
		// Branch two test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		System.out.println("\nInside Strategy Test Branch 2\n-----------------------------\nNot Implemented\n");

		// assertEquals("Second Branch", game.strategy(playerAIP));

		
		
		// Branch three test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		System.out.println("\nInside Strategy Test Branch 3\n-----------------------------\nPlayerAIP's Hand Before Swap: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerAIP.hand.get(i) + " ");
		}

		assertEquals("Third Branch", game.strategy(playerAIP));

		System.out.println("\n\nPlayerAIP's Hand After Swap: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerAIP.hand.get(i) + " ");
		}
		
		
		
		// Branch four test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		System.out.println("\n\n\nInside Strategy Test Branch 4\n-----------------------------\nPlayerAIP's Hand Before Swap: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerAIP.hand.get(i) + " ");
		}

		assertEquals("Fourth Branch", game.strategy(playerAIP));
		
		System.out.println("\n\nPlayerAIP's Hand After Swap: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerAIP.hand.get(i) + " ");
		}
		
		
		
		// Branch Five test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		System.out.println("\n\n\nInside Strategy Test Branch 5\n-----------------------------\nNot Implemented");

		//assertEquals("Fifth Branch", game.strategy(playerAIP));

		
		
		// Branch Six test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		System.out.println("\n\nInside Strategy Test Branch 6\n-----------------------------\nPlayerAIP's Hand Before Swap: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerAIP.hand.get(i) + " ");
		}

		assertEquals("Sixth Branch", game.strategy(playerAIP));
		
		System.out.println("\n\nPlayerAIP's Hand After Swap: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerAIP.hand.get(i) + " ");
		}
		
		
		
		// Branch Seven test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		System.out.println("\n\n\nInside Strategy Test Branch 7\n-----------------------------\nPlayerAIP's Hand Before Swap: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerAIP.hand.get(i) + " ");
		}

		assertEquals("Seventh Branch", game.strategy(playerAIP));
		
		System.out.println("\n\nPlayerAIP's Hand After Swap: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerAIP.hand.get(i) + " ");
		}
		
		
		
		// Branch Eight test
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}

		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		System.out.println("\n\n\nInside Strategy Test Branch 8\n-----------------------------\nPlayerAIP's Hand Before Swap: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerAIP.hand.get(i) + " ");
		}

		assertEquals("Eighth Branch", game.strategy(playerAIP));
		
		System.out.println("\n\nPlayerAIP's Hand After Swap: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(playerAIP.hand.get(i) + " ");
		}

	}

	public void testWinning() {
		Hand playerAIP = new Hand();
		Hand playerP2 = new Hand();

		Game game = new Game();

		game.deck.openFile("winning.txt");
		game.deck.populateDeck();
		
		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		playerP2.hand = game.deck.drawFiveFromDeck(playerP2);
		
		game.scoring(playerAIP);
		game.scoring(playerP2);
		
		
		System.out.println("\n\n\nTesting Winner");
		System.out.println("--------------");
		
		System.out.println("\nRoyal Flush vs. Straight Flush");
		System.out.println("------------------------------");
		assertEquals("AIP", game.determineWinner(playerAIP, playerP2));

		
		
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}
		
		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		game.scoring(playerAIP);
		game.scoring(playerP2);
		
		System.out.println("\n\n\nStraight Flush vs. Four of a Kind");
		System.out.println("---------------------------------");
		assertEquals("P2", game.determineWinner(playerAIP, playerP2));

		
		
		for (int i = 0; i < 5; i++) {
			playerP2.hand.remove(0);
		}
		
		playerP2.hand = game.deck.drawFiveFromDeck(playerP2);
		
		game.scoring(playerAIP);
		game.scoring(playerP2);
		
		System.out.println("\nFour of a Kind vs. Full House");
		System.out.println("-----------------------------");
		assertEquals("AIP", game.determineWinner(playerAIP, playerP2));

		
		
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}
		
		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		game.scoring(playerAIP);
		game.scoring(playerP2);
		
		System.out.println("\n\n\nFull House vs. Flush");
		System.out.println("--------------------------");
		assertEquals("P2", game.determineWinner(playerAIP, playerP2));

		
		
		for (int i = 0; i < 5; i++) {
			playerP2.hand.remove(0);
		}
		
		playerP2.hand = game.deck.drawFiveFromDeck(playerP2);
		
		game.scoring(playerAIP);
		game.scoring(playerP2);
		
		System.out.println("\nFlush vs. Straight");
		System.out.println("-----------------------------");
		assertEquals("AIP", game.determineWinner(playerAIP, playerP2));

		
		
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}
		
		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		game.scoring(playerAIP);
		game.scoring(playerP2);
		
		System.out.println("\n\n\nStraight vs. Three of a Kind");
		System.out.println("--------------------------");
		assertEquals("P2", game.determineWinner(playerAIP, playerP2));

		
		
		for (int i = 0; i < 5; i++) {
			playerP2.hand.remove(0);
		}
		
		playerP2.hand = game.deck.drawFiveFromDeck(playerP2);
		
		game.scoring(playerAIP);
		game.scoring(playerP2);
		
		System.out.println("\nThree of a Kind vs. Two Pair");
		System.out.println("-----------------------------");
		assertEquals("AIP", game.determineWinner(playerAIP, playerP2));

		
		
		for (int i = 0; i < 5; i++) {
			playerAIP.hand.remove(0);
		}
		
		playerAIP.hand = game.deck.drawFiveFromDeck(playerAIP);
		
		game.scoring(playerAIP);
		game.scoring(playerP2);
		
		System.out.println("\n\n\nTwo Pair vs. Pair");
		System.out.println("--------------------------");
		assertEquals("P2", game.determineWinner(playerAIP, playerP2));

		
		
		for (int i = 0; i < 5; i++) {
			playerP2.hand.remove(0);
		}
		
		playerP2.hand = game.deck.drawFiveFromDeck(playerP2);
		
		game.scoring(playerAIP);
		game.scoring(playerP2);
		
		System.out.println("\nPair vs. High Card");
		System.out.println("-----------------------------");
		assertEquals("AIP", game.determineWinner(playerAIP, playerP2));
	}
}
