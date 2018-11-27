package selenium;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;

import ca.carleton.poker.game.entity.card.Card;
import ca.carleton.poker.game.entity.card.Hand;
import ca.carleton.poker.game.entity.card.Rank;
import ca.carleton.poker.game.entity.card.Suit;
import config.SeleniumTest;
import selenium.page.IndexPage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.concurrent.TimeUnit;

/**
 * 
 */
@SeleniumTest
public class Strategy1Tests extends AbstractSeleniumTest {

    @Autowired
    private IndexPage indexPage;
    public static final int TIME = 5;
    
    
    //Test that AI holds with straight, flush, full house
    @Test
    public void S1Test1(){
    	this.indexPage.connect.click();
		this.waitForDisplayed(this.indexPage.open).isEnabled();
		this.delay(TIME);
		this.indexPage.open.click(); // defaults is 1 player
		this.waitForDisplayed(this.indexPage.rig).isEnabled();
		this.indexPage.rig.click();

		/************************* Set initial hands ************************/
		// Player highcard
		this.waitForAlert();
		Alert a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-2 hearts, rank-3 spades, rank-4 clubs, rank-9 spades, rank-k clubs");
		a.accept();

		// other 1 Flush
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-3 hearts, rank-7 hearts, rank-a hearts, rank-j hearts, rank-9 hearts");
		a.accept();

		// other 2 Full House
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-5 clubs, rank-5 diams, rank-k clubs, rank-k hearts, rank-k spades");
		a.accept();

		// other 3 Straight
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-2 diams, rank-3 diams, rank-4 spades, rank-5 spades, rank-6 clubs");
		a.accept();

		assertThat(this.indexPage.hasText("Setting all cards"), is(true));
		
		
		String [] playerIDs = this.indexPage.getUsetTexts();

		
		// user 1, 2, 3 chooses to stay
		assertThat(this.indexPage.hasText(playerIDs[0] + " choose to STAY"), is(true));
		assertThat(this.indexPage.hasText(playerIDs[1] + " choose to STAY"), is(true));
		assertThat(this.indexPage.hasText(playerIDs[2] + " choose to STAY"), is(true));
		
		//Player chose to stay
		this.delay(TIME);
		this.indexPage.stay.click();
		assertThat(this.indexPage.hasText("You decided to STAY. Sending to server"), is(true));
		
		/***************** Check results ******************/

		
		this.delay(TIME);
		
		//User 1 loses
		assertThat(this.indexPage.hasText(playerIDs[0] + " lost with a score of FLUSH, ranked 2!"), is(true));

		//User 2 wins
		assertThat(this.indexPage.hasText(playerIDs[1] + " won with a score of FULL_HOUSE, ranked 1!"), is(true));

		//User 3 loses
		assertThat(this.indexPage.hasText(playerIDs[2] + " lost with a score of STRAIGHT, ranked 3!"), is(true));

		//Player loses
		assertThat(this.indexPage.hasText(playerIDs[3] + " lost with a score of HIGH_CARD, ranked 4!"), is(true));
		
		this.delay(TIME);
		this.indexPage.disconnect.click();
    }

    
    //Test that AI holds with Four of a Kind, Straight Flush, Royal Flush
    @Test
    public void S1Test2(){
    	this.indexPage.connect.click();
		this.waitForDisplayed(this.indexPage.open).isEnabled();
		this.delay(TIME);
		this.indexPage.open.click(); // defaults is 1 player
		this.waitForDisplayed(this.indexPage.rig).isEnabled();
		this.indexPage.rig.click();

		/************************* Set initial hands ************************/
		// Player highcard
		this.waitForAlert();
		Alert a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-2 hearts, rank-3 spades, rank-4 clubs, rank-7 spades, rank-k clubs");
		a.accept();

		// other 1 Royal Flush
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-10 hearts, rank-j hearts, rank-q hearts, rank-k hearts, rank-a hearts");
		a.accept();

		// other 2 Four of a Kind
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-9 hearts, rank-9 clubs, rank-9 diams, rank-9 spades, rank-a clubs");
		a.accept();

		// other 3 Straight Flush
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-2 diams, rank-3 diams, rank-4 diams, rank-5 diams, rank-6 diams");
		a.accept();

		assertThat(this.indexPage.hasText("Setting all cards"), is(true));
		
		
		String [] playerIDs = this.indexPage.getUsetTexts();

		
		// user 1, 2, 3 chooses to stay
		assertThat(this.indexPage.hasText(playerIDs[0] + " choose to STAY"), is(true));
		assertThat(this.indexPage.hasText(playerIDs[1] + " choose to STAY"), is(true));
		assertThat(this.indexPage.hasText(playerIDs[2] + " choose to STAY"), is(true));
		
		//Player chose to stay
		this.delay(TIME);
		this.indexPage.stay.click();
		assertThat(this.indexPage.hasText("You decided to STAY. Sending to server"), is(true));
		
		/***************** Check results ******************/

		
		this.delay(TIME);
		
		//User 1 wins
		assertThat(this.indexPage.hasText(playerIDs[0] + " won with a score of ROYAL_FLUSH, ranked 1!"), is(true));

		//User 2 loses
		assertThat(this.indexPage.hasText(playerIDs[1] + " lost with a score of FOUR_OF_A_KIND, ranked 3!"), is(true));

		//User 3 loses
		assertThat(this.indexPage.hasText(playerIDs[2] + " lost with a score of STRAIGHT_FLUSH, ranked 2!"), is(true));

		//Player loses
		assertThat(this.indexPage.hasText(playerIDs[3] + " lost with a score of HIGH_CARD, ranked 4!"), is(true));
		
		this.delay(TIME);
		this.indexPage.disconnect.click();
    }
    
    
    //Test that AI attempts to get full house
    @Test
    public void S1Test3(){
    	this.indexPage.connect.click();
		this.waitForDisplayed(this.indexPage.open).isEnabled();
		this.delay(TIME);
		this.indexPage.open.click(); // defaults is 1 player
		this.waitForDisplayed(this.indexPage.rig).isEnabled();
		this.indexPage.rig.click();

		/************************* Set initial hands ************************/
		// Player highcard
		this.waitForAlert();
		Alert a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-2 hearts, rank-3 spades, rank-4 clubs, rank-7 spades, rank-k clubs");
		a.accept();

		// other 1 Royal Flush
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-10 hearts, rank-j hearts, rank-q hearts, rank-k hearts, rank-a hearts");
		a.accept();

		// other 2 Three of a Kind
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-9 clubs, rank-9 hearts, rank-9 diams, rank-4 spades, rank-a clubs");
		a.accept();

		// other 3 One Pair
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-2 clubs, rank-2 spades, rank-8 clubs, rank-5 diams, rank-6 diams");
		a.accept();

		assertThat(this.indexPage.hasText("Setting all cards"), is(true));
		
		
		String [] playerIDs = this.indexPage.getUsetTexts();

		
		// user 1 chooses to stay with royal flush
		assertThat(this.indexPage.hasText(playerIDs[0] + " choose to STAY"), is(true));
		
		//User 2 has three of a kind and exchanges other cards
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("0:rank-q spades, 4:rank-q diams");
		a.accept();
		assertThat(this.indexPage.hasText(playerIDs[1] + " choose to HIT"), is(true));
		
		//User 3 has one pair and exchanges other 3 cards
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("2:rank-a diams, 3:rank-j spades, 4:rank-5 spades");
		a.accept();
		assertThat(this.indexPage.hasText(playerIDs[2] + " choose to HIT"), is(true));
		
		
		//Player chose to stay
		this.delay(TIME);
		this.indexPage.stay.click();
		assertThat(this.indexPage.hasText("You decided to STAY. Sending to server"), is(true));
		
		/***************** Check results ******************/

		
		this.delay(TIME);
		
		//User 1 wins
		assertThat(this.indexPage.hasText(playerIDs[0] + " won with a score of ROYAL_FLUSH, ranked 1!"), is(true));

		//User 2 loses
		assertThat(this.indexPage.hasText(playerIDs[1] + " lost with a score of FULL_HOUSE, ranked 2!"), is(true));

		//User 3 loses
		assertThat(this.indexPage.hasText(playerIDs[2] + " lost with a score of ONE_PAIR, ranked 3!"), is(true));

		//Player loses
		assertThat(this.indexPage.hasText(playerIDs[3] + " lost with a score of HIGH_CARD, ranked 4!"), is(true));
		
		this.delay(TIME);
		this.indexPage.disconnect.click();
    	
    }
    	
    



   
}
