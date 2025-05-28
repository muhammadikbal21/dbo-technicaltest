Feature: Register
  Scenario: User success register
    Given user is on signup page
    When input name "Muhammad Ikbal"
    And input email
    And click signup button
    Then user is navigated to account information page
    And input password signup "12345678"
    And input firstname "Muhammad"
    And input lastname "Ikbal"
    And input address "TB. Simatupang"
    And input state "DKI Jakarta"
    And input city "Jakarta Selatan"
    And input zipcode "10010"
    And input phone number "081122334455"
    And click create account button
    Then user success register account