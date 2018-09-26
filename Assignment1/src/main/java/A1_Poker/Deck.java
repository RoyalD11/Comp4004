package A1_Poker;

import java.io.File;
import java.io.FileNotFoundException;
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

}
