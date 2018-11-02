Feature: AIP One Away Flush Exchanges And Wins

Scenario: AIP one away from flush exchanges and WINS with flush
		Given AIP is one card away from a flush
		|CA|D2|H9|S3|S7|
		|SK|S10|S2|S6|H10|
		And AIP exchanges bad card "S4"
		Then AIP wins with flush