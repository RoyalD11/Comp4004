Feature: HTB beats AIP with a Royal Flush

Scenario: HTB has royal flush beats AIP straight flush
		Given HTB has a royal flush and AIP has a straight flush
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP 4 of a kind
		Given HTB has a royal flush and AIP has a four of a kind
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP full house
		Given HTB has royal flush beats AIP full house
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP flush
		Given HTB has royal flush beats AIP flush
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP straight
		Given HTB has royal flush beats AIP straight
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP 3 of a kind
		Given HTB has royal flush beats AIP three of a kind
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP two pairs
		Given HTB has royal flush beats AIP two pairs
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP one pair
		Given HTB has royal flush beats AIP one pair
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP high card
		Given HTB has royal flush beats AIP high card
		Then HTB wins
		