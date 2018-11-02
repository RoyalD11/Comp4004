package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BothHaveThreeoaKindDefinitions {
	
	Game game;
	
	@Given("^Both Have Three of a Kind \"([^\"]*)\"$")
	public void both_Have_Three_of_a_Kind(String data) {
		System.out.println("\n------------------Both Have Three of a Kind------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^highest three of a kind wins$")
	public void highest_three_of_a_kind_wins() {
		Assert.assertEquals(false, game.AIPWin);
	}
}
