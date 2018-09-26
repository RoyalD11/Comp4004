package A1_Poker;

import junit.framework.TestCase;

public class handTest extends TestCase {
	
	public void testHandSize() {
		Hand playerAIP = new Hand();
		
		assertEquals(5, playerAIP.drawHand());
	}
	
	public void testHandSizeP2() {
		Hand playerP2 = new Hand();
		
		assertEquals(5, playerP2.drawHand());
	}
}
