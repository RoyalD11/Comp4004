Feature: HTB Wins

# ROYAL FLUSH
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


# STRAIGHT FLUSH
Scenario: HTB has straight flush beats AIP 4 of a kind
		Given HTB has a straight flush and AIP has a four of a kind "D4 D5 D6 D7 D8 S10 D10 H10 C10 SJ"
		Then HTB wins
		
Scenario: HTB has straight flush beats AIP full house
		Given HTB has straight flush beats AIP full house "D4 D5 D6 D7 D8 C8 S8 H4 C4 H8"
		Then HTB wins
		
Scenario: HTB has straight flush beats AIP flush
		Given HTB has straight flush beats AIP flush "D4 D5 D6 D7 D8 H10 H8 H4 H7 H2"
		Then HTB wins
		
Scenario: HTB has straight flush beats AIP straight
		Given HTB has straight flush beats AIP straight "D4 D5 D6 D7 D8 C4 S5 H6 C7 C8"
		Then HTB wins
		
Scenario: HTB has straight flush beats AIP 3 of a kind
		Given HTB has straight flush beats AIP three of a kind "D4 D5 D6 D7 D8 C7 S4 H4 C4 C8"
		Then HTB wins
		
Scenario: HTB has straight flush beats AIP two pairs
		Given HTB has straight flush beats AIP two pairs "D4 D5 D6 D7 D8 S4 S8 H3 C4 H8"
		Then HTB wins
		
Scenario: HTB has straight flush beats AIP one pair
		Given HTB has straight flush beats AIP one pair "D4 D5 D6 D7 D8 S6 S4 H4 C10 H8"
		Then HTB wins
		
Scenario: HTB has straight flush beats AIP high card
		Given HTB has straight flush beats AIP high card "D4 D5 D6 D7 D8 H9 SJ H4 C6 H8"
		Then HTB wins
		
		
# FOUR OF A KIND
Scenario: HTB has four of a kind beats AIP full house
		Given HTB has four of a kind beats AIP full house "S10 D10 H10 C10 SJ C8 S8 H4 C4 H8"
		Then HTB wins
		
Scenario: HTB has four of a kind beats AIP flush
		Given HTB has four of a kind beats AIP flush "S10 D10 H10 C10 SJ HJ H8 H4 H7 H2"
		Then HTB wins
		
Scenario: HTB has four of a kind beats AIP straight
		Given HTB has four of a kind beats AIP straight "S10 D10 H10 C10 SJ C4 S5 H6 C7 C8"
		Then HTB wins
		
Scenario: HTB has four of a kind beats AIP 3 of a kind
		Given HTB has four of a kind beats AIP three of a kind "S10 D10 H10 C10 SJ C7 S4 H4 C4 C8"
		Then HTB wins
		
Scenario: HTB has four of a kind beats AIP two pairs
		Given HTB has four of a kind beats AIP two pairs "S10 D10 H10 C10 SJ S4 S8 H3 C4 H8"
		Then HTB wins
		
Scenario: HTB has four of a kind beats AIP one pair
		Given HTB has four of a kind beats AIP one pair "S10 D10 H10 C10 SJ S6 S4 H4 C10 H8"
		Then HTB wins
		
Scenario: HTB has four of a kind beats AIP high card
		Given HTB has four of a kind beats AIP high card "S10 D10 H10 C10 SJ H9 CJ H4 C6 H8"
		Then HTB wins
		

# FULL HOUSE
Scenario: HTB has full house beats AIP flush
		Given HTB has full house beats AIP flush "S10 D10 HK C10 SK HJ H8 H4 H7 H2"
		Then HTB wins
		
Scenario: HTB has full house beats AIP straight
		Given HTB has full house beats AIP straight "S10 D10 HK C10 SK C4 S5 H6 C7 C8"
		Then HTB wins
		
