package A1_Poker;

import junit.framework.TestCase;

public class handTest extends TestCase {
	
	public void testHandSize() {
		Hand playerAIP = new Hand();
		Hand playerP2 = new Hand();

		assertEquals(5, playerAIP.drawHand());
		assertEquals(5, playerP2.drawHand());
	}
}
