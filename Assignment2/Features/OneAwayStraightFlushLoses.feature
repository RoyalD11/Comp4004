Feature: AIP is one away from Straight Flush and Loses

Scenario: AIP is 1 card away from a straight flush and exchanges that card  THEN LOSES without straight flush
		Given AIP almost has a straight flush exchanges one card "S10 SJ SQ SK SA C10 CQ S2 CK C9"
		Then AIP loses without a straight flush