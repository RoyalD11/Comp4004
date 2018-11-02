Feature: AIP is one away from Straight and Loses

Scenario: AIP is 1 card away from a Straight and exchanges that card  THEN LOSES without Straight
		Given AIP almost has a Straight exchanges one card "S10 SJ SQ SK SA C4 S5 H6 C7 C10"
		Then AIP loses without Straight