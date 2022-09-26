Feature: Contact to Us Functionality

  In order to contact with Automation Exercise website
  As a user
  I want to send a message successfully

  Scenario: Go to the contact page
    Given I am on the homepage
    When I click the contact button
    Then Taken to contact page

  Scenario: Fill in the contact page
    Given I am on the contact page
    When Fill in the blanks
    And Click the submit button
    And I click the contact button
    Then Verify success message
    And Go to the homepage