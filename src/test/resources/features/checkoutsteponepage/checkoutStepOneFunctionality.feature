@tag(checkout_info_functionality)
Feature: Checkout:Your Information page functionality
  @tag(input_valid_information)
  Scenario: I enter valid information into all the specified fields
  Given I am on the checkout: your information page
  When I enter valid information
  And I click the continue link
  Then I am able to proceed

  @tag(input_invalid_first_name)
  Scenario: I enter invalid information
  Given I am on the checkout: your information page
  When I enter an invalid first name
  And I click the continue link
  Then an error message appears

    @tag(input_invalid_last_name)
  Scenario: I enter invalid information
  Given I am on the checkout: your information page
  When I enter an invalid last name
  And I click the continue link
  Then an error message appears

      @tag(input_invalid_zip_code)
  Scenario: I enter invalid information
  Given I am on the checkout: your information page
  When I enter an invalid zip code
  And I click the continue link
  Then an error message appears