Feature: Clicking on social media logos in footer
  Background:
    Given I am looking at the bottom of a page

  Scenario Outline: Navigate to a social media page
    When I click on the "<logo_icon>" logo
    Then I should go to "<social_media_page>"
    Then I go back to the products page tab

    Examples:
      |    logo_icon          |      social_media_page     |
      |    social_twitter     |      twitter.com           |
      |    social_facebook    |      facebook.com          |
      |    social_linkedin    |      linkedin.com          |