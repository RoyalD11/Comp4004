package A1_Poker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Deck {
	Scanner sc;
	
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
	
	//Function that will draw cards from a text file into the players hands
	public String draw() {
			
		String [] deckCards = sc.nextLine().split(" ");
		Random rand = new Random();
		int index = rand.nextInt(4);
		
		return deckCards[index];
	}
	
	public String[] drawFive() {
		
		String [] deckCards = sc.nextLine().split(" ");

		return deckCards;
	}
}
