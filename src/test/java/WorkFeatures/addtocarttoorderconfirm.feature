Feature: add to cart to order placed feature

  Background:
     Given user is on Swag lab login
     When user enter username on swaglab login page "standard_user"
     And user enter password on swaglab login page "secret_sauce"
    And wait for 3 seconds
     And user click on login btn on swaglab login page

   Scenario: verify add to card a single product
     When user click on Add to card for Backpack product
     When user click on cart button
     And user can see Backpack price should 29.99
     And wait for 3 seconds
    And use click on checkout button
     And wait for 3 seconds
    And user enter firstname as "komal"
    And user enter lastname as "jennefer"
     And wait for 3 seconds
    And user enter zipcode as "060645"
    And user click on continue button
     And wait for 3 seconds
     And user validate Shipping Information with message "Free Pony Express Delivery!"
     And user validate price total
     And wait for 3 seconds
    And user click on Finish button
     And wait for 3 seconds
    Then order success message should be visible with messgae "Thank you for your order!"


