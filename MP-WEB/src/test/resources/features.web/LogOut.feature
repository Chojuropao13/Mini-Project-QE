Feature: As User if i finished shopping so i want to log out

  Scenario: when i finish shopping i want to logout
    Given a user on login page
    When a user input valid username
    And a user input valid password
    And user click buutton
    And look at the menu log out
    Then user click to logout