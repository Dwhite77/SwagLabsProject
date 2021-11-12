Feature: Ability to login

  Background: Starting from the login page
    Given I am on the login page

  Scenario: Standard user tries to login
    When  Standard user enters the correct username and password
    Then  The user will be redirected to the product page

  Scenario: Locked out user tries to login
    When  Locked out user  enters the correct username and password
    Then  The user will be shown a message that they are locked out

  Scenario: Problem user tries to login
    When  Problem user enters the correct username and password
    Then  The user will be redirected to the product page

  Scenario: Performance glitch user tries to login
    When  Performance glitch user enters the correct username and password
    Then  The user will be redirected to the product page

  Scenario: User enters an incorrect username or password
    When  User enters the incorrect username or password
    Then  The user will be displayed an error message

  Scenario: User enters no username
    When  User enters no username
    Then  The user will be displayed a username error message

  Scenario: User enters no password
    When  User enters no password
    Then  The user will be displayed a password error message

  Scenario: user session should timeout after a while
    Given I am on the products page
    When cookie has expired
    Then user should be logged out
    And a reason should be displayed