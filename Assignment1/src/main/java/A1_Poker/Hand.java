package A1_Poker;

import java.io.*;
import java.util.*;

public class Hand {
	
	//Global variables to be used by all functions in this class. 
	ArrayList <String> hand = new ArrayList<String>();
	Scanner sc;
	
	//Function that will draw cards from a text file into the players hands
	public int drawHand() {
		
		for(int i = 0; i<5; i++) {
			hand.add(i, sc.nextLine());
		}
		
		for(int i = 0; i<hand.size(); i++) {
			System.out.println(hand.get(i));
		}

		return hand.size();
	}
	
	//Function that will open the text file, tries to open it if it fails it prints the error.
	public boolean openFile(String fileName) {
		try {
			//Sets the scanner to be the location of the text file.
			sc = new Scanner(new File("src/main/resources/" + fileName));
			return true;
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//Function that will close the text file
	public boolean closeFile() {
		sc.close();
		return true;
	}
}
