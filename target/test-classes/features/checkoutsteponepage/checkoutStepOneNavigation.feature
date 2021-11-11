@tag(checkout_step_one_navigation)
Feature: Navigation on checkout:Your Information

  @tag(go_to_checkout_overview)
  Scenario: Navigating to checkout: overview
  Given I am on the checkout: your information page
  When I enter all the valid information
  And I click the continue link
  Then I go to the checkout: overview page

  @tag(go_to_basket)
  Scenario: Navigating back to basket page
  Given I am on the checkout: your information page
  When I click the cancel link
  Then user go back to the basket page
