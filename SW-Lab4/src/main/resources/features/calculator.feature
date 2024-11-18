Feature: Calculator Add Feature

  Scenario: adding two numbers
    Given Two input values, 20.0 and -13.0
    When I add the two values
    Then I expect the result 7.0
