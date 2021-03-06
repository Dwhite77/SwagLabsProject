Feature: Resetting the app state

  Background: User accesses the nav bar
    Given : The user is logged in with one item in the basket

  Scenario: The user wants to reset the app state
    When : The user clicks on the reset app state button
    Then : The basket will be empty