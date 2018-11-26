package selenium;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

import config.SeleniumTest;
import selenium.page.IndexPage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.concurrent.TimeUnit;

/**
 * Test the ability to connect and disconnect to the game.
 * 
 */
@SeleniumTest
public class ConnectionBasicsTest extends AbstractSeleniumTest {

	@Autowired
	private IndexPage indexPage;
	public static final int TIME = 3;

	@Test
	public void canConnect() {

		this.indexPage.connect.click();
		this.delay(TIME);
		assertThat(this.indexPage.hasText("Successfully connected to the game with unique "), is(true));
		assertThat(this.indexPage.hasText("You have been designated the admin for this game."), is(true));

		this.indexPage.disconnect.click();
		this.delay(TIME);
		assertThat(this.indexPage.hasText("Connection closed"), is(true));

	}

	@Test
	public void canOpenLobby() {
		this.indexPage.connect.click();
		this.delay(TIME);
		this.indexPage.open.click();
		this.delay(TIME);

		// 1: assertThat lobby is open
		assertThat(this.indexPage.hasText("The game is now ready to begin."), is(true));

		this.indexPage.disconnect.click();
	}

	@Test
	public void canConenctTwoPlayers() {

		// 2: connect player one
		// Connect to the game, set the number of players, open the game.
		this.indexPage.connect.click();
		this.delay(TIME);
		this.indexPage.setNumberPlayers(2);
		this.delay(TIME);
		this.indexPage.open.click();
		this.delay(TIME);
		assertThat(this.indexPage.hasText("Successfully connected to the game with unique id " + this.indexPage.getPlayerUID()), is(true));

		// 3: Second Player Connect
		ChromeDriver player2 = quickConnectAnotherUser();

		// Start the game, get the array containing all player Ids
		this.indexPage.start.click();
		this.delay(TIME);
		String[] playerIDs = this.indexPage.getUsetTexts();

		// Loop through the array and increment the counter when a players ID does not
		// contain AI
		int counter = 0;
		for (int i = 0; i < playerIDs.length; i++) {
			if (!(playerIDs[i].contains("AI")))
				counter++;
		}

		// Passes if the counter is 2
		assertThat(counter, is(2));

		// 4: quit
		this.indexPage.disconnect.click();
		this.delay(TIME);
		assertThat(this.indexPage.hasText("Connection closed"), is(true));

	}

	@Test
	public void canConenctMultiplePlayers() {

		// 5: Connect Player One
		this.indexPage.connect.click();
		this.delay(TIME);
		this.indexPage.setNumberPlayers(3);
		this.delay(TIME);
		this.indexPage.open.click();
		this.delay(TIME);
		assertThat(this.indexPage.hasText("Successfully connected to the game with unique id " + this.indexPage.getPlayerUID()), is(true));


		// 6: Connect Player Two
		ChromeDriver player2 = quickConnectAnotherUser();
		
		// 7: Connect Player Three
		ChromeDriver player3 = quickConnectAnotherUser();


		// Start the game, get the array containing all player Ids
		this.indexPage.start.click();
		this.delay(TIME);
		String[] playerIDs = this.indexPage.getUsetTexts();

		// Loop through the array and increment the counter when a players ID does not
		// contain AI
		int counter = 0;
		for (int i = 0; i < playerIDs.length; i++) {
			if (!(playerIDs[i].contains("AI")))
				counter++;
		}

		// Passes if the counter is 2
		assertThat(counter, is(3));


		// Disconnect
		this.indexPage.disconnect.click();
		this.delay(TIME);
		assertThat(this.indexPage.hasText("Connection closed"), is(true));

	}

	@Test
	public void canStartGame() {
		this.indexPage.connect.click();
		this.delay(TIME);
		this.indexPage.open.click();
		this.delay(TIME);
		this.indexPage.start.click();
		this.delay(TIME);

		// 8: Starting the Game
		assertThat(this.indexPage.hasText("The game has started!"), is(true));

		this.indexPage.disconnect.click();
	}

}
