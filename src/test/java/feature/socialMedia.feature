Feature: Test social media connections
  @regression

  Scenario: As a User I should be able to connect to social media pages when I click on Icons

    Given user is on homepage
    When user clicks on Facebook icon
    Then user should be navigated to facebook page
    And user should click on login button