Feature: test registration Functionalities

  @regression
  Scenario: As a User i should be able register successfully

    Given I am on homepage
    When I click on Sign in
    And I type in my email address
    And click on create an account and fill up Personal details
    Then I should be registered successfully
