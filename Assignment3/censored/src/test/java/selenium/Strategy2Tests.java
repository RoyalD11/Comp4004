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
public class Strategy2Tests extends AbstractSeleniumTest {

    @Autowired
    private IndexPage indexPage;
    public static final int TIME = 5;
    
    
    //
    @Test
    public void S2Test1(){
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
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-10 hearts, rank-j hearts, rank-q hearts, rank-k hearts, rank-a hearts");
		a.accept();

		// other 2 One Pair
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-2 clubs, rank-2 spades, rank-8 clubs, rank-5 diams, rank-6 diams");
		a.accept();

		// other 3 Two Pair
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("rank-10 hearts, rank-10 clubs, rank-k hearts, rank-k diams, rank-a hearts");
		a.accept();

		assertThat(this.indexPage.hasText("Setting all cards"), is(true));
		
		
		String [] playerIDs = this.indexPage.getUsetTexts();

		
		// user 1 follows strategy one and stays 
		assertThat(this.indexPage.hasText(playerIDs[0] + " choose to STAY"), is(true));
		
		
		//User 2 has one pair and exchanges other 3 cards, following strategy 1 as there are no visible cards.
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("2:rank-a diams, 3:rank-a spades, 4:rank-a clubs");
		a.accept();
		assertThat(this.indexPage.hasText(playerIDs[1] + " choose to HIT"), is(true));
		
		
		//User 3 has two pair and keeps them as there are three visible cards of same kind, exchanges other card
		this.waitForAlert();
		a = this.webDriver.switchTo().alert();
		a.sendKeys("4:rank-j clubs");
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
		assertThat(this.indexPage.hasText(playerIDs[2] + " lost with a score of TWO_PAIR, ranked 3!"), is(true));

		//Player loses
		assertThat(this.indexPage.hasText(playerIDs[3] + " lost with a score of HIGH_CARD, ranked 4!"), is(true));
		
		this.delay(TIME);
		this.indexPage.disconnect.click();
    
    }  
    
}
