Feature: Display information on checkout: Complete page

  Scenario: I have completed an order
  Given I am on the checkout: overview page
  When I am viewing the page
  Then I should see a thank you message