Feature: login feature with Scenario outline

  Scenario Outline: S7-login to application
    Given user in at signup page
    When user enter "<Name>" inside form
    And user enter age as <Age>
    And user confirm gender as "<Gender>"
    Then user gets created

    Examples:
    | Name | Age | Gender |
    | Amol| 20   |  Male  |
    | sham| 12   |  Male  |
    | ram | 45   |  Male  |
    | mona| 63   | Female |
