Feature: Success Checkout The Product
  Background:
    Given user is on login page
    When input email "ikbal@gmail.com"
    And input password "12345678"
    And click login button
    Then user is navigated to the home page

  Scenario: User success checkout the product
    When click add to cart button
    And click view cart textbutton
    And click proceed to checkout button
    And click place order button
    And input name card "ikbal"
    And input card number "1234567890"
    And input cvc "111"
    And input month expiration "11"
    And input year expiration "2030"
    And click pay and confirm order button
    Then user success checkout the product