Feature: As an unregistered user
  I want to register in to the system with my credentials
  So that I can have access to store

  Scenario: [PARAMS] Successful registration message is displayed after successful registration
    Given Registration page is opened in header dropdown
    When  I enter in the field 'firstname' data 'Anna' on Registration page
    And  I enter in the field 'lastname' data 'Kozachko' on Registration page
    And  I enter in the field 'email' data 's999ajowi9588@epeva.com' on Registration page
    And  I enter in the field 'telephone' data '0503899478' on Registration page
    And  I enter in the field 'password' data '123123' on Registration page
    #confirm password
    And  I enter in the field 'confirm' data '123123' on Registration page
    And  I click radiobutton Yes in the field Subscribe
    And  I click agree with Privacy Policy
    And  I click button Continue
    And  I click button Continue after Registration
    Then My Account Page is displayed

  Scenario: [PARAMS] Unsuccessful registration message is displayed after unsuccessful registration without email
    Given Registration page is opened in header dropdown
    When  I enter in the field 'firstname' data 'First' on Registration page
    And  I enter in the field 'lastname' data 'First' on Registration page
    And  I enter in the field 'telephone' data '0503899478' on Registration page
    And  I enter in the field 'password' data '123123' on Registration page
      #confirm password
    And  I enter in the field 'confirm' data '123123' on Registration page
    And  I click radiobutton Yes in the field Subscribe
    And  I click agree with Privacy Policy
    And  I click button Continue
    Then Message 'E-Mail Address does not appear to be valid!'is displayed under the empty email field

  Scenario: [PARAMS] Unsuccessful registration message is displayed after unsuccessful registration without agreement Privacy Policy
    Given Registration page is opened in header dropdown
    When  I enter in the field 'firstname' data 'First' on Registration page
    And  I enter in the field 'lastname' data 'First' on Registration page
    And  I enter in the field 'email' data 'iaaa9588@epeva.com' on Registration page
    And  I enter in the field 'telephone' data '0503899478' on Registration page
    And  I enter in the field 'password' data '123123' on Registration page
    #confirm password
    And  I enter in the field 'confirm' data '123123' on Registration page
    And  I click radiobutton Yes in the field Subscribe
    And  I click agree with Privacy Policy
    And  I click button Continue
    Then Message 'You must agree to the Privacy Policy!' is displayed above Register Account

  Scenario: [PARAMS] Unsuccessful registration message is displayed after unsuccessful registration with empty telephone field
    Given Registration page is opened in header dropdown
    When  I enter in the field 'firstname' data 'First' on Registration page
    And  I enter in the field 'lastname' data 'First' on Registration page
    And  I enter in the field 'email' data 'sajow9588@epeva.com' on Registration page
    And  I enter in the field 'password' data '123123' on Registration page
    #confirm password
    And  I enter in the field 'confirm' data '123123' on Registration page
    And  I click radiobutton Yes in the field Subscribe
    And  I click agree with Privacy Policy
    And  I click button Continue
    Then Message 'Telephone must be between 3 and 32 characters!' is displayed under the empty telephone field


  Scenario:[DATA TABLE] Successful registration message is displayed after successful registration
    Given Registration page is opened in header dropdown
    When I enter text into field on Registration Page:
      | inputData            | fieldName |
      | Anna                 | firstname |
      | Kozachko             | lastname  |
      | saowi9588@epeva.com | email     |
      | 0503899478           | telephone |
      | 123123               | password  |
      | 123123               | confirm   |
    And  I click radiobutton Yes in the field Subscribe
    And  I click agree with Privacy Policy
    And  I click button Continue
    And  I click button Continue after Registration
    Then My Account Page is displayed

  Scenario:[DATA TABLE] Unsuccessful registration message is displayed after unsuccessful registration without email
    Given Registration page is opened in header dropdown
    When I enter text into field on Registration Page:
      | inputData            | fieldName |
      | Anna                 | firstname |
      | Kozachko             | lastname  |
      | 0503899478           | telephone |
      | 123123               | password  |
      | 123123               | confirm   |
    And  I click radiobutton Yes in the field Subscribe
    And  I click agree with Privacy Policy
    And  I click button Continue
    Then Message 'E-Mail Address does not appear to be valid!'is displayed under the empty email field

  Scenario: [ENUM] Successful registration message is displayed after successful registration
    Given Registration page is opened in header dropdown
    When  I enter in the enum field FIRST_NAME_FIELD data 'Anna' on Registration page
    And  I enter in the enum field LAST_NAME_FIELD data 'Kozachko' on Registration page
    And  I enter in the enum field EMAIL_FIELD data 'sajovwi9588@epeva.com' on Registration page
    And  I enter in the enum field TELEPHONE_FIELD data '0503899478' on Registration page
    And  I enter in the enum field PASSWORD_FIELD data '123123' on Registration page
    #confirm password
    And  I enter in the enum field CONFIRM_PASSWORD_FIELD data '123123' on Registration page
    And  I click radiobutton Yes in the field Subscribe
    And  I click agree with Privacy Policy
    And  I click button Continue
    And  I click button Continue after Registration
    Then My Account Page is displayed

  Scenario: [ENUM] Unsuccessful registration message is displayed after unsuccessful registration without email
    Given Registration page is opened in header dropdown
    When  I enter in the enum field FIRST_NAME_FIELD data 'Anna' on Registration page
    And  I enter in the enum field LAST_NAME_FIELD data 'Kozachko' on Registration page
    And  I enter in the enum field TELEPHONE_FIELD data '0503899478' on Registration page
    And  I enter in the enum field PASSWORD_FIELD data '123123' on Registration page
    #confirm password
    And  I enter in the enum field CONFIRM_PASSWORD_FIELD data '123123' on Registration page
    And  I click radiobutton Yes in the field Subscribe
    And  I click agree with Privacy Policy
    And  I click button Continue
    Then Message 'E-Mail Address does not appear to be valid!'is displayed under the empty email field

  Scenario: [ENUM] Unsuccessful registration message is displayed after unsuccessful registration without agreement Privacy Policy
    Given Registration page is opened in header dropdown
    When  I enter in the enum field FIRST_NAME_FIELD data 'Anna' on Registration page
    And  I enter in the enum field LAST_NAME_FIELD data 'Kozachko' on Registration page
    And  I enter in the enum field EMAIL_FIELD data 'sajowi9588@epeva.com' on Registration page
    And  I enter in the enum field TELEPHONE_FIELD data '0503899478' on Registration page
    And  I enter in the enum field PASSWORD_FIELD data '123123' on Registration page
    #confirm password
    And  I enter in the enum field CONFIRM_PASSWORD_FIELD data '123123' on Registration page
    And  I click radiobutton Yes in the field Subscribe
    And  I click button Continue
    Then Message 'You must agree to the Privacy Policy!' is displayed above Register Account