@tag(checkout_step_two_functionality)
Feature: Checkout: Overview functionality

  Scenario: I am verifying the details order page
    Given I am on the checkout: overview page s2
    When I am viewing the order details
    Then There should be payment information

  Scenario: I am verifying the details order
    Given I am on the checkout: overview page s2
    When I am viewing the order details
    Then There should be shipping information

  Scenario: I am verifying the details order
    Given I am on the checkout: overview page s2
    When I am viewing the order details
    Then There should be correct total cost including tax

  Scenario: I am verifying the details order
    Given I am on the checkout: overview page s2
    When I am viewing the order details
    Then I should see a list of all the selected products from basket