
Feature:Login functionality
  Scenario: Logged successfully
    Given User opens the application
    When User enters username as "admin"
    And User enters password as "admin"
    And User clicks Ok button
    Then User should be navigated to the application home page

  Scenario Outline: Logged successfully
    Given User opens the application
    When User enters username as "<username>"
    And User enters password as "<password>"
    And User clicks Ok button
    Then User should be navigated to "<expectedPage>"

    Examples:
      | username | password | expectedPage          |
      | admin    | admin    | application home page |
      | user1    | pass1    | application home page |
      | invalid  | invalid  | login error page      |