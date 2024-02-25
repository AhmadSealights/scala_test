Feature: Unit tests
  Scenario: Check hello
    Given Wait for a bit
    When Request func second with "dude"
    Then the result should be "dude second"

  Scenario: Check trait
    Given Wait for a bit
    When Request func traitexample
    Then the result should be "pew pew pew"