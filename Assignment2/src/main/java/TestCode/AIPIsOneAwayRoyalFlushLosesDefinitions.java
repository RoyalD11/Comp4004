package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPIsOneAwayRoyalFlushLosesDefinitions {
	
	Game game;

	@Given("^AIP almost has a royal flush exchanges one card \"([^\"]*)\"$")
	public void aip_almost_has_a_royal_flush_exchanges_one_card(String data) {
		System.out.println("\n------------------AIP One Away from Royal Flush, Exchanges a Card and Loses------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^AIP loses$")
	public void aip_loses() {
		Assert.assertEquals(false, game.AIPWin);
	}
	
}
