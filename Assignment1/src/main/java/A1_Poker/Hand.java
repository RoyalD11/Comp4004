package A1_Poker;

import java.util.*;

public class Hand {
	
	//Global variables to be used by all functions in this class. 
	ArrayList <String> hand = new ArrayList<String>();
	Deck deck = new Deck();
	
	//Returns the suit of the card
	public String getSuit(String card) {
		
		return card.substring(0, 1);
	}
	
	//Returns the rank of the card
	public String getRank(String card) {
		
		String rank = card.substring(1, 2);
		
		if(rank.equals("1")) rank = "10";
		
		return rank;
	}
}