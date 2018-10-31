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

public class handHasTwoPairsDefinitions {
	
	ArrayList<Card> cards = new ArrayList<Card>();

	@Given("^Hand has Two Pairs in random order$")
	public void hand_has_Two_Pairs_in_random_order(DataTable table) {
		System.out.println("\n------Two Pair-------");
		
		//Takes the DataTable input and stores the data to a 2-d list 
		List<List<String>> data = table.raw();
		
		//Using the Card constructor converts the string to a Card and adds it to the Array List
		for(int i = 0; i<5; i++) {
			cards.add(new Card(data.get(0).get(i)));
		}
	}

	@Then("^Hand has Two Pairs$")
	public void hand_has_Two_Pairs() {
		//Calls the player constructors when being passed the cards and creates all the info I need
		AIPlayer player = new AIPlayer(cards);
		
		//Get the weight of the hand based off the cards that were passed to player
		Hand weight = player.getHighestHand();
		
		//Does 5 tests with the given hand comparing it to what i hope to find, will only be true if i find what i want
		for(int i = 0; i<5; i++) {
			assertTrue(Hand.DOUBLE_PAIR == weight);
			System.out.println("AIP hand: " + cards);
			System.out.println("Two Pair Found");

			//Shuffles the array list to give a new permutation
			Collections.shuffle(cards);
			
			player = new AIPlayer(cards);
			weight = player.getHighestHand();
		}
		System.out.println("------Two Pair Test Finished-------\n\n");
	}
	
}
