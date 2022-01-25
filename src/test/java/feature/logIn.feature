Feature: test Log In Functionalities
  Background:
    Given User am on homepage
    When User clicks on Sign in

  @regression
  # Scenario: Successful log in

  Scenario Outline: Login with valid and invalid credentials
    And User enters "<username>" and "<password>"
    And User clicks on Sign in Button
    Then User should receive "<status>" accordingly
    Examples:
      | username         | password | status  |
      | xyz@hotmail.com  |          | Password is required. |
      |                  |          | An email address required.|
      |                  | 123456   | An email address required. |
      | xyz@hotmail1.com | 123456   | Authentication failed. |
#      | xyz@hotmail.com  | 123456   | valid   |



