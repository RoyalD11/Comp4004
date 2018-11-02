Feature: AIP is one away from Royal Flush and Loses

Scenario: AIP is 1 card away from a royal flush and exchanges that card  THEN LOSES without royal flush
		Given AIP almost has a royal flush exchanges one card "S10 SJ SQ SK SA C10 CQ S2 CK CA"
		Then AIP loses