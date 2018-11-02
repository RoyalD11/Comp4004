Feature: AIP is one away from Three of a Kind and Loses

Scenario: AIP is 1 card away from a three of a kind and exchanges that card  THEN LOSES with three of a kind
		Given AIP almost has a three of a kind exchanges one card "S10 SJ SQ SK SA CK HK DK H10 S2"
		Then AIP loses with a three of a kind