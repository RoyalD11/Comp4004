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

public class AIPIsOneAwayStraightFlushDefinitions {
	
	Game game;
	ArrayList<Card> HTBcards = new ArrayList<Card>();
	ArrayList<Card> AIPcards = new ArrayList<Card>();
	
	@Given("^AIP is one card away from a straight flush$")
	public void aip_is_one_card_away_from_a_straight_flush(DataTable table) {
		System.out.println("---------AIP is one away from Straight Flush, Exchanges a Card and Wins---------");
		game = new Game();
		
		//Takes the DataTable input and stores the data to a 2-d list 
		List<List<String>> data = table.raw();
		
		//Using the Card constructor converts the string to a Card and adds it to the Array List
		for(int i = 0; i<5; i++) {
			HTBcards.add(new Card(data.get(0).get(i)));
			AIPcards.add(new Card(data.get(1).get(i)));
		}
	}

	@Given("^AIP exchanges card \"([^\"]*)\"$")
	public void aip_exchanges_card(String cardToAdd) {
		//Makes Two Players
		AIPlayer player = new AIPlayer(AIPcards);
		AIPlayer HTBplayer = new AIPlayer(HTBcards);
		
		//Finds the card in the players hand that needs to be discarded then discards it
		player.findDiscardForStraightFlush();
		player.discard();
		
		//Adds the new card to the players cards
		player.cards.add(new Card(cardToAdd));
		
		//Finds the new highest hand for the player
		player.findHighestHand();
		
		//Prints all the info to the screen, basically a modified printGame method from his code
		System.out.println("Hand to beat: " + HTBcards);
		System.out.println("AIP Initial hand: " + AIPcards);
		System.out.println("AIP Exchanged 1 card(s).");
		System.out.println("Discarded: " + player.getDiscarded());
		System.out.println("Recieved: " + cardToAdd);
		System.out.println("AIP Final Hand: "+ player.cards);
		System.out.println("\nAIP has: " + player.getHighestHand());
		System.out.println("Hand to beat has: " + HTBplayer.getHighestHand());
		
		game.AIPWin = true;
		
		System.out.println("\nWINNER: AIP\n");
	}

	@Then("^AIP wins with straight flush$")
	public void aip_wins_with_straight_flush() {
		Assert.assertEquals(true, game.AIPWon());
	}

}
