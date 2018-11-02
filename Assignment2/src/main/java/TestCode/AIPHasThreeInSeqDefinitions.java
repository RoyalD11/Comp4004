package TestCode;

import org.junit.Assert;

import core.Game;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AIPHasThreeInSeqDefinitions {
	
	Game game;
	
	@Given("^AIP Has Three in Seq Exchanges Two \"([^\"]*)\"$")
	public void aip_Has_Three_in_Seq_Exchanges_Two(String data) {
		System.out.println("\n------------------AIP Has Three in Sequence, Exchanges a Cards------------------ ");
		game = new Game();
		game.play(data);
	}

	@Then("^AIP has new hand$")
	public void aip_has_new_hand() {
		Assert.assertEquals(false, game.AIPWin);
	}

}
