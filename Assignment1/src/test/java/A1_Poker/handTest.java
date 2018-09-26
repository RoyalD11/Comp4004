package A1_Poker;

import junit.framework.TestCase;

public class handTest extends TestCase {
	
	public void testOpenFile() {
		//Creates a player object from the hand class
		Hand playerAIP = new Hand();
		Hand playerP2 = new Hand();

		
		//Tests if the file is actually opened.
		assertEquals(true, playerAIP.openFile("cards.txt"));
		assertEquals(true, playerP2.openFile("cards.txt"));

	}
	
	public void testCloseFile() {
		//Creates a player object from the hand class
		Hand playerAIP = new Hand();
		Hand playerP2 = new Hand();

		playerAIP.openFile("cards.txt");
		playerP2.openFile("cards.txt");
		
		//Tests if the file is actually opened.
		assertEquals(true, playerAIP.closeFile());
		assertEquals(true, playerP2.closeFile());

	}
	
	public void testHandSize() {
		Hand playerAIP = new Hand();
		playerAIP.openFile("cards.txt");
		
		assertEquals(5, playerAIP.drawHand());
	}
	
	public void testHandSizeP2() {
		Hand playerP2 = new Hand();
		playerP2.openFile("cards.txt");
		
		assertEquals(5, playerP2.drawHand());
	}
}
