Feature: login to application

  Scenario: s1-login with valid data
    Given open browser
    When user enter username
    And user enter password
    And user click on login button
    Then home page should be visible
