Feature: Navigation on basket page

  Scenario: Navigating from basket page to checkout page
  Given I am on the basket page
  When I click the checkout link
  Then I go to the checkout page

  Scenario: Navigating from basket page to the shop page
  Given I am on the basket page
  When I click the continue shopping link
  Then I go back to the products page

  Scenario: Navigating from basket page to item product information page
  Given I am on the basket page
  When I click the item link
  Then I go to the correct item page