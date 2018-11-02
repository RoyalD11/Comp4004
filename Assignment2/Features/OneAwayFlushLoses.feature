Feature: AIP is one away from Flush and Loses

Scenario: AIP is 1 card away from a flush and exchanges that card  THEN LOSES without flush
		Given AIP almost has a flush exchanges one card "S10 SJ SQ SK SA C10 CQ S2 CK CA"
		Then AIP loses without flush