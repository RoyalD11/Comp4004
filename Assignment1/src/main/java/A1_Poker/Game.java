package A1_Poker;

import java.util.ArrayList;

public class Game {

	Deck deck = new Deck();

	// Poker hands logic functions
	public boolean royalFlush(Hand player) {

		// If the hand has a flush, straight and min value of 10 return true
		if (flush(player.hand) && straight(player) && (player.lowestRank(player.hand) == 10))
			return true;

		return false;
	}

	public boolean straightFlush(Hand player) {

		// If the hand has a flush, and a straight return true
		if (flush(player.hand) && straight(player))
			return true;

		return false;
	}

	public boolean fullHouse(Hand player) {

		int alreadyFound = 0;

		if (duplicateRank(player.hand, 3)) {
			alreadyFound = valueOfKind(player, 3);

			int counter;

			// Nested for loop that goes through the hand twice comparing ever card to
			// itself, incrementing the counter if the ranks are the same
			// Reset the counter at the beginning of the outer for loop.
			for (int i = 0; i < player.hand.size(); i++) {
				counter = 0;
				for (int j = 0; j < player.hand.size(); j++) {
					if (alreadyFound != player.getRank(player.hand.get(i))) {
						if (player.hand.get(i).substring(1, 2).equals(player.hand.get(j).substring(1, 2))) {
							counter++;
						}
					}
				}

				// Return true if a pair is found, as a 3 of a kind is already found
				if (counter == 2)
					return true;
			}
		}

		return false;
	}

	public boolean flush(ArrayList<String> hand) {

		int counter = 0;

		// Loops through cards in the hand to check for a flush
		for (int i = 1; i < hand.size(); i++) {

			// If the first character of any pair of cards is different from one another,
			// break from the loop as that is not a flush
			if (!(hand.get(i - 1).substring(0, 1).equals(hand.get(i).substring(0, 1)))) {
				break;
			}

			// If the first character of two cards are the same then increment the counter
			// and continue to check
			if (hand.get(i - 1).substring(0, 1).equals(hand.get(i).substring(0, 1))) {
				counter++;
			}

			// If the counter is 4 it means we have 5 cards of the same suit, return true.
			if (counter == 4)
				return true;
		}

		// return false by default
		return false;
	}

	public boolean straight(Hand player) {

		// Initialize Variables
		int counter = 0;

		// Get the lowest rank using the helper function
		int lowestRank = player.lowestRank(player.hand);

		// Counter will now be at 1 as we've found our potential straight;
		counter++;

		// Checks for an Ace since I have ace hardcoded as the high card, but can work
		// in a straight as the low card
		if (lowestRank == 2) {
			for (int j = 0; j < player.hand.size(); j++) {
				if (player.getRank(player.hand.get(j)) == 14)
					counter++; // As this will represent A, 2, ... in our straight
			}
		}

		// Loops through the hand looking for the next card in the straight
		for (int i = 0; i < player.hand.size(); i++) {
			for (int j = 0; j < player.hand.size(); j++) {

				// If the next card in the straight is found increment the counter and change
				// the lowest rank
				if (player.getRank(player.hand.get(j)) == lowestRank + 1) {
					counter++;
					lowestRank = player.getRank(player.hand.get(j));
				}
			}
		}

		// Will return true if there is a straight
		if (counter == 5)
			return true;

		// Default
		return false;
	}

	public boolean twoPair(Hand player) {

		int alreadyFound = 0;

		if (duplicateRank(player.hand, 2)) {
			alreadyFound = valueOfKind(player, 2);

			int counter;

			// Nested for loop that goes through the hand twice comparing ever card to
			// itself, incrementing the counter if the ranks are the same
			// Reset the counter at the beginning of the outer for loop.
			for (int i = 0; i < player.hand.size(); i++) {
				counter = 0;
				for (int j = 0; j < player.hand.size(); j++) {
					if (alreadyFound != player.getRank(player.hand.get(i))) {
						if (player.hand.get(i).substring(1, 2).equals(player.hand.get(j).substring(1, 2))) {
							counter++;
						}
					}
				}

				// Return true if second pair is found, as first pair is found already
				if (counter == 2)
					return true;
			}
		}

		return false;
	}

	public boolean duplicateRank(ArrayList<String> hand, int pairLength) {

		int counter;

		// Nested for loop that goes through the hand twice comparing ever card to
		// itself, incrementing the counter if the ranks are the same
		// Reset the counter at the beginning of the outer for loop.
		for (int i = 0; i < hand.size(); i++) {
			counter = 0;
			for (int j = 0; j < hand.size(); j++) {
				if (hand.get(i).substring(1, 2).equals(hand.get(j).substring(1, 2))) {
					counter++;
				}
			}

			// Will return true if the counter has hit any of these numbers, as that means
			// there is a 4Kind, 3Kind or pair
			if (counter == pairLength)
				return true;
		}

		return false;
	}

