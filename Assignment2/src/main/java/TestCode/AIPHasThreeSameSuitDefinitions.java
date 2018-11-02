package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPHasThreeSameSuitDefinitions {
	
Game game;
	
	@Given("^AIP Has Three of Same Suit Exchanges Two \"([^\"]*)\"$")
	public void aip_Has_Three_of_Same_Suit_Exchanges_Two(String data) {
		System.out.println("\n------------------AIP Has Three of Same Suit, Exchanges a Cards------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^AIP has a new hand$")
	public void aip_has_a_new_hand() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
