package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPIsOneAwayStraightFlushLosesDefinitions {
	
	Game game;
	
	@Given("^AIP almost has a straight flush exchanges one card \"([^\"]*)\"$")
	public void aip_almost_has_a_straight_flush_exchanges_one_card(String data) {
		System.out.println("\n------------------AIP One Away from Straight Flush, Exchanges a Card and Loses------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^AIP loses without a straight flush$")
	public void aip_loses_without_a_straight_flush() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
