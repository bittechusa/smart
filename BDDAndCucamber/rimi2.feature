Feature: login

  Scenario: login in Facebook
    Given go to facebook
    When put userid
    And put password
    Then i should be logged in
