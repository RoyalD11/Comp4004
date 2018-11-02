Feature: AIP has Three of a Kind Exchanges Lowest Rank Wins With Full House

Scenario: AIP has three of a kind exchanges lowest rank card and WINS with full house
		Given AIP is one card away from a three of a kind
		|CA|D2|H9|S3|S7|
		|SK|S10|DK|D7|HK|
		And AIP exchanges lowest card "D10"
		Then AIP wins with full house