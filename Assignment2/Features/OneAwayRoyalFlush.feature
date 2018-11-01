Feature: AIP is one away from Royal Flush and Wins

Scenario: AIP is 1 card away from a royal flush and exchanges that card  THEN WINS with royal flush
		Given AIP is one card away from a royal flush
		|D4|D5|D6|D7|D8|
		|H10|HJ|HQ|HK|S6|
		And AIP exchanges that card "HA"
		Then AIP wins with royal flush