	public String highCard(Hand player) {

		String compareCard = "";
		String highCard = "";

		// Loop through the hand
		for (int i = 1; i < player.hand.size(); i++) {

			// Set the initial values to the appropriate cards
			highCard = player.hand.get(i - 1);
			compareCard = player.hand.get(i);

			// If the cards have the same rank then compare the suits and save the
			// appropriate high card based off the check
			if (player.getRank(highCard) == player.getRank(compareCard)) {
				if (player.getSuit(highCard) > player.getSuit(compareCard)) {
					continue;
				} else {
					highCard = compareCard;
				}
			}

			// Do nothing if the highCard is higher than the one you're comparing
			else if (player.getRank(highCard) > player.getRank(compareCard)) {
				continue;
			}

			// Changed highCard to compareCard if it is lower than the one you are comparing
			// it to
			else if (player.getRank(highCard) < player.getRank(compareCard)) {
				highCard = compareCard;
			}
		}
		return highCard;
	}

	// Strategy Method
	public String strategy(Hand player) {
		
		// Branch one - If the player already has a good hand do not do anything
		if (straight(player) || flush(player.hand) || fullHouse(player) || duplicateRank(player.hand, 4) || straightFlush(player) || royalFlush(player)) {
			
			if(royalFlush(player)) {
				System.out.println("Hold. Detected a Royal Flush.");
				player.printHand();
			}
			
			else if(straightFlush(player)) {
				System.out.println("Hold. Detected a Straight Flush.");
				player.printHand();
			}
			
			else if(duplicateRank(player.hand, 4)) {
				System.out.println("Hold. Detected a Four of a Kind.");
				player.printHand();
			}
			
			else if(fullHouse(player)) {
				System.out.println("Hold. Detected a Full House.");
				player.printHand();
			}
			
			else if(flush(player.hand)) {
				System.out.println("Hold. Detected a Flush.");
				player.printHand();
			}
			
			else if(straight(player)) {
				System.out.println("Hold. Detected a Straight.");
				player.printHand();
			}
			
			
			
			return "First Branch";
		}
		
		// Branch two - One away
		else if (false) return "Second Branch";

		
		// Branch three - Three of the same suit, exchange two cards
		else if (threeSuit(player, 3)) {

			// Calls helper function that will get the suit of the almost flush
			int suit = player.getSuit(returnSuit(player, 3));

			// Loop through hand and remove the cards that don't match the suit we need and
			// draw again
			for (int i = 0; i < player.hand.size(); i++) {
				if (player.getSuit(player.hand.get(i)) != suit) {
					player.hand.remove(i);
					player.hand.add(i, deck.draw());
				}
			}

			return "Third Branch";
		}

		
		// Branch four - Three of the same rank, exchange two cards
		else if (threeRank(player, 3)) {

			// Calls helper function that will get the suit of the almost flush
			int rank = returnRank(player, 3);

			// Loop through hand and remove the cards that don't match the suit we need and
			// draw again
			for (int i = 0; i < player.hand.size(); i++) {
				if (player.getRank(player.hand.get(i)) != rank) {
					player.hand.remove(i);
					player.hand.add(i, deck.draw());
				}
			}

			return "Fourth Branch";
		}
		
		
		// Branch Five - Three cards in sequence
		else if(false) return "Fifth Branch";
		
		
		//Branch Six - 2 pairs, exchange the other card
		else if(twoPair(player)) {
			
			//Gets the values of the two pairs
			int firstPair = valueOfKind(player, 2);
			int secondPair = secondPairValue(player, 2, firstPair);
			
			//Loop through the hand if the rank is equal to either of the found values skip it, replace the one that doesnt match
			for(int i = 0; i<player.hand.size(); i++) {
				if((player.getRank(player.hand.get(i)) == firstPair) || (player.getRank(player.hand.get(i)) == secondPair)) {
					continue;
				}
				else {
					player.hand.remove(i);
					player.hand.add(i, deck.draw());
				}
			}
			
			return "Sixth Branch";
			
		}
		
		
		//Branch Seven - One pair, exchanges other three cards
		else if(duplicateRank(player.hand, 2)) {
			int pairValue = valueOfKind(player, 2);
			
			//Loop through the hand if the rank is equal to either of the found values skip it, replace the one that doesnt match
			for(int i = 0; i<player.hand.size(); i++) {
				if(player.getRank(player.hand.get(i)) == pairValue) {
					continue;
				}
				else {
					player.hand.remove(i);
					player.hand.add(i, deck.draw());
				}
			}
			
			return "Seventh Branch";
		}
		
		
		//Branch Eight - keep two highest cards, exchange three
		else {
			
			//Find the first highest card
			String highCardOne = highCard(player);
			
			//Remove it from the hand
			for(int i = 0; i<player.hand.size(); i++) {
				if(highCardOne.equals(player.hand.get(i))) {
					player.hand.remove(i);
				}
			}
			
			//Find the second highest card
			String highCardTwo = highCard(player);
			
			//Remove it from the hand
			for(int i = 0; i<player.hand.size(); i++) {
				if(highCardTwo.equals(player.hand.get(i))) {
					player.hand.remove(i);
				}
			}
					
			//Remove all the remaining cards from the hand and draw to replace them
			for(int i = 0; i<player.hand.size(); i++) {
				player.hand.remove(i);
				player.hand.add(i, deck.draw());
			}
			
			//Add the high cards back into the hand
			player.hand.add(highCardOne);
			player.hand.add(highCardTwo);
			
			return "Eighth Branch";
		}
	}

