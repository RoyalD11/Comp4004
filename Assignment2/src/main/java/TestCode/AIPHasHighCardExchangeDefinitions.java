package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPHasHighCardExchangeDefinitions {
	
	Game game;
	
	@Given("^AIP Has High Card Exchanges Three \"([^\"]*)\"$")
	public void aip_Has_High_Card_Exchanges_Three(String data) {
		System.out.println("\n------------------AIP Has High Card, Exchanges Cards------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^AIP has swapped hand$")
	public void aip_has_swapped_hand() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
