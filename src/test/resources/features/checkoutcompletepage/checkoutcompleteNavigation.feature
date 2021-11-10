Feature: Navigation on checkout: Complete page

  Scenario: Navigating from checkout: complete page to back to products page
  Given I am on the checkout: complete page
  When I click back home link
  Then I go to the product page