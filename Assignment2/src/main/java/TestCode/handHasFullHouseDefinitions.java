package TestCode;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import core.AIPlayer;
import core.Card;
import core.Hand;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class handHasFullHouseDefinitions {
	
	ArrayList<Card> cards = new ArrayList<Card>();

	@Given("^Hand has Full House in random order$")
	public void hand_has_Full_House_in_random_order(DataTable table) {
		
		System.out.println("\n------Full House-------");
		
		List<List<String>> data = table.raw();
		
		for(int i = 0; i<5; i++) {
			cards.add(new Card(data.get(0).get(i)));
		}		
	}

	@Then("^Hand has Full House$")
	public void hand_has_Full_House() {	
		
		//TESTS
		AIPlayer player = new AIPlayer(cards);
		
		Hand weight = player.getHighestHand();
		
		for(int i = 0; i<5; i++) {
			assertTrue(Hand.FULL_HOUSE == weight);
			System.out.println("AIP hand: " + cards);
			System.out.println("Full House Found");
			
			Collections.shuffle(cards);
			
			player = new AIPlayer(cards);
			weight = player.getHighestHand();
		}
		System.out.println("------Full House Test Finished-------\n\n");
	}
}
