Feature: AIP has Two Pair Exchanges Other Card Wins With Full House

Scenario: AIP has two pair exchanges lowest rank card and WINS with full house
		Given AIP is one card away from a two pair
		|CA|D2|H9|S3|S7|
		|SK|S10|DK|D7|H10|
		And AIP exchanges the odd card "D10"
		Then AIP wins with a full house