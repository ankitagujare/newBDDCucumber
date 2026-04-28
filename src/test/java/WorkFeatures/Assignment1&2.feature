Feature: add to cart then remove button validation

  Background:
    Given user is on Swag lab login
    When user enter username on swaglab login page "standard_user"
    And user enter password on swaglab login page "secret_sauce"
    And wait for 3 seconds
    And user click on login btn on swaglab login page

  Scenario: verify remove button should be visible ass1
    When user click on Add to card for Backpack product
    And wait for 3 seconds
    Then Remove button is visible as "Remove"


  Scenario: verify Sauce Labs Bike Light add to cart ass2

    When user click on Add to card for Sauce Labs Bike Light
    When user click on cart button
    And wait for 3 seconds
    And user can see Sauce Labs Bike Light price 9.99
