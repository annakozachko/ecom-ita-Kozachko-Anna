Feature: As an unregistered user
  I want to add product to Wish List
  So that I can buy some product

  Scenario: [ENUM] Unsuccessful message is displayed after unsuccessful adding to wish list
    Given Your Store Page is displayed
    When I click on the button Add to Wish List
    Then Unsuccessful message 'You must login or create an account to save MacBook to your wish list!' is displayed under header

