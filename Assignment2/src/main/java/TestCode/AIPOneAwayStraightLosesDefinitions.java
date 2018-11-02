package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPOneAwayStraightLosesDefinitions {
	
	Game game;
	
	@Given("^AIP almost has a Straight exchanges one card \"([^\"]*)\"$")
	public void aip_almost_has_a_Straight_exchanges_one_card(String data) {
		System.out.println("\n------------------AIP One Away from Straight, Exchanges a Card and Loses------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^AIP loses without Straight$")
	public void aip_loses_without_Straight() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
