Feature: Ability to logout

  Background: User accesses the nav bar
    Given : The user is logged in

  Scenario: The user wants to log out
    When : The user clicks on the logout button
    Then : The user should be directed to the login page