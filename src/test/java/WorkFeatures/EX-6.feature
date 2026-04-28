Feature: login feature with Scenario outline

  Scenario Outline: S8-login to application
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

  Scenario: S9-login to application
    Given  user in at signup page
    When user enter "mahesh babu" inside form
    And user enter age as 56
    And user confirm gender as "Male"
    Then user gets created