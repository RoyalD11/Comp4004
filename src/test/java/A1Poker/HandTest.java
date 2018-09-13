package A1Poker;

import junit.framework.TestCase;

public class HandTest extends TestCase {
	
	public void AddTest() {
		Hand handAIP = new Hand();
		Hand handP2 = new Hand();
		
		assertEquals(5, handP2.hand.length);
		assertEquals(5, handAIP.hand.length);
	}

}
