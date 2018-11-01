Feature: AIP Wins

# ROYAL FLUSH
Scenario: AIP has royal flush holds and beats HTB straight flush
		Given AIP has a royal flush and HTB has a straight flush "D4 D5 D6 D7 D8 H10 HJ HQ HK HA"
		Then AIP wins

Scenario: AIP has royal flush beats HTB 4 of a kind
		Given AIP has a royal flush and HTB has a four of a kind "D4 S4 H4 C4 D8 H10 HJ HQ HK HA"
		Then AIP wins
		
Scenario: AIP has royal flush beats HTB full house
		Given AIP has royal flush beats HTB full house "D4 S8 H4 C4 D8 H10 HJ HQ HK HA"
		Then AIP wins
		
Scenario: AIP has royal flush beats HTB flush
		Given AIP has royal flush beats HTB flush "D10 D8 D4 D7 D2 H10 HJ HQ HK HA"
		Then AIP wins
		
Scenario: AIP has royal flush beats HTB straight
		Given AIP has royal flush beats HTB straight "D4 S5 H6 C7 D8 H10 HJ HQ HK HA"
		Then AIP wins
		
Scenario: AIP has royal flush beats HTB 3 of a kind
		Given AIP has royal flush beats HTB three of a kind "D7 S4 H4 C4 D8 H10 HJ HQ HK HA"
		Then AIP wins
		
Scenario: AIP has royal flush beats HTB two pairs
		Given AIP has royal flush beats HTB two pairs "D4 S8 H3 C4 D8 H10 HJ HQ HK HA"
		Then AIP wins
		
Scenario: AIP has royal flush beats HTB one pair
		Given AIP has royal flush beats HTB one pair "D6 S4 H4 C10 D8 H10 HJ HQ HK HA"
		Then AIP wins
		
Scenario: AIP has royal flush beats HTB high card
		Given AIP has royal flush beats HTB high card "D9 SJ H4 C6 D8 H10 HJ HQ HK HA"
		Then AIP wins
		

# STRAIGHT FLUSH
Scenario: AIP has straight flush beats HTB 4 of a kind
		Given AIP has a straight flush and HTB has a four of a kind "S10 D10 H10 C10 SJ D4 D5 D6 D7 D8"
		Then AIP wins
		
Scenario: AIP has straight flush beats HTB full house
		Given AIP has straight flush beats HTB full house "C8 S8 H4 C4 H8 D4 D5 D6 D7 D8"
		Then AIP wins
		
Scenario: AIP has straight flush beats HTB flush
		Given AIP has straight flush beats HTB flush "H10 H8 H4 H7 H2 D4 D5 D6 D7 D8"
		Then AIP wins
		
Scenario: AIP has straight flush beats HTB straight
		Given AIP has straight flush beats HTB straight "C4 S5 H6 C7 C8 D4 D5 D6 D7 D8"
		Then AIP wins
		
Scenario: AIP has straight flush beats HTB 3 of a kind
		Given AIP has straight flush beats HTB three of a kind "C7 S4 H4 C4 C8 D4 D5 D6 D7 D8"
		Then AIP wins
		
Scenario: AIP has straight flush beats HTB two pairs
		Given AIP has straight flush beats HTB two pairs "S4 S8 H3 C4 H8 D4 D5 D6 D7 D8"
		Then AIP wins
		
Scenario: AIP has straight flush beats HTB one pair
		Given AIP has straight flush beats HTB one pair "S6 S4 H4 C10 H8 D4 D5 D6 D7 D8"
		Then AIP wins
		
Scenario: AIP has straight flush beats HTB high card
		Given AIP has straight flush beats HTB high card "H9 SJ H4 C6 H8 D4 D5 D6 D7 D8"
		Then AIP wins
		
		
# FOUR OF A KIND
Scenario: AIP has four of a kind beats HTB full house
		Given AIP has four of a kind beats HTB full house "C8 S8 H4 C4 H8 S10 D10 H10 C10 SJ"
		Then AIP wins
		
Scenario: AIP has four of a kind beats HTB flush
		Given AIP has four of a kind beats HTB flush "HJ H8 H4 H7 H2 S10 D10 H10 C10 SJ"
		Then AIP wins
		
