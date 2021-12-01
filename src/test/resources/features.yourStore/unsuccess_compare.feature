Feature: As an unregistered user
  I want to add product to Compare some Product
  So that I can buy some product

  Scenario: [ENUM] Unsuccessful message is displayed after unsuccessful adding to compare some product
    Given Your Store Page is displayed
    When I click on the button Compare this  Product
    Then Unsuccessful message 'You have added MacBook to your product comparison!' is displayed under header