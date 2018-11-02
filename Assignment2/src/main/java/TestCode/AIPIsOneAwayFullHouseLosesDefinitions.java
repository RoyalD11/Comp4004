package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPIsOneAwayFullHouseLosesDefinitions {
	
	Game game;
	
	@Given("^AIP almost has a three of a kind exchanges one card \"([^\"]*)\"$")
	public void aip_almost_has_a_three_of_a_kind_exchanges_one_card(String data) {
		System.out.println("\n------------------AIP One Away from Full House, Exchanges a Card and Loses------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^AIP loses with a three of a kind$")
	public void aip_loses_with_a_three_of_a_kind() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
