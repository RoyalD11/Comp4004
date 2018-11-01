Feature: AIP is one away from Royal Flush and Loses

Scenario: AIP is 1 card away from a royal flush and exchanges that card  THEN LOSES with royal flush
		Given AIP almost has a royal flush
		|D4|D5|D6|D7|D8|
		|H10|HJ|HQ|HK|S6|
		And AIP exchanges a card "S2"
		Then AIP loses