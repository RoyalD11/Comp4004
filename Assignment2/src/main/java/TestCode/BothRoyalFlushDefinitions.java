package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BothRoyalFlushDefinitions {

	Game game;
	
	@Given("^Both players have Royal Flush \"([^\"]*)\"$")
	public void both_players_have_Royal_Flush(String data) {
		System.out.println("\n------------------Both Have Royal Flush------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^High Suit Wins$")
	public void high_Suit_Wins() {
		Assert.assertEquals(false, game.AIPWin);
	}
	
}
