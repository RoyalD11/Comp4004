package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BothHaveFullHouseDefinitions {
	
	Game game;
	
	@Given("^Both Have Full House \"([^\"]*)\"$")
	public void both_Have_Full_House(String data) {
		System.out.println("\n------------------Both Have Full House------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^highest full house wins$")
	public void highest_full_house_wins() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
