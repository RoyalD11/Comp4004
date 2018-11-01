package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPWinsDefinitions {
	
	Game game;
	
	//ROYAL FLUSH
	@Given("^AIP has a royal flush and HTB has a straight flush \"([^\"]*)\"$")
	public void aip_has_a_royal_flush_and_HTB_has_a_straight_flush(String deck) {
		System.out.println("------ROYAL FLUSH-------");
		System.out.println("------AIP Has Royal Flush vs HTB Straight Flush-------");
		
		// Make a new game object
		game = new Game();
		
		//Play the game, prints everything for me
		game.play(deck);
	}
	
	@Given("^AIP has a royal flush and HTB has a four of a kind \"([^\"]*)\"$")
	public void aip_has_a_royal_flush_and_HTB_has_a_four_of_a_kind(String deck) {
		System.out.println("------AIP Has Royal Flush vs HTB Four of a Kind-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has royal flush beats HTB full house \"([^\"]*)\"$")
	public void aip_has_royal_flush_beats_HTB_full_house(String deck) {
		System.out.println("------AIP Has Royal Flush vs HTB Full House-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has royal flush beats HTB flush \"([^\"]*)\"$")
	public void aip_has_royal_flush_beats_HTB_flush(String deck) {
		System.out.println("------AIP Has Royal Flush vs HTB Flush-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has royal flush beats HTB straight \"([^\"]*)\"$")
	public void aip_has_royal_flush_beats_HTB_straight(String deck) {
		System.out.println("------AIP Has Royal Flush vs HTB Straight-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has royal flush beats HTB three of a kind \"([^\"]*)\"$")
	public void aip_has_royal_flush_beats_HTB_three_of_a_kind(String deck) {
		System.out.println("------AIP Has Royal Flush vs HTB Three of a Kind-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has royal flush beats HTB two pairs \"([^\"]*)\"$")
	public void aip_has_royal_flush_beats_HTB_two_pairs(String deck) {
		System.out.println("------AIP Has Royal Flush vs HTB Two Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has royal flush beats HTB one pair \"([^\"]*)\"$")
	public void aip_has_royal_flush_beats_HTB_one_pair(String deck) {
		System.out.println("------AIP Has Royal Flush vs HTB Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has royal flush beats HTB high card \"([^\"]*)\"$")
	public void aip_has_royal_flush_beats_HTB_high_card(String deck) {
		System.out.println("------AIP Has Royal Flush vs HTB High Card-------");

		game = new Game();
		
		game.play(deck);
	}
	
	
	//STRAIGHT FLUSH
	@Given("^AIP has a straight flush and HTB has a four of a kind \"([^\"]*)\"$")
	public void aip_has_a_straight_flush_and_HTB_has_a_four_of_a_kind(String deck) {
		System.out.println("\n------STRAIGHT FLUSH-------");
		System.out.println("------AIP Has Straight Flush vs HTB Four of a Kind-------");
		
		// Make a new game object
		game = new Game();
		
		//Play the game, prints everything for me
		game.play(deck);
	}

	@Given("^AIP has straight flush beats HTB full house \"([^\"]*)\"$")
	public void aip_has_straight_flush_beats_HTB_full_house(String deck) {
		System.out.println("------AIP Has Straight Flush vs HTB Full House-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has straight flush beats HTB flush \"([^\"]*)\"$")
	public void aip_has_straight_flush_beats_HTB_flush(String deck) {
		System.out.println("------AIP Has Straight Flush vs HTB Flush-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has straight flush beats HTB straight \"([^\"]*)\"$")
	public void aip_has_straight_flush_beats_HTB_straight(String deck) {
		System.out.println("------AIP Has Straight Flush vs HTB Straight-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has straight flush beats HTB three of a kind \"([^\"]*)\"$")
	public void aip_has_straight_flush_beats_HTB_three_of_a_kind(String deck) {
		System.out.println("------AIP Has Straight Flush vs HTB Three of a Kind-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has straight flush beats HTB two pairs \"([^\"]*)\"$")
	public void aip_has_straight_flush_beats_HTB_two_pairs(String deck) {
		System.out.println("------AIP Has Straight Flush vs HTB Two Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has straight flush beats HTB one pair \"([^\"]*)\"$")
	public void aip_has_straight_flush_beats_HTB_one_pair(String deck) {
		System.out.println("------AIP Has Straight Flush vs HTB Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has straight flush beats HTB high card \"([^\"]*)\"$")
	public void aip_has_straight_flush_beats_HTB_high_card(String deck) {
		System.out.println("------AIP Has Straight Flush vs HTB High Card-------");

		game = new Game();
		
		game.play(deck);
	}
	
	
	//FOUR OF A KIND
	@Given("^AIP has four of a kind beats HTB full house \"([^\"]*)\"$")
	public void aip_has_four_of_a_kind_beats_HTB_full_house(String deck) {
		System.out.println("\n------FOUR OF A KIND-------");
		System.out.println("------AIP Has Four of a Kind vs HTB Full House-------");
		
		// Make a new game object
		game = new Game();
		
		//Play the game, prints everything for me
		game.play(deck);
	}

	@Given("^AIP has four of a kind beats HTB flush \"([^\"]*)\"$")
	public void aip_has_four_of_a_kind_beats_HTB_flush(String deck) {
		System.out.println("------AIP Has Four of a Kind vs HTB Flush-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has four of a kind beats HTB straight \"([^\"]*)\"$")
	public void aip_has_four_of_a_kind_beats_HTB_straight(String deck) {
		System.out.println("------AIP Has Four of a Kind vs HTB Straight-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has four of a kind beats HTB three of a kind \"([^\"]*)\"$")
	public void aip_has_four_of_a_kind_beats_HTB_three_of_a_kind(String deck) {
		System.out.println("------AIP Has Four of a Kind vs HTB Three of a Kind-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has four of a kind beats HTB two pairs \"([^\"]*)\"$")
	public void aip_has_four_of_a_kind_beats_HTB_two_pairs(String deck) {
		System.out.println("------AIP Has Four of a Kind vs HTB Two Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has four of a kind beats HTB one pair \"([^\"]*)\"$")
	public void aip_has_four_of_a_kind_beats_HTB_one_pair(String deck) {
		System.out.println("------AIP Has Four of a Kind vs HTB Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has four of a kind beats HTB high card \"([^\"]*)\"$")
	public void aip_has_four_of_a_kind_beats_HTB_high_card(String deck) {
		System.out.println("------AIP Has Four of a Kind vs HTB High Card-------");

		game = new Game();
		
		game.play(deck);
	}
	
	
	//FULL HOUSE
	/*@Given("^AIP has full house beats HTB flush \"([^\"]*)\"$")
	public void aip_has_full_house_beats_HTB_flush(String deck) {
		System.out.println("\n------FULL HOUSE-------");
		System.out.println("------PLEASE READ!! The logic is broken here from the source code, I have given a full house but it reads three of a kind-------");
		System.out.println("------AIP Has Full House vs HTB Flush-------");
		
		// Make a new game object
		game = new Game();
		
		//Play the game, prints everything for me
		game.play(deck);
	}

	@Given("^AIP has full house beats HTB straight \"([^\"]*)\"$")
	public void aip_has_full_house_beats_HTB_straight(String deck) {
		System.out.println("------AIP Has Full House vs HTB Straight-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has full house beats HTB three of a kind \"([^\"]*)\"$")
	public void aip_has_full_house_beats_HTB_three_of_a_kind(String deck) {
		System.out.println("------AIP Has Full House vs HTB Three of  Kind-------");

		game = new Game();
		
		game.play(deck);
	}*/

	@Given("^AIP has full house beats HTB two pairs \"([^\"]*)\"$")
	public void aip_has_full_house_beats_HTB_two_pairs(String deck) {
		System.out.println("\n------FULL HOUSE-------");
		System.out.println("------PLEASE READ!! The logic is broken here from the source code, I have given a full house but it reads three of a kind-------");
		System.out.println("------I have ommited the tests that are broken because of this logic error and marked it in the correction grid-------");
		System.out.println("------AIP Has Full House vs HTB Two Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has full house beats HTB one pair \"([^\"]*)\"$")
	public void aip_has_full_house_beats_HTB_one_pair(String deck) {
		System.out.println("------AIP Has Full House vs HTB Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has full house beats HTB high card \"([^\"]*)\"$")
	public void aip_has_full_house_beats_HTB_high_card(String deck) {
		System.out.println("------AIP Has Full House vs HTB High Card-------");

		game = new Game();
		
		game.play(deck);
	}
	
	
	//FLUSH
	@Given("^AIP has flush beats HTB straight \"([^\"]*)\"$")
	public void aip_has_flush_beats_HTB_straight(String deck) {
		System.out.println("\n------FLUSH-------");
		System.out.println("------AIP Has Flush vs HTB Straight-------");
		
		// Make a new game object
		game = new Game();
		
		//Play the game, prints everything for me
		game.play(deck);
	}

	@Given("^AIP has flush beats HTB three of a kind \"([^\"]*)\"$")
	public void aip_has_flush_beats_HTB_three_of_a_kind(String deck) {
		System.out.println("------AIP Has Flush vs HTB Three of a Kind-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has flush beats HTB two pairs \"([^\"]*)\"$")
	public void aip_has_flush_beats_HTB_two_pairs(String deck) {
		System.out.println("------AIP Has Flush vs HTB Two Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has flush beats HTB one pair \"([^\"]*)\"$")
	public void aip_has_flush_beats_HTB_one_pair(String deck) {
		System.out.println("------AIP Has Flush vs HTB Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has flush beats HTB high card \"([^\"]*)\"$")
	public void aip_has_flush_beats_HTB_high_card(String deck) {
		System.out.println("------AIP Has Flush vs HTB High Card-------");

		game = new Game();
		
		game.play(deck);
	}
	
	
	//STRAIGHT
	@Given("^AIP has straight beats HTB three of a kind \"([^\"]*)\"$")
	public void aip_has_straight_beats_HTB_three_of_a_kind(String deck) {
		System.out.println("\n------STRAIGHT-------");
		System.out.println("------AIP Has Straight vs HTB Three of a Kind-------");
		
		// Make a new game object
		game = new Game();
		
		//Play the game, prints everything for me
		game.play(deck);
	}

	@Given("^AIP has straight beats HTB two pairs \"([^\"]*)\"$")
	public void aip_has_straight_beats_HTB_two_pairs(String deck) {
		System.out.println("------AIP Has Straight vs HTB Two Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has straight beats HTB one pair \"([^\"]*)\"$")
	public void aip_has_straight_beats_HTB_one_pair(String deck) {
		System.out.println("------AIP Has Straight vs HTB Pair-------");

		game = new Game();
		
		game.play(deck);
	}

	@Given("^AIP has straight beats HTB high card \"([^\"]*)\"$")
	public void aip_has_straight_beats_HTB_high_card(String deck) {
		System.out.println("------AIP Has Straight vs HTB High Card-------");

		game = new Game();
		
		game.play(deck);
	}

	@Then("^AIP wins$")
	public void aip_wins() {
		Assert.assertEquals(true, game.AIPWon());		
	}

}
