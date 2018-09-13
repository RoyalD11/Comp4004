package A1Poker;

import junit.framework.TestCase;

public class HandTest extends TestCase {
	
	public void ContainsTest() {
		Hand handAIP = new Hand();
		Hand handP2 = new Hand();
		
		assertEquals(5, handAIP.handCards.length);
		assertEquals(5, handP2.handCards.length);
	}

}
