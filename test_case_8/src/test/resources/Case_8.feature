Feature: Show the first product information
  Scenario: Press products and view products
    Given I am on the homepage
    When I press the products button
    And I press the view details
    Then Show the first product details