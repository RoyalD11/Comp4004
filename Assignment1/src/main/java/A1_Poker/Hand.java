package A1_Poker;

import java.util.*;

public class Hand {
	
	//Global variables to be used by all functions in this class. 
	ArrayList <String> hand = new ArrayList<String>();
	Deck deck = new Deck();
	
	//Print the hand
	public void printHand() {
		System.out.print("PlayerAIP's Hand: ");
		for(int i = 0; i<hand.size(); i++) {
			System.out.print(hand.get(i) + " ");
		}
		System.out.print("\n\n");

	}
	
	//Returns the suit of the card
	public int getSuit(String card) {
		
		String strSuit = card.substring(0, 1);
		
		int suit = 0;
		
		if(strSuit.equals("S")) suit = 4;
		else if(strSuit.equals("H")) suit = 3;
		else if(strSuit.equals("D")) suit = 2;
		else if(strSuit.equals("C")) suit = 1;
		
		return suit;
		
	}
	
	//Returns the rank of the card
	public int getRank(String card) {
		
		String strRank = card.substring(1, 2);
		
		int rank = 0;
		
		if(strRank.equals("1")) rank = 10;
		else if(strRank.equals("A")) rank = 14;
		else if(strRank.equals("K")) rank = 13;
		else if(strRank.equals("Q")) rank = 12;
		else if(strRank.equals("J")) rank = 11;
		else rank = Integer.parseInt(strRank);
		
		return rank;
	}
	
	//Gets the lowest rank card in the hand
	public int lowestRank(ArrayList<String> hand) {
		
		int lowRank = 0;
		int currRank = 0;
		int lowestRank = 15;
		
		//Loop through the hand looking for the lowest card in the hand, this will be the starting point
		for(int i = 1; i<hand.size(); i++) {
			lowRank = getRank(hand.get(i-1));
			currRank = getRank(hand.get(i));
			
			if(lowRank > currRank) {
				if(lowestRank >= currRank) lowestRank = currRank;
			}
			else if(currRank > lowRank){
				if(lowestRank >= lowRank) lowestRank = lowRank;
			}
		}
		
		return lowestRank;
	}
}