	// Helper Function
	public int valueOfKind(Hand player, int pairLength) {

		int counter;
		int valueOfKind = 0;

		// Nested loops to find the value of the Kind and not just if there is one
		for (int i = 0; i < player.hand.size(); i++) {
			counter = 0;
			for (int j = 0; j < player.hand.size(); j++) {
				if (player.hand.get(i).substring(1, 2).equals(player.hand.get(j).substring(1, 2))) {
					counter++;
					valueOfKind = player.getRank(player.hand.get(i));
				}
			}

			if (counter == pairLength)
				return valueOfKind;
		}

		return 0;
	}

	public int secondPairValue(Hand player, int pairLength, int firstValue) {
		int counter;
		int valueOfKind = 0;

		// Nested loops to find the value of the Kind and not just if there is one
		for (int i = 0; i < player.hand.size(); i++) {
			counter = 0;
			for (int j = 0; j < player.hand.size(); j++) {
				if (firstValue != player.getRank(player.hand.get(i))) {
					if (player.hand.get(i).substring(1, 2).equals(player.hand.get(j).substring(1, 2))) {
						counter++;
						valueOfKind = player.getRank(player.hand.get(i));
					}
				}
			}

			if (counter == pairLength)
				return valueOfKind;
		}

		return 0;
	}
	
	
	// Used for strategy branch 3 - finds if there is a flush of 3 cards
	public boolean threeSuit(Hand player, int breakPoint) {

		int counter;

		// Nested for loop that goes through the hand twice comparing ever card to
		// itself, incrementing the counter if the ranks are the same
		// Reset the counter at the beginning of the outer for loop.
		for (int i = 0; i < player.hand.size(); i++) {
			counter = 0;
			for (int j = 0; j < player.hand.size(); j++) {
				if (player.hand.get(i).substring(0, 1).equals(player.hand.get(j).substring(0, 1))) {
					counter++;
				}
			}

			// Will return true if the counter has hit any of the break point, as that means
			// there is a the cards we're looking for
			if (counter == breakPoint)
				return true;
		}

		return false;
	}

	// Used for strategy branch 3 - returns the suit of the flush of 3 cards
	public String returnSuit(Hand player, int breakPoint) {

		int counter;
		String suit = "";

		// Nested for loop that goes through the hand twice comparing ever card to
		// itself, incrementing the counter if the ranks are the same
		// Reset the counter at the beginning of the outer for loop.
		for (int i = 0; i < player.hand.size(); i++) {
			counter = 0;
			for (int j = 0; j < player.hand.size(); j++) {
				if (player.hand.get(i).substring(0, 1).equals(player.hand.get(j).substring(0, 1))) {
					counter++;
					suit = player.hand.get(i);
				}
			}

			// Will return true if the counter has hit any of the break point, as that means
			// there is a the cards we're looking for
			if (counter == breakPoint)
				return suit;
		}

		return "";
	}

	// Used for strategy branch 4 - finds if there is a kind of 3 ranks
	public boolean threeRank(Hand player, int breakPoint) {

		int counter;

		// Nested for loop that goes through the hand twice comparing ever card to
		// itself, incrementing the counter if the ranks are the same
		// Reset the counter at the beginning of the outer for loop.
		for (int i = 0; i < player.hand.size(); i++) {
			counter = 0;
			for (int j = 0; j < player.hand.size(); j++) {
				if (player.hand.get(i).substring(1, 2).equals(player.hand.get(j).substring(1, 2))) {
					counter++;
				}
			}

			// Will return true if the counter has hit any of the break point, as that means
			// there is a the cards we're looking for
			if (counter == breakPoint)
				return true;
		}

		return false;
	}

	// Used for strategy branch 4 - returns the rank of the kind of 3 cards
	public int returnRank(Hand player, int breakPoint) {

		int counter;
		int rank = 0;

		// Nested for loop that goes through the hand twice comparing ever card to
		// itself, incrementing the counter if the ranks are the same
		// Reset the counter at the beginning of the outer for loop.
		for (int i = 0; i < player.hand.size(); i++) {
			counter = 0;
			for (int j = 0; j < player.hand.size(); j++) {
				if (player.hand.get(i).substring(1, 2).equals(player.hand.get(j).substring(1, 2))) {
					counter++;
					rank = player.getRank(player.hand.get(i));
				}
			}

			// Will return true if the counter has hit any of the break point, as that means
			// there is a the cards we're looking for
			if (counter == breakPoint)
				return rank;
		}

		return rank;
	}
	
}
