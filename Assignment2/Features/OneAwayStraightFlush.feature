Feature: AIP is one away from Straight Flush and Wins

Scenario: AIP is 1 card away from a straight flush and exchanges that card THEN WINS with straight flush
		Given AIP is one card away from a straight flush
		|CA|D2|H9|S3|S7|
		|D4|D5|D6|D7|S10|
		And AIP exchanges card "D8"
		Then AIP wins with straight flush