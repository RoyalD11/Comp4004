package A1_Poker;

import java.util.ArrayList;

public class Game {

	public boolean flush(ArrayList<String> hand) {
		
		int counter = 0;
		
		for(int i=1; i<hand.size(); i++) {
			if(hand.get(i-1).substring(0, 1) != hand.get(i).substring(0, 1)) {
				break;
			}
			if(hand.get(i-1).substring(0, 1) == hand.get(i).substring(0, 1)) {
				counter++;
			}
			if(counter == 4) return true;
		}
		
		
		return false;
	}
}