Scenario: HTB has full house beats AIP 3 of a kind
		Given HTB has full house beats AIP three of a kind "S10 D10 HK C10 SK C7 S4 H4 C4 C8"
		Then HTB wins
		
Scenario: HTB has full house beats AIP two pairs
		Given HTB has full house beats AIP two pairs "S10 D10 HK C10 SK S4 S8 H3 C4 H8"
		Then HTB wins
		
Scenario: HTB has full house beats AIP one pair
		Given HTB has full house beats AIP one pair "S10 D10 HK C10 SK S6 S4 H4 C10 H8"
		Then HTB wins
		
Scenario: HTB has full house beats AIP high card
		Given HTB has full house beats AIP high card "S10 D10 HK C10 SK H9 CJ H4 C6 H8"
		Then HTB wins
		
		
# FLUSH
Scenario: HTB has flush beats AIP straight
		Given HTB has flush beats AIP straight "SK SQ SA S2 S10 C4 S5 H6 C7 C8"
		Then HTB wins
		
Scenario: HTB has flush beats AIP 3 of a kind
		Given HTB has flush beats AIP three of a kind "SK SQ SA S2 S10 C7 S4 H4 C4 C8"
		Then HTB wins
		
Scenario: HTB has flush beats AIP two pairs
		Given HTB has flush beats AIP two pairs "SK SQ SA S2 S10 S4 S8 H3 C4 H8"
		Then HTB wins
		
Scenario: HTB has flush beats AIP one pair
		Given HTB has flush beats AIP one pair "SK SQ SA S2 S10 S6 S4 H4 C10 H8"
		Then HTB wins
		
Scenario: HTB has flush beats AIP high card
		Given HTB has flush beats AIP high card "SK SQ SA S2 S10 H9 CJ H4 C6 H8"
		Then HTB wins
		
		
# STRAIGHT		
Scenario: HTB has straight beats AIP 3 of a kind
		Given HTB has straight beats AIP three of a kind "C4 S5 H6 C7 C8 C10 H10 D10 S4 D8"
		Then HTB wins
		
Scenario: HTB has straight beats AIP two pairs
		Given HTB has straight beats AIP two pairs "C4 S5 H6 C7 C8 S4 S8 H3 D4 H8"
		Then HTB wins
		
Scenario: HTB has straight beats AIP one pair
		Given HTB has straight beats AIP one pair "C4 S5 H6 C7 C8 S6 S4 H4 C10 H8"
		Then HTB wins
		
Scenario: HTB has straight beats AIP high card
		Given HTB has straight beats AIP high card "C4 S5 H6 C7 C8 H9 CJ H4 C6 H8"
		Then HTB wins
		

# THREE OF A KIND
Scenario: HTB has three of a kind beats AIP two pairs
		Given HTB has three of a kind beats AIP two pairs "C10 H10 D10 S9 D8 S4 S8 H3 D4 H8"
		Then HTB wins
		
Scenario: HTB has three of a kind beats AIP one pair
		Given HTB has three of a kind beats AIP one pair "C10 H10 D10 S4 D8 S6 S4 H4 C10 H8"
		Then HTB wins
		
Scenario: HTB has three of a kind beats AIP high card
		Given HTB has three of a kind beats AIP high card "C10 H10 D10 S4 D8 H9 CJ H4 C6 H8"
		Then HTB wins
		
		
# TWO PAIR		
Scenario: HTB has two pair beats AIP one pair
		Given HTB has two pair beats AIP one pair "S4 S8 H3 D4 H8 S6 D6 H4 C10 D8"
		Then HTB wins
		
Scenario: HTB has two pair beats AIP high card
		Given HTB has two pair beats AIP high card "S4 S8 H3 D4 H8 H9 CJ H4 C6 C8"
		Then HTB wins
		

# PAIR		
Scenario: HTB has pair beats AIP high card
		Given HTB has pair beats AIP high card "S6 D6 H4 C10 D8 H9 CJ D4 C6 C8"
		Then HTB wins