package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BothHaveSFDistinctHighCardDefinitions {
	
	Game game;
	
	@Given("^Both Have Straight Flush with Distinct High Card \"([^\"]*)\"$")
	public void both_Have_Straight_Flush_with_Distinct_High_Card(String data) {
		System.out.println("\n------------------Both Have Straight Flush With a Distinct High Card------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^hand with high card wins$")
	public void hand_with_high_card_wins() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
