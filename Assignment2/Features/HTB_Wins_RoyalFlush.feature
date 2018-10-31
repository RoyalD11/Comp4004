Feature: HTB beats AIP with a Royal Flush

Scenario: HTB has royal flush beats AIP straight flush
		Given HTB has a royal flush and AIP has a straight flush "H10 HJ HQ HK HA D4 D5 D6 D7 D8"
		Then HTB wins 
		
Scenario: HTB has royal flush beats AIP 4 of a kind
		Given HTB has a royal flush and AIP has a four of a kind "H10 HJ HQ HK HA D4 S4 H4 C4 D8"
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP full house
		Given HTB has royal flush beats AIP full house "H10 HJ HQ HK HA D4 S8 H4 C4 D8"
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP flush
		Given HTB has royal flush beats AIP flush "H10 HJ HQ HK HA D10 D8 D4 D7 D2"
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP straight
		Given HTB has royal flush beats AIP straight "H10 HJ HQ HK HA D4 S5 H6 C7 D8"
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP 3 of a kind
		Given HTB has royal flush beats AIP three of a kind "H10 HJ HQ HK HA D7 S4 H4 C4 D8"
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP two pairs
		Given HTB has royal flush beats AIP two pairs "H10 HJ HQ HK HA D4 S8 H3 C4 D8"
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP one pair
		Given HTB has royal flush beats AIP one pair "H10 HJ HQ HK HA D6 S4 H4 C10 D8"
		Then HTB wins
		
Scenario: HTB has royal flush beats AIP high card
		Given HTB has royal flush beats AIP high card "H10 HJ HQ HK HA D9 SJ H4 C6 D8"
		Then HTB wins
		