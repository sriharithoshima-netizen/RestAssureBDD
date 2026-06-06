
  Feature:Login functionality
    Scenario: Logged successfully
      Given User opens the application
      When User enters username as "admin"
      And User enters password as "admin"
      And User clicks Ok button
      Then User should be navigated to the application home page