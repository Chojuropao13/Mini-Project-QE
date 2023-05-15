Feature: As a user get all products


  @TC-1
  Scenario: Get all products
    Given I set Get Auth endpoint
    When I Set GET Http request
    And I receive valid data for detail all products
    Then I receive valid HTTP response code 200

    @TC-2
    Scenario: Create a new product
      Given I Want to post new user data
      When I need Set POST Http request
      Then I got valid HTTP response code 201

      @TC-3
      Scenario: Get product By ID
        Given I set Getid to get some data
        When I need Set GetId Http request
        Then I see Http response code 200

        @TC-4
        Scenario: DELETE As Admin can delete data
          Given I set can DELETE data
          When I can set DELETE Http Request
          Then give Http code 404

          @TC-5
          Scenario: Get Rating product
            Given user see the product
            When user give ratings for the products
            And users view product-related ratings
            Then give responce code 200

            @TC-6
            Scenario: Create a comment for product
              Given I Want to post new comment
               When i was given a Http
                Then I got HTTP response code 200

              @TC-7
              Scenario: GetProductComments
                Given now user see the product
                When user want to see the comments
                Then give Products comment responce 200
