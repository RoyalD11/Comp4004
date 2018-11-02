package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BothHaveSFDifferentSuitDefinitions {
	
	Game game;
	
	@Given("^Both Have Straight Flush with Different Suit \"([^\"]*)\"$")
	public void both_Have_Straight_Flush_with_Different_Suit(String data) {
		System.out.println("\n------------------Both Have Straight Flush With a Different Suit------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^hand with high suit wins$")
	public void hand_with_high_suit_wins() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
