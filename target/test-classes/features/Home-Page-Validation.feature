Feature: This for to verify the home page

  Scenario: Home Page
    Given I am navigating to the home page
    Then I need to verify the home page
    When I select the business
    Then I need to verify the business page
    And I go to registration
    Then verify the login page