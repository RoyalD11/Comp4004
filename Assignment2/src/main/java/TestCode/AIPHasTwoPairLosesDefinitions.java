package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPHasTwoPairLosesDefinitions {
	
	Game game;
	
	@Given("^AIP has two pair exchanges off card \"([^\"]*)\"$")
	public void aip_has_two_pair_exchanges_off_card(String data) {
		System.out.println("\n------------------AIP Has Two Pair, Exchanges a Card and Loses------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^AIP loses with two pair$")
	public void aip_loses_with_two_pair() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
