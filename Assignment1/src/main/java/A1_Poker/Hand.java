package A1_Poker;

import java.util.*;

public class Hand {
	
	//Global variables to be used by all functions in this class. 
	ArrayList <String> hand = new ArrayList<String>();
	Deck deck = new Deck();
	
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
}