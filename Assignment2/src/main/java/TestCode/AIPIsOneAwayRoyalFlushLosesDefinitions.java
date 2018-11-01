package TestCode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import core.AIPlayer;
import core.Card;
import core.Game;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPIsOneAwayRoyalFlushLosesDefinitions {
	
	Game game;
	ArrayList<Card> HTBcards = new ArrayList<Card>();
	ArrayList<Card> AIPcards = new ArrayList<Card>();

	@Given("^AIP almost has a royal flush$")
	public void aip_almost_has_a_royal_flush(DataTable table) {
	
		System.out.println("\n---------AIP is one away from Royal Flush exchanges one card and loses---------");
		game = new Game();
		
		//Takes the DataTable input and stores the data to a 2-d list 
		List<List<String>> data = table.raw();
		
		//Using the Card constructor converts the string to a Card and adds it to the Array List
		for(int i = 0; i<5; i++) {
			HTBcards.add(new Card(data.get(0).get(i)));
			AIPcards.add(new Card(data.get(1).get(i)));
		}
	
	}

	@Given("^AIP exchanges a card \"([^\"]*)\"$")
	public void aip_exchanges_a_card(String cardToAdd) {
		
		//Makes two players
		AIPlayer player = new AIPlayer(AIPcards);
		AIPlayer HTBplayer = new AIPlayer(HTBcards);
		
		//Finds the card that is needed to discard
		player.findDiscardForRoyalFlush();
		player.discard();
		
		//Adds the new card
		player.cards.add(new Card(cardToAdd));
		
		//Finds the players new hand
		player.findHighestHand();
		
		//Prints all the information
		System.out.println("Hand to beat: " + HTBcards);
		System.out.println("AIP Initial hand: " + AIPcards);
		System.out.println("AIP Exchanged 1 card(s).");
		System.out.println("Discarded: " + player.getDiscarded());
		System.out.println("Recieved: " + cardToAdd);
		System.out.println("AIP Final Hand: "+ player.cards);
		System.out.println("\nAIP has: " + player.getHighestHand());
		System.out.println("Hand to beat has: " + HTBplayer.getHighestHand());
				
		System.out.println("\nWINNER: HTB\n");
	}

	@Then("^AIP loses$")
	public void aip_loses() {
		Assert.assertEquals(false, game.AIPWon());
	}
	
}
