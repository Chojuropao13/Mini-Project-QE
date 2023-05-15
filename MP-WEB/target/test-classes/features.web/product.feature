Feature: As user i want to choose the product in altashop

  @positifcase
  Scenario: as a user i want to add item in bucket
    Given as a user on homepage
    When user input usernamee
    And user input passwordd
    And clickk button
    And user click product
    And item goes to bucket
    And i want to pay
    Then I see all purchase transactions

    @NegatifCase
    Scenario: as a user I want to add a missing product to a bucket
      Given as a user on homepagee
      When user inputt usernamee
      And user inputt passwordd
      And clickk buttonn
      And user click productt
      Then item goes to buckett