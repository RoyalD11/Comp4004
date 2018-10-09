package A1_Poker;

import java.util.ArrayList;

public class Game {
	
	//Poker hands logic functions
	public boolean royalFlush(Hand player) {
		
		//If the hand has a flush, straight and min value of 10 return true
		if(flush(player.hand) && straight(player) && (player.lowestRank(player.hand) == 10)) return true;
		
		return false;
	}
	
	public boolean straightFlush(Hand player) {
		
		//If the hand has a flush, and a straight return true
		if(flush(player.hand) && straight(player)) return true;
		
		return false;
	}

	public boolean fullHouse(Hand player) {
		
		int alreadyFound = 0;
		
		if(duplicateRank(player.hand, 3)) {
			alreadyFound = valueOfKind(player, 3);
			
			int counter;
			
			//Nested for loop that goes through the hand twice comparing ever card to itself, incrementing the counter if the ranks are the same
			//Reset the counter at the beginning of the outer for loop.
			for(int i=0; i<player.hand.size(); i++) {
				counter = 0;
				for(int j = 0; j<player.hand.size(); j++) {
					if(alreadyFound != player.getRank(player.hand.get(i))) {
						if(player.hand.get(i).substring(1, 2).equals(player.hand.get(j).substring(1, 2))) {
							counter++;
						}
					}
				}
				
				//Return true if a pair is found, as a 3 of a kind is already found
				if(counter == 2) return true;
			}			
		}
		
		return false;
	}
		
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

		//Initialize Variables
		int counter = 0;

		//Get the lowest rank using the helper function
		int lowestRank = player.lowestRank(player.hand);
		
		//Counter will now be at 1 as we've found our potential straight;
		counter++; 
		
		//Checks for an Ace since I have ace hardcoded as the high card, but can work in a straight as the low card
		if(lowestRank == 2) {
			for(int j = 0; j<player.hand.size(); j++) {
				if(player.getRank(player.hand.get(j)) == 14) counter++; //As this will represent A, 2, ... in our straight
			}
		}
		
		//Loops through the hand looking for the next card in the straight
		for(int i = 0; i<player.hand.size(); i++) {
			for(int j = 0; j<player.hand.size(); j++) {
				
				//If the next card in the straight is found increment the counter and change the lowest rank
				if(player.getRank(player.hand.get(j)) == lowestRank + 1) {
					counter++;
					lowestRank = player.getRank(player.hand.get(j));
				}
			}
		}
		
		//Will return true if there is a straight
		if(counter == 5) return true;

		//Default
		return false;
	}
	
	public boolean twoPair(Hand player) {
		
		int alreadyFound = 0;
		
		if(duplicateRank(player.hand, 2)) {
			alreadyFound = valueOfKind(player, 2);
			
			int counter;
			
			//Nested for loop that goes through the hand twice comparing ever card to itself, incrementing the counter if the ranks are the same
			//Reset the counter at the beginning of the outer for loop.
			for(int i=0; i<player.hand.size(); i++) {
				counter = 0;
				for(int j = 0; j<player.hand.size(); j++) {
					if(alreadyFound != player.getRank(player.hand.get(i))) {
						if(player.hand.get(i).substring(1, 2).equals(player.hand.get(j).substring(1, 2))) {
							counter++;
						}
					}
				}
				
				//Return true if second pair is found, as first pair is found already
				if(counter == 2) return true;
			}			
		}
		
		return false;
	}
	
	public boolean duplicateRank(ArrayList<String> hand, int pairLength) {
		
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
			if(counter == pairLength) return true;
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

	
	//Strategy Method
	public String strategy(Hand player) {
		
		if(straight(player) || flush(player.hand) || fullHouse(player) || straightFlush(player) || royalFlush(player)) return "First Branch";
			
		
		return "Missed Everything";
	}
	
	//Helper Function
	public int valueOfKind(Hand player, int pairLength) {
		
		int counter;
		int valueOfKind = 0;
		
		//Nested loops to find the value of the Kind and not just if there is one
		for(int i=0; i<player.hand.size(); i++) {
			counter = 0;
			for(int j = 0; j<player.hand.size(); j++) {
				if(player.hand.get(i).substring(1, 2).equals(player.hand.get(j).substring(1, 2))) {
					counter++;
					valueOfKind = player.getRank(player.hand.get(i));
				}
			}
			
			if(counter == pairLength) return valueOfKind;
		}
		
		return 0;
	}

}
