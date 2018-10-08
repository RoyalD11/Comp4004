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
	
	public boolean straight(Hand player) {

		int counter = 0;
		int lowRank = 0;
		int currRank = 0;
		
		for(int i = 1; i<hand.size(); i++) {
			lowRank = player.
		}
		
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

	public String highCard(Hand player) {
		
		String compareCard = "";		
		String highCard = "";
		
		//Loop through the hand
		for(int i = 1; i<player.hand.size(); i++) {
			
			//Set the initial values to the appropriate cards
			highCard = player.hand.get(i-1);
			compareCard = player.hand.get(i);
			
			//If the cards have the same rank then compare the suits and save the appropriate high card based off the check
			if(player.getRank(highCard) == player.getRank(compareCard)) {
				if(player.getSuit(highCard) > player.getSuit(compareCard)) {
					continue;
				}
				else {
					highCard = compareCard;
				}
			}
			
			//Do nothing if the highCard is higher than the one you're comparing
			else if(player.getRank(highCard) > player.getRank(compareCard)) {
				continue;
			}
			
			//Changed highCard to compareCard if it is lower than the one you are comparing it to
			else if(player.getRank(highCard) < player.getRank(compareCard)) {
				highCard = compareCard;
			}
		}
		return highCard;
	}
}
