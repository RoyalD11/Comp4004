package A1_Poker;

import java.io.*;
import java.util.*;

public class Hand {
	ArrayList <String> hand = new ArrayList<String>();
	
	public int handSize() {
		
		try {
			Scanner sc = new Scanner(new File("src/main/resources/cards.txt"));
			for(int i = 0; i<5; i++) {
				hand.add(i, sc.nextLine());
			}
			
			//This for loop prints the arrayList that represents the players hand
			/*for(int j = 0; j<hand.size();j++) {
				System.out.println(hand.get(j));
			}*/
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return hand.size();
	}
}
