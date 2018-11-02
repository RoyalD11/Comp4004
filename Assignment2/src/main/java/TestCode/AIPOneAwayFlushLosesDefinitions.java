package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPOneAwayFlushLosesDefinitions {
	
	Game game;
	
	@Given("^AIP almost has a flush exchanges one card \"([^\"]*)\"$")
	public void aip_almost_has_a_flush_exchanges_one_card(String data) {
		System.out.println("\n------------------AIP One Away from Flush, Exchanges a Card and Loses------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^AIP loses without flush$")
	public void aip_loses_without_flush() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
