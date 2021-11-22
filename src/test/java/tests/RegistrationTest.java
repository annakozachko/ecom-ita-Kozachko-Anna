package tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.RegistrationPage;

public class RegistrationTest extends BaseTest {
    private RegistrationPage registrationPage;
    private static final String emailDoesNotAppearExpectedMessage = "E-Mail Address does not appear to be valid!";
    private static final String checkboxIsNotFilledExpectedMessage  = "Warning: You must agree to the Privacy Policy!";
    private static final String telephonelDoesNotAppearExpectedMessage = "Telephone must be between 3 and 32 characters!";

    @Test
    void unsuccessfulRegistrationWithEmptyEmailField() {
        registrationPage = new RegistrationPage();
        registrationPage.headerComponent().clickAccountDropdown();
        registrationPage.headerComponent().clickRegisterFromDropdown();
        registrationPage.inputDataToRegistrationField("firstname", "Anna");
        registrationPage.inputDataToRegistrationField("lastname", "Kozachko");
        registrationPage.inputDataToRegistrationField("telephone", "0503899478");
        registrationPage.inputDataToRegistrationField("password", "12345");
        registrationPage.inputDataToRegistrationField("confirm", "12345");
        registrationPage.clickPrivacyPolicyCheckbox();
        registrationPage.clickSubmitButton();
        registrationPage.clickButtonContinue();
        String emailDoesNotAppearActualMessage = registrationPage.getEmailDoesNotAppearMessage();
        Assertions.assertThat(emailDoesNotAppearExpectedMessage).as("another error message").isEqualTo(emailDoesNotAppearActualMessage);

    }
    @Test
    void successfulRegistration(){
        registrationPage = new RegistrationPage();
        registrationPage.headerComponent().clickAccountDropdown();
        registrationPage.headerComponent().clickRegisterFromDropdown();
        registrationPage.inputDataToRegistrationField("firstname", "Anna");
        registrationPage.inputDataToRegistrationField("lastname", "Kozachko");
        registrationPage.inputDataToRegistrationField("email", "anna.kozachko@gmail.com");
        registrationPage.inputDataToRegistrationField("telephone", "0503899478");
        registrationPage.inputDataToRegistrationField("password", "12345");
        registrationPage.inputDataToRegistrationField("confirm", "12345");
        registrationPage.clickPrivacyPolicyCheckbox();
        registrationPage.clickSubmitButton();
        registrationPage.clickButtonContinue();
        Assertions.assertThat(registrationPage.isYourStoreTitleDisplayed()).isEqualTo(true);
    }
    @Test
    void unsuccessfulRegistrationWithoutAgreementPrivacyPolicy(){
        registrationPage = new RegistrationPage();
        registrationPage.headerComponent().clickAccountDropdown();
        registrationPage.headerComponent().clickRegisterFromDropdown();
        registrationPage.inputDataToRegistrationField("firstname", "Anna");
        registrationPage.inputDataToRegistrationField("lastname", "Kozachko");
        registrationPage.inputDataToRegistrationField("email", "anna.kozachkog@mail.com");
        registrationPage.inputDataToRegistrationField("telephone", "0503899478");
        registrationPage.inputDataToRegistrationField("password", "12345");
        registrationPage.inputDataToRegistrationField("confirm", "12345");
        registrationPage.clickSubmitButton();
        registrationPage.clickButtonContinue();
        String checkboxIsNotFilledActualMessage = registrationPage.getCheckboxIsNotFilledActualMessage();
        Assertions.assertThat(checkboxIsNotFilledExpectedMessage).as("another error message").isEqualTo(checkboxIsNotFilledActualMessage);

    }
    @Test
    void unsuccessfulRegistrationWithEmptyTelephoneField(){
        registrationPage = new RegistrationPage();
        registrationPage.headerComponent().clickAccountDropdown();
        registrationPage.headerComponent().clickRegisterFromDropdown();
        registrationPage.inputDataToRegistrationField("firstname", "Anna");
        registrationPage.inputDataToRegistrationField("lastname", "Kozachko");
        registrationPage.inputDataToRegistrationField("email", "anna.kozachko@gmail.com");
        registrationPage.inputDataToRegistrationField("password", "12345");
        registrationPage.inputDataToRegistrationField("confirm", "12345");
        registrationPage.clickPrivacyPolicyCheckbox();
        registrationPage.clickSubmitButton();
        registrationPage.clickButtonContinue();
        String telephonelDoesNotAppearActualMessage = registrationPage.getTelephoneDoesNotAppearMessage();
        Assertions.assertThat(telephonelDoesNotAppearExpectedMessage).as("another error message").isEqualTo(telephonelDoesNotAppearActualMessage);

    }

}
