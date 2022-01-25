Feature: Test add to cart functionality
  @regression

  Scenario: Only Registered User can complete purchase

    Given I am on homepage
    When I hover around Women category
    And click on Summer Dresses
    Then click on Add to Cart
    And Proceed to checkout
    And click again on proceed to checkout
    Then I should be asked to log in




