Feature: Remove product from cart

  Scenario: Remove item added before
    Given I am on the home page
    When I click the products button
    And I add a product to cart
    Then I remove added product from cart