package A1Poker;

import java.io.File;

import junit.framework.TestCase;

public class HandTest extends TestCase {
	
	public void AddTest() {
		Hand handAIP = new Hand();
		Hand handP2 = new Hand();
		File file = new File(".\\src\\main\\resources\\A1Poker\\cards.txt");
		
		assertEquals(5, handP2.hand.length());
	}

}
