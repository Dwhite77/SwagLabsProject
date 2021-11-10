@tag(checkout_complete_navigation)
Feature: Navigation on checkout: Complete page

  @tag(go_to_product_page)
  Scenario: Navigating from checkout: complete page to back to products page
  Given I am on the checkout: complete page
  When I click back home link
  Then I go to the product page