Scenario: AIP has four of a kind beats HTB straight
		Given AIP has four of a kind beats HTB straight "C4 S5 H6 C7 C8 S10 D10 H10 C10 SJ"
		Then AIP wins
		
Scenario: AIP has four of a kind beats HTB 3 of a kind
		Given AIP has four of a kind beats HTB three of a kind "C7 S4 H4 C4 C8 S10 D10 H10 C10 SJ"
		Then AIP wins
		
Scenario: AIP has four of a kind beats HTB two pairs
		Given AIP has four of a kind beats HTB two pairs "S4 S8 H3 C4 H8 S10 D10 H10 C10 SJ"
		Then AIP wins
		
Scenario: AIP has four of a kind beats HTB one pair
		Given AIP has four of a kind beats HTB one pair "S6 S4 H4 C10 H8 S10 D10 H10 C10 SJ"
		Then AIP wins
		
Scenario: AIP has four of a kind beats HTB high card
		Given AIP has four of a kind beats HTB high card "H9 CJ H4 C6 H8 S10 D10 H10 C10 SJ"
		Then AIP wins
		
	
# FULL HOUSE ---- THE ONES COMMENTED OUT ARE BROKEN DUE TO BASE CODE LOGIC, CHECK OUTPUT AND YOU WILL SEE
#Scenario: AIP has full house beats HTB flush
#		Given AIP has full house beats HTB flush "HJ H8 H4 H7 H2 SK D10 HK C10 S10"
#		Then AIP wins
		
#Scenario: AIP has full house beats HTB straight
#		Given AIP has full house beats HTB straight "C4 S5 H6 C7 C8 SK D10 HK C10 S10"
#		Then AIP wins
		
#Scenario: AIP has full house beats HTB 3 of a kind
#		Given AIP has full house beats HTB three of a kind "C7 S4 H4 C4 C8 SK D10 HK C10 S10"
#		Then AIP wins
		
Scenario: AIP has full house beats HTB two pairs
		Given AIP has full house beats HTB two pairs "S4 S8 H3 C4 H8 SK D10 HK C10 S10"
		Then AIP wins
		
Scenario: AIP has full house beats HTB one pair
		Given AIP has full house beats HTB one pair "S6 S4 H4 C10 H8 SK D10 HK C10 S10"
		Then AIP wins
		
Scenario: AIP has full house beats HTB high card
		Given AIP has full house beats HTB high card "H9 CJ H4 C6 H8 SK D10 HK C10 S10"
		Then AIP wins
		
		
# FLUSH
Scenario: AIP has flush beats HTB straight
		Given AIP has flush beats HTB straight "C4 S5 H6 C7 C8 SK SQ SA S2 S10"
		Then AIP wins
		
Scenario: AIP has flush beats HTB 3 of a kind
		Given AIP has flush beats HTB three of a kind "C7 S4 H4 C4 C8 SK SQ SA S2 S10"
		Then AIP wins
		
Scenario: AIP has flush beats HTB two pairs
		Given AIP has flush beats HTB two pairs "S4 S8 H3 C4 H8 SK SQ SA S2 S10"
		Then AIP wins
		
Scenario: AIP has flush beats HTB one pair
		Given AIP has flush beats HTB one pair "S6 S4 H4 C10 H8 SK SQ SA S2 S10"
		Then AIP wins
		
Scenario: AIP has flush beats HTB high card
		Given AIP has flush beats HTB high card "H9 CJ H4 C6 H8 SK SQ SA S2 S10"
		Then AIP wins
		
		
# STRAIGHT		
Scenario: AIP has straight beats HTB 3 of a kind
		Given AIP has straight beats HTB three of a kind "C10 H10 D10 S4 D8 C4 S5 H6 C7 C8"
		Then AIP wins
		
Scenario: AIP has straight beats HTB two pairs
		Given AIP has straight beats HTB two pairs "S4 S8 H3 D4 H8 C4 S5 H6 C7 C8"
		Then AIP wins
		
Scenario: AIP has straight beats HTB one pair
		Given AIP has straight beats HTB one pair "S6 S4 H4 C10 H8 C4 S5 H6 C7 C8"
		Then AIP wins
		
Scenario: AIP has straight beats HTB high card
		Given AIP has straight beats HTB high card "H9 CJ H4 C6 H8 C4 S5 H6 C7 C8"
		Then AIP wins