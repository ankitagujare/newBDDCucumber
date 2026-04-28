Feature: add to cart 3 product and check size of it

  Background:
    Given user is on Swag lab login
    When user enter username on swaglab login page "standard_user"
    And user enter password on swaglab login page "secret_sauce"
    And wait for 3 seconds
    And user click on login btn on swaglab login page

  Scenario: Verify your cart page product size should be 3
    When user click on Add to card for Backpack product
    And wait for 3 seconds
    And user click on Add to card for Sauce Labs Bike Light
    And wait for 2 seconds
    And user click on Add to card for Sauce Labs Bolt T-Shirt
    And wait for 2 seconds
    When user click on cart button
    And wait for 2 seconds
    Then user can see 3 product on cart