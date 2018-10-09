package A1_Poker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Deck {
	Scanner sc;
	ArrayList<String> fullDeck = new ArrayList<String>();

	// Function that will open the text file, tries to open it if it fails it prints
	// the error.
	public boolean openFile(String fileName) {
		try {
			// Sets the scanner to be the location of the text file.
			sc = new Scanner(new File("src/main/resources/" + fileName));
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}

	// Function that will close the text file
	public boolean closeFile() {
		sc.close();
		return true;
	}

	public void populateDeck() {

		String[] deckCards = sc.nextLine().split(" ");

		for (int i = 0; i < deckCards.length; i++) {
			fullDeck.add(deckCards[i]);
		}
	}

	// Function that will draw cards
	public String draw() {

		// Random rand = new Random();

		// int deckSize = fullDeck.size();

		// int index = rand.nextInt(deckSize - 1);
		int index = 0;

		String card = fullDeck.get(index);

		fullDeck.remove(index);

		return card;
	}

	public String[] drawFive() {

		String[] deckCards = sc.nextLine().split(" ");

		return deckCards;
	}

	public ArrayList<String> drawFiveFromDeck(Hand player) {

		for (int i = 0; i < 5; i++) {
			player.hand.add(draw());
		}

		return player.hand;
	}
}
