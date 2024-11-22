Feature: User Login

  Scenario Outline: login user with valid username and password
    Given user "ali" with password "1234"
    And another user "reza" with password "abcd"
    When "<username>" tries to login with password "<password>"
    Then login result is "<result>"

    Examples:
      | username | password | result |
      | ali      | 1234     | true   |
      | ali      | 4321     | false  |
      | reza     | abcd     | true   |
      | reza     | qwer     | false  |
      | mohammad | 1234     | false  |