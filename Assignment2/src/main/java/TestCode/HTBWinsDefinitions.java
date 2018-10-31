package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HTBWinsDefinitions {

	Game game;

	//ROYAL FLUSH
	@Given("^HTB has a royal flush and AIP has a straight flush \"([^\"]*)\"$")
	public void HTB_has_a_royal_flush_and_AIP_has_a_straight_flush(String deck) {

		System.out.println("\n------ROYAL FLUSH-------");
		System.out.println("------HTB Has Royal Flush vs AIP Straight Flush-------");

		// Make a new game object
		game = new Game();

		// Evaluate the hands given to see which hand is better from the 10 cards
		game.evaluate(deck);

		// Find the winner based of the evaluation done above
		game.findWinner();

	}

	@Given("^HTB has a royal flush and AIP has a four of a kind \"([^\"]*)\"$")
	public void htb_has_a_royal_flush_and_AIP_has_a_four_of_a_kind(String deck) {
		System.out.println("\n------HTB Has Royal Flush vs AIP Four of a Kind-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();

	}

	@Given("^HTB has royal flush beats AIP full house \"([^\"]*)\"$")
	public void htb_has_royal_flush_beats_AIP_full_house(String deck) {
		System.out.println("\n------HTB Has Royal Flush vs AIP Full House-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();

	}

	@Given("^HTB has royal flush beats AIP flush \"([^\"]*)\"$")
	public void htb_has_royal_flush_beats_AIP_flush(String deck) {
		System.out.println("\n------HTB Has Royal Flush vs AIP Flush-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has royal flush beats AIP straight \"([^\"]*)\"$")
	public void htb_has_royal_flush_beats_AIP_straight(String deck) {
		System.out.println("\n------HTB Has Royal Flush vs AIP Straight-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has royal flush beats AIP three of a kind \"([^\"]*)\"$")
	public void htb_has_royal_flush_beats_AIP_three_of_a_kind(String deck) {
		System.out.println("\n------HTB Has Royal Flush vs AIP Three of a Kind-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has royal flush beats AIP two pairs \"([^\"]*)\"$")
	public void htb_has_royal_flush_beats_AIP_two_pairs(String deck) {
		System.out.println("\n------HTB Has Royal Flush vs AIP Two Pair-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has royal flush beats AIP one pair \"([^\"]*)\"$")
	public void htb_has_royal_flush_beats_AIP_one_pair(String deck) {
		System.out.println("\n------HTB Has Royal Flush vs AIP Pair-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has royal flush beats AIP high card \"([^\"]*)\"$")
	public void htb_has_royal_flush_beats_AIP_high_card(String deck) {
		System.out.println("\n------HTB Has Royal Flush vs AIP High Card-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}
	
	
	//STRAIGHT FLUSH
	@Given("^HTB has a straight flush and AIP has a four of a kind \"([^\"]*)\"$")
	public void htb_has_a_straight_flush_and_AIP_has_a_four_of_a_kind(String deck) {
		System.out.println("\n------STRAIGHT FLUSH-------");
		System.out.println("------HTB Has Straight Flush vs AIP Four of a Kind-------");

		// Make a new game object
		game = new Game();

		// Evaluate the hands given to see which hand is better from the 10 cards
		game.evaluate(deck);

		// Find the winner based of the evaluation done above
		game.findWinner();
	}

	@Given("^HTB has straight flush beats AIP full house \"([^\"]*)\"$")
	public void htb_has_straight_flush_beats_AIP_full_house(String deck) {
		System.out.println("------HTB Has Straight Flush vs AIP Full House-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has straight flush beats AIP flush \"([^\"]*)\"$")
	public void htb_has_straight_flush_beats_AIP_flush(String deck) {
		System.out.println("------HTB Has Straight Flush vs AIP Flush-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has straight flush beats AIP straight \"([^\"]*)\"$")
	public void htb_has_straight_flush_beats_AIP_straight(String deck) {
		System.out.println("------HTB Has Straight Flush vs AIP Straight-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has straight flush beats AIP three of a kind \"([^\"]*)\"$")
	public void htb_has_straight_flush_beats_AIP_three_of_a_kind(String deck) {
		System.out.println("------HTB Has Straight Flush vs AIP Three of a Kind-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has straight flush beats AIP two pairs \"([^\"]*)\"$")
	public void htb_has_straight_flush_beats_AIP_two_pairs(String deck) {
		System.out.println("------HTB Has Straight Flush vs AIP Two Pair-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has straight flush beats AIP one pair \"([^\"]*)\"$")
	public void htb_has_straight_flush_beats_AIP_one_pair(String deck) {
		System.out.println("------HTB Has Straight Flush vs AIP Pair-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has straight flush beats AIP high card \"([^\"]*)\"$")
	public void htb_has_straight_flush_beats_AIP_high_card(String deck) {
		System.out.println("------HTB Has Straight Flush vs AIP High Card-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}
	
	
	
	//FOUR OF A KIND
	@Given("^HTB has four of a kind beats AIP full house \"([^\"]*)\"$")
	public void htb_has_four_of_a_kind_beats_AIP_full_house(String deck) {
		System.out.println("\n------FOUR OF A KIND-------");
		System.out.println("------HTB Has Four of a Kind vs AIP Full House-------");

		// Make a new game object
		game = new Game();

		// Evaluate the hands given to see which hand is better from the 10 cards
		game.evaluate(deck);

		// Find the winner based of the evaluation done above
		game.findWinner();
	}

	@Given("^HTB has four of a kind beats AIP flush \"([^\"]*)\"$")
	public void htb_has_four_of_a_kind_beats_AIP_flush(String deck) {
		System.out.println("------HTB Has Four of a Kind vs AIP Flush-------");
		
		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has four of a kind beats AIP straight \"([^\"]*)\"$")
	public void htb_has_four_of_a_kind_beats_AIP_straight(String deck) {
		System.out.println("------HTB Has Four of a Kind vs AIP Straight-------");
		
		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has four of a kind beats AIP three of a kind \"([^\"]*)\"$")
	public void htb_has_four_of_a_kind_beats_AIP_three_of_a_kind(String deck) {
		System.out.println("------HTB Has Four of a Kind vs AIP Three of a Kind-------");
		
		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has four of a kind beats AIP two pairs \"([^\"]*)\"$")
	public void htb_has_four_of_a_kind_beats_AIP_two_pairs(String deck) {
		System.out.println("------HTB Has Four of a Kind vs AIP Two Pair-------");
		
		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has four of a kind beats AIP one pair \"([^\"]*)\"$")
	public void htb_has_four_of_a_kind_beats_AIP_one_pair(String deck) {
		System.out.println("------HTB Has Four of a Kind vs AIP Pair-------");
		
		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has four of a kind beats AIP high card \"([^\"]*)\"$")
	public void htb_has_four_of_a_kind_beats_AIP_high_card(String deck) {
		System.out.println("------HTB Has Four of a Kind vs AIP High Card-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}
	
	
	//FULL HOUSE
	@Given("^HTB has full house beats AIP flush \"([^\"]*)\"$")
	public void htb_has_full_house_beats_AIP_flush(String deck) {
		System.out.println("\n------FULL HOUSE-------");
		System.out.println("------HTB Has Full House vs AIP Flush-------");

		// Make a new game object
		game = new Game();

		// Evaluate the hands given to see which hand is better from the 10 cards
		game.evaluate(deck);

		// Find the winner based of the evaluation done above
		game.findWinner();
	}

	@Given("^HTB has full house beats AIP straight \"([^\"]*)\"$")
	public void htb_has_full_house_beats_AIP_straight(String deck) {
		System.out.println("------HTB Has Full House vs AIP Straight-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has full house beats AIP three of a kind \"([^\"]*)\"$")
	public void htb_has_full_house_beats_AIP_three_of_a_kind(String deck) {
		System.out.println("------HTB Has Full House vs AIP Three of a Kind-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has full house beats AIP two pairs \"([^\"]*)\"$")
	public void htb_has_full_house_beats_AIP_two_pairs(String deck) {
		System.out.println("------HTB Has Full House vs AIP Two Pair-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has full house beats AIP one pair \"([^\"]*)\"$")
	public void htb_has_full_house_beats_AIP_one_pair(String deck) {
		System.out.println("------HTB Has Full House vs AIP Pair-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has full house beats AIP high card \"([^\"]*)\"$")
	public void htb_has_full_house_beats_AIP_high_card(String deck) {
		System.out.println("------HTB Has Full House vs AIP High Card-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}
	
	
	//FLUSH
	@Given("^HTB has flush beats AIP straight \"([^\"]*)\"$")
	public void htb_has_flush_beats_AIP_straight(String deck) {
		System.out.println("\n------FLUSH-------");
		System.out.println("------HTB Has Flush vs AIP Straight-------");

		// Make a new game object
		game = new Game();

		// Evaluate the hands given to see which hand is better from the 10 cards
		game.evaluate(deck);

		// Find the winner based of the evaluation done above
		game.findWinner();
	}

	@Given("^HTB has flush beats AIP three of a kind \"([^\"]*)\"$")
	public void htb_has_flush_beats_AIP_three_of_a_kind(String deck) {
		System.out.println("------HTB Has Flush vs AIP Three of a Kind-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has flush beats AIP two pairs \"([^\"]*)\"$")
	public void htb_has_flush_beats_AIP_two_pairs(String deck) {
		System.out.println("------HTB Has Flush vs AIP Two Pair-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has flush beats AIP one pair \"([^\"]*)\"$")
	public void htb_has_flush_beats_AIP_one_pair(String deck) {
		System.out.println("------HTB Has Flush vs AIP Pair-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has flush beats AIP high card \"([^\"]*)\"$")
	public void htb_has_flush_beats_AIP_high_card(String deck) {
		System.out.println("------HTB Has Flush vs AIP High Card-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}
	
	
	//STRAIGHT
	@Given("^HTB has straight beats AIP three of a kind \"([^\"]*)\"$")
	public void htb_has_straight_beats_AIP_three_of_a_kind(String deck) {
		System.out.println("\n------STRAIGHT-------");
		System.out.println("------HTB Has Straight vs AIP Three of a Kind-------");

		// Make a new game object
		game = new Game();

		// Evaluate the hands given to see which hand is better from the 10 cards
		game.evaluate(deck);

		// Find the winner based of the evaluation done above
		game.findWinner();
	}

	@Given("^HTB has straight beats AIP two pairs \"([^\"]*)\"$")
	public void htb_has_straight_beats_AIP_two_pairs(String deck) {
		System.out.println("------HTB Has Straight vs AIP Two Pair-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has straight beats AIP one pair \"([^\"]*)\"$")
	public void htb_has_straight_beats_AIP_one_pair(String deck) {
		System.out.println("------HTB Has Straight vs AIP Pair-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has straight beats AIP high card \"([^\"]*)\"$")
	public void htb_has_straight_beats_AIP_high_card(String deck) {
		System.out.println("------HTB Has Straight vs AIP High Card-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	
	//THREE OF A KIND
	@Given("^HTB has three of a kind beats AIP two pairs \"([^\"]*)\"$")
	public void htb_has_three_of_a_kind_beats_AIP_two_pairs(String deck) {
		System.out.println("\n------THREE OF A KIND-------");
		System.out.println("------HTB Has Three of a Kind vs AIP Two Pair-------");

		// Make a new game object
		game = new Game();

		// Evaluate the hands given to see which hand is better from the 10 cards
		game.evaluate(deck);

		// Find the winner based of the evaluation done above
		game.findWinner();
	}

	@Given("^HTB has three of a kind beats AIP one pair \"([^\"]*)\"$")
	public void htb_has_three_of_a_kind_beats_AIP_one_pair(String deck) {
		System.out.println("------HTB Has Three of a Kind vs AIP Pair-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}

	@Given("^HTB has three of a kind beats AIP high card \"([^\"]*)\"$")
	public void htb_has_three_of_a_kind_beats_AIP_high_card(String deck) {
		System.out.println("------HTB Has Three of a Kind vs AIP High Card-------");

		game = new Game();

		game.evaluate(deck);

		game.findWinner();
	}
	
	@Then("^HTB wins$")
	public void HTB_wins() {

		Assert.assertEquals(game.AIPWon(), false);

		System.out.println("HTB Hand: " + game.toBeat.cards);
		System.out.println("AIP Hand: " + game.AIP.cards);
		System.out.println("HTB beat AIP\n\n");
	}
	
}
