Feature: Player has a Full House

  Scenario: Hand has Full House in random order
    Given Hand has Full House in random order
      | SA | H2 | CA | D2 | DA |
    Then Hand has Full House
