package selenium;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;

import config.SeleniumTest;
import selenium.page.IndexPage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.concurrent.TimeUnit;

/**
 * 
 */
@SeleniumTest
public class GameTest extends AbstractSeleniumTest {

    @Autowired
    private IndexPage indexPage;
    public static final int TIME = 3;
    
 

    @Test
    public void processAI(){
    	
    	//connect
    	this.indexPage.connect.click();
    	this.delay(TIME);
		this.indexPage.open.click();
		this.delay(TIME);
		this.indexPage.start.click();
		this.delay(TIME);
		
    	//9:including check all AI players have made their choices 
		assertThat(this.indexPage.hasText("All AI players have made their choices."), is(true));
		this.delay(TIME);
		this.indexPage.disconnect.click();                  
    }
 
    

 
	@Test
    public void canUseStayOption(){
		
		//10:code for connect then selecting stay then disconnect
		this.indexPage.connect.click();
    	this.delay(TIME);
		this.indexPage.open.click();
		this.delay(TIME);
		this.indexPage.start.click();
		this.delay(TIME);
		this.indexPage.stay.click();
		this.delay(TIME);
		
		//Checks that Stay has been clicked
		assertThat(this.indexPage.hasText("You decided to STAY. Sending to server"), is(true));
		this.delay(TIME);
		this.indexPage.disconnect.click();
	
    }


    @Test
    public void canUseHitOption() {
    	
    	//11: missing code similar to 10    
    	this.indexPage.connect.click();
    	this.delay(TIME);
		this.indexPage.open.click();
		this.delay(TIME);
		this.indexPage.start.click();
		this.delay(TIME);
		this.indexPage.hit.click();
		this.delay(TIME);
		
		//Checks that Hit has been clicked
		assertThat(this.indexPage.hasText("You decided to HIT. Sending to server"), is(true));
		this.delay(TIME);
		this.indexPage.disconnect.click();
    }
    
    
 
    @Test
    public void canImproveCards(){
    	//12: missing code for connect, improve and disconnect 
    	this.indexPage.connect.click();
    	this.delay(TIME);
		this.indexPage.open.click();
		this.delay(TIME);
		this.indexPage.start.click();
		this.delay(TIME);
		this.indexPage.hit.click();
		this.delay(TIME);
		
		//This will check the checkbox of the card specified, in this case it is player card 1 and 2 as they are the lowest ranked cards
		this.indexPage.playerHandCards.findElement(By.id("PlayerCard1")).findElement(By.tagName("input")).click();
		this.indexPage.playerHandCards.findElement(By.id("PlayerCard2")).findElement(By.tagName("input")).click();
		this.delay(TIME);
		
		//Clicks done button
		this.indexPage.done.click();
		this.delay(TIME);
		
		//Checks that the player exchanges cards
		assertThat(this.indexPage.hasText("You decided to improve card"), is(true));
		this.delay(TIME);
		
		this.indexPage.disconnect.click();
    }
  
}
