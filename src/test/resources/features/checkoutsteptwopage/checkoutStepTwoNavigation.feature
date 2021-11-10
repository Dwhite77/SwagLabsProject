@tag(checkout_step_two_navigation)
Feature: Navigation checkout: Overview page

  Scenario: Placing an order
  Given I am on the checkout: overview page
  When I am happy with the order information
  And I click the finish link
  Then I go to the order completion page

  Scenario: Canceling an checkout process
  Given I am on the checkout: overview
  When I click the cancel link
  Then I go back to the product page

  Scenario: Navigating from checkout: overview page to the item product information page
  Given I am on the basket page
  When I click the item link
  Then I go to the correct item page