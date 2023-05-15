Feature: As User i can do for register, login and get informartion

  @TC-8
  Scenario: Register
    Given user on register
    When user request register the end point
    And user input information
    Then user success login and give response code 200

    @TC-9
    Scenario: Login
      Given user on login page
      When user request HTTPS
      Then give the status code 200

      @TC-10
      Scenario: Get User Information
        Given user want to get information
        When user request HTTPS for information
        Then the status code is 200
