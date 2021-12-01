Feature: As an registered user
  I want to add product to shop cart
  So that I can buy this product

#  Scenario: Successful message is displayed after successful adding to cart
#    Given Registration page is opened in header dropdown
#    When  I enter in the enum field FIRST_NAME_FIELD data 'Anna' on Registration page
#    And  I enter in the enum field LAST_NAME_FIELD data 'Kozachko' on Registration page
#    And  I enter in the enum field EMAIL_FIELD data 'rr99r@epeva.com' on Registration page
#    And  I enter in the enum field TELEPHONE_FIELD data '0503899478' on Registration page
#    And  I enter in the enum field PASSWORD_FIELD data '123123' on Registration page
#    #confirm password
#    And  I enter in the enum field CONFIRM_PASSWORD_FIELD data '123123' on Registration page
#    And  I click radiobutton Yes in the field Subscribe
#    And  I click agree with Privacy Policy
#    And  I click button Continue
#    And  I click button Continue after Registration
#    And My Account Page is displayed
#    And I click on Your Store link
#    And I click on the button Add to cart
#    Then Message 'You have added MacBook to your shopping cart!' is displayed under header

  Scenario: [ENUM] Successful message is displayed after successful adding to cart
    Given Login page is opened in header dropdown
    When I enter in the enum field EMAIL_INPUT_FIELD data 'sajowi9588@epeva.com' on Login page
    And I enter in the enum field PASSWORD_INPUT_FIELD data '123123' on Login page
    And I click Login button on Login page
    And My Account page is displayed
    And I click on Your Store link
    And I click on the button Add to cart
    Then Message 'You have added MacBook to your shopping cart!' is displayed under header



  Scenario: [ENUM] Successful opening of the page MacBook
    Given Login page is opened in header dropdown
    When I enter in the enum field EMAIL_INPUT_FIELD data 'sajowi9588@epeva.com' on Login page
    And I enter in the enum field PASSWORD_INPUT_FIELD data '123123' on Login page
    And I click Login button on Login page
    And My Account page is displayed
    And I click on Your Store link
    And I click on the link MacBook
    Then My Page of MacBook is displayed


  Scenario: [ENUM] Successful message is displayed after successful adding to wish list
    Given Login page is opened in header dropdown
    When I enter in the enum field EMAIL_INPUT_FIELD data 'sajowi9588@epeva.com' on Login page
    And I enter in the enum field PASSWORD_INPUT_FIELD data '123123' on Login page
    And I click Login button on Login page
    And My Account page is displayed
    And I click on Your Store link
    And I click on the button Add to Wish List
    Then Message 'You have added MacBook to your wish list!' is displayed under header


  Scenario: [ENUM] Successful message is displayed after successful adding to compare this product
    Given Login page is opened in header dropdown
    When I enter in the enum field EMAIL_INPUT_FIELD data 'sajowi9588@epeva.com' on Login page
    And I enter in the enum field PASSWORD_INPUT_FIELD data '123123' on Login page
    And I click Login button on Login page
    And My Account page is displayed
    And I click on Your Store link
    And I click on the button Compare this Product
    Then Message 'You have added MacBook to your product comparison!' is displayed under header

  Scenario: [DATA TABLE] Successful message is displayed after successful adding to cart
    Given Login page is opened in header dropdown
    When I enter text into field on Login Page:
      | inputData            | fieldName |
      | sajowi9588@epeva.com | email     |
      | 123123               | password  |
    And I click Login button on Login page
    And My Account page is displayed
    And I click on Your Store link
    And I click on the button Add to cart
    Then Message 'You have added MacBook to your shopping cart!' is displayed under header


  Scenario:[DATA TABLE] Successful message is displayed after successful adding to wish list
    Given Login page is opened in header dropdown
    When I enter text into field on Login Page:
      | inputData            | fieldName |
      | sajowi9588@epeva.com | email     |
      | 123123               | password  |
    And  I click Login button on Login page
    And My Account Page is displayed
    And I click on Your Store link
    And I click on the button Add to Wish List
    Then Message 'You have added MacBook to your wish list!' is displayed under header


  Scenario:[DATA TABLE] Successful message is displayed after successful adding to compare this product
    Given Login page is opened in header dropdown
    When I enter text into field on Login Page:
      | inputData            | fieldName |
      | sajowi9588@epeva.com | email     |
      | 123123               | password  |
    And  I click Login button on Login page
    And My Account Page is displayed
    And I click on Your Store link
    And I click on the button Compare this Product
    Then Message 'You have added MacBook to your product comparison!' is displayed under header


