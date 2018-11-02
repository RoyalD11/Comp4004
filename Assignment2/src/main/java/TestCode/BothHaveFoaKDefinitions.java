package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BothHaveFoaKDefinitions {
	
	Game game;
	
	@Given("^Both Have Four of a Kind \"([^\"]*)\"$")
	public void both_Have_Four_of_a_Kind(String data) {
		System.out.println("\n------------------Both Have Four of a Kind------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^highest four of a kind wins$")
	public void highest_four_of_a_kind_wins() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
