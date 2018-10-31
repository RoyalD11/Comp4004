package TestCode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HIB_Wins_RoyalFlush_Definitions {
	@Given("^HTB has a royal flush and AIP has a straight flush$")
	public void HTB_has_a_royal_flush_and_AIP_has_a_straight_flush(){
	    System.out.println("HIB HAS ROYAL FLUSH vs SF");

	}
	
	@Given("^HTB has a royal flush and AIP has a four of a kind$")
	public void htb_has_a_royal_flush_and_AIP_has_a_four_of_a_kind(){
	    System.out.println("HIB HAS ROYAL FLUSH vs 4oaC");

	}
	
	@Given("^HTB has royal flush beats AIP full house$")
	public void htb_has_royal_flush_beats_AIP_full_house(){
	    System.out.println("HIB HAS ROYAL FLUSH vs FH");

	}
	
	@Given("^HTB has royal flush beats AIP flush$")
	public void htb_has_royal_flush_beats_AIP_flush() {
	 	System.out.println("HIB HAS ROYAL FLUSH vs Flush");
	}
	
	@Given("^HTB has royal flush beats AIP straight$")
	public void htb_has_royal_flush_beats_AIP_straight(){
		System.out.println("HIB HAS ROYAL FLUSH vs straight");
	}

	@Given("^HTB has royal flush beats AIP three of a kind$")
	public void htb_has_royal_flush_beats_AIP_three_of_a_kind(){
		System.out.println("HIB HAS ROYAL FLUSH vs 3oaC");
	}

	@Given("^HTB has royal flush beats AIP two pairs$")
	public void htb_has_royal_flush_beats_AIP_two_pairs(){
		System.out.println("HIB HAS ROYAL FLUSH vs two pairs");
	}

	@Given("^HTB has royal flush beats AIP one pair$")
	public void htb_has_royal_flush_beats_AIP_one_pair(){
		System.out.println("HIB HAS ROYAL FLUSH vs pair");
	}

	@Given("^HTB has royal flush beats AIP high card$")
	public void htb_has_royal_flush_beats_AIP_high_card(){
		System.out.println("HIB HAS ROYAL FLUSH vs high card");
	}

	@Then("^HTB wins$")
	public void HTB_wins(){
	    System.out.println("HIB BEAT AIP\n");
	}
}