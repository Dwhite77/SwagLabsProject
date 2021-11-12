@tag(basket_page_functionality)
Feature: Basket page functionality

  @tag(correct_items)
  Scenario: I have selected items I want buy in the basket
  Given I am on the basket page
  When I view my items
  Then I see the correct items

  @tag(correct_item_removed)
  Scenario: I have items in the basket but i remove an item
  Given I am have items in the basket
  When I remove an item
  Then the correct item is removed
