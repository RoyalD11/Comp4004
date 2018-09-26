package A1_Poker;

import java.util.*;

public class Hand {
	
	//Global variables to be used by all functions in this class. 
	ArrayList <String> hand = new ArrayList<String>();
	Deck allCards = new Deck();
	

	
	//Function that will draw cards from a text file into the players hands
	public int drawHand() {
		allCards.openFile("cards.txt");

		
		for(int i = 0; i<5; i++) {
			hand.add(i, allCards.sc.nextLine());
		}
		
		for(int i = 0; i<hand.size(); i++) {
			System.out.println(hand.get(i));
		}

		return hand.size();
	}
}
