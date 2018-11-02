package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPHasOnePairDefinitions {
	
	Game game;
	
	@Given("^AIP Has Pair Exchanges Three \"([^\"]*)\"$")
	public void aip_Has_Pair_Exchanges_Three(String data) {
		System.out.println("\n------------------AIP Has Pair, Exchanges Cards------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^AIP has brand new hand$")
	public void aip_has_brand_new_hand() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
