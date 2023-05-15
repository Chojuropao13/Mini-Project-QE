Feature: As a user i want to success login so that i can see product page

  @Positif
  Scenario: as user i want to input valid to then i can see success login
    Given user on login page
    When user input valid email
    And user input valid password
    And click login
    Then user on product page

    @negatif
    Scenario: as user i want to see the failed login
      Given user on page alta
      When user input email
      And user input password
      And user click login
      Then user see product page