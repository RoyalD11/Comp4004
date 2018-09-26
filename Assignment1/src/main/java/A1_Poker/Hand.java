package A1_Poker;

import java.io.*;
import java.util.*;

public class Hand {
	ArrayList <String> hand = new ArrayList<String>();
	Scanner sc;
	
	public int drawHand() {
		
		for(int i = 0; i<5; i++) {
			hand.add(i, sc.nextLine());
		}

		return hand.size();
	}
	
	public void openFile() {
		try {
			sc = new Scanner(new File("src/main/resources/cards.txt"));
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void closeFile() {
		sc.close();
	}
}
