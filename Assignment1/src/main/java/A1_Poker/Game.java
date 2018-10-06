package A1_Poker;

import java.util.ArrayList;

public class Game {

	public boolean flush(ArrayList<String> hand) {
		
		int counter = 0;
		
		//Loops through cards in the hand to check for a flush
		for(int i=1; i<hand.size(); i++) {
			
			//If the first character of any pair of cards is different from one another, break from the loop as that is not a flush
			if(!(hand.get(i-1).substring(0, 1).equals( hand.get(i).substring(0, 1)))) {
				break;
			}
			
			//If the first character of two cards are the same then increment the counter and continue to check
			if(hand.get(i-1).substring(0, 1).equals( hand.get(i).substring(0, 1))) {
				counter++;
			}
			
			//If the counter is 4 it means we have 5 cards of the same suit, return true.
			if(counter == 4) return true;
		}
		
		//return false by default
		return false;
	}
	
	public boolean duplicateRank(ArrayList<String> hand) {
		
		int counter;
		
		//Nested for loop that goes through the hand twice comparing ever card to itself, incrementing the counter if the ranks are the same
		//Reset the counter at the beginning of the outer for loop.
		for(int i=0; i<hand.size(); i++) {
			counter = 0;
			for(int j = 0; j<hand.size(); j++) {
				if(hand.get(i).substring(1, 2).equals(hand.get(j).substring(1, 2))) {
					counter++;
				}
			}
			
			//Will return true if the counter has hit any of these numbers, as that means there is a 4Kind, 3Kind or pair
			if(counter == 3) return true;
			else if (counter == 2) return true;
			else if(counter == 1) return true;
		}
		
		return false;
	}

	
}
