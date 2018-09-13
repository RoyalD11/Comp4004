package A1Poker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hand {
	
	static String handCards[] = new String[5];

	
	public static void main(String arg[]) {
		try {
			Scanner sc = new Scanner(new File("cards.txt"));
			for(int i = 0; i<handCards.length; i++) {
				handCards[i] = sc.nextLine();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
