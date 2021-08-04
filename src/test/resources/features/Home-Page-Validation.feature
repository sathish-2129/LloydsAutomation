Feature: This for to verify the home page

  Scenario: Home Page
    Given I am navigating to the home page
    Then I need to verify the home page
    When I select the business
    Then I need to verify the business page
    And I go to registration
    Then verify the register page
    When I start the registration
    Then verify the login page
    When I click on the Full Power Signatory
    And I click on the continue
    Then verify the your details page
    And I enter all your details
    |Automation|40|33|33|123456|Mr|Sathish|Durai|24|February|1984|mk91an|