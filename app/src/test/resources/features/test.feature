Feature: Unit tests
  Scenario: Check hello
    Given Wait for a bit
    When Request func second with "dude"
    Then the result should be "dude second"
