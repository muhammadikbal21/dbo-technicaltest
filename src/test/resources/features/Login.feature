Feature: Login
  Scenario: User success login and direct to homepage
    Given user is on login page
    When input email "ikbal@gmail.com"
    And input password "12345678"
    And click login button
    Then user is navigated to the home page