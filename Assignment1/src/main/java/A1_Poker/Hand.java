package A1_Poker;

import java.util.*;

public class Hand {
	
	//Global variables to be used by all functions in this class. 
	ArrayList <String> hand = new ArrayList<String>();
	Deck deck = new Deck();
	
	public String getSuit(String card) {
		
		return card.substring(0, 1);
	}		
}
