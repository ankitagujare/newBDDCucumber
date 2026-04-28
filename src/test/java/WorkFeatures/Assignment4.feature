Feature: login verify logo and logout feature

  Background:
    Given user is on Swag lab login
    When user enter username on swaglab login page "standard_user"
    And wait for 3 seconds
    And user enter password on swaglab login page "secret_sauce"
    And wait for 3 seconds
    And user click on login btn on swaglab login page

  Scenario: verify App Logo & Logout

    When home page visible with logo text "Swag Labs"
    And wait for 2 seconds
    And  user click on main menu
    And wait for 2 seconds
    Then user click on Logout
