Feature: AIP One Away Straight Exchanges And Wins

Scenario: AIP one away from straight exchanges and WINS with straight
		Given AIP is one card away from a straight
		|CA|D2|H9|S3|S7|
		|C4|S5|H6|C7|C10|
		And AIP exchanges missing card "C8"
		Then AIP wins with straight