Feature: Player has a Straight

Scenario: Hand has Straight in random order
		Given Hand has Straight in random order
		| S10 | H9 | H7 | C6 | D8 |
		Then Hand has Straight 
