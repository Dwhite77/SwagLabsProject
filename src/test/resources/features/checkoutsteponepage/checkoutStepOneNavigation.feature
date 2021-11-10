Feature: Navigation on checkout:Your Information

  Scenario: Navigating to checkout: overview
  Given I am on the checkout: your information page
  When I enter all the valid information
  And I click the continue link
  Then I go to the checkout: overview page

  Scenario: Navigating back to basket page
  Given I am on the checkout: your information page
  When I click the cancel link
  Then I go back to the basket page