Feature: Clicking on product should open the expanded product page
  Background:
    Given I am on the products page

  Scenario Outline: Navigating to the product info page via name tag
    When I click on the product "<product_id>" name tag
    Then I will go to the products info page for "<url_id>"
    Then Go back to products page

    Examples:
      |product_id | url_id|
      |   2       |   2   |
      |   1       |   1   |
      |   3       |   3   |
      |   0       |   0   |
      |   4       |   4   |
      |   5       |   5   |

  Scenario Outline: Navigating to the product info page via image
    When I click on the image for product "<product_id>"
    Then I will go to the products info page for "<url_id>"
    Then Go back to products page

    Examples:
      |product_id | url_id|
      |   2       |   2   |
      |   1       |   1   |
      |   3       |   3   |
      |   0       |   0   |
      |   4       |   4   |
      |   5       |   5   |