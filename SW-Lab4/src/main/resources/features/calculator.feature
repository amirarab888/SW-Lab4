Feature: Calculator Features

  Scenario: adding two numbers
    Given Two input values, 20.0 and -13.0
    When I add the two values
    Then I expect the result 7.0 for add

  Scenario: multiplying two numbers
    Given Two input values, -12.0 and -15.0
    When I multiple the two values
    Then I expect the result 180.0 for mul