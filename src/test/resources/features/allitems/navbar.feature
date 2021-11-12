Feature: Ability to access links from the nav bar

  Background Starting from the products page


    Scenario: Accessing the products page
      Given I have opened the nav bar
      When I click on the all items button
      Then I will go to the all items page

    Scenario: Accessing the about page
      Given I have opened the nav bar
      When : I click on the about button
      Then : I will go to the about page



