package tests;

//import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import pages.BasePage;
import pages.HeaderComponent;
import pages.LoginPage;
import pages.RegistrationPage;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;


    private static final String loginErrorExpectedText = "Warning: No match for E-Mail Address and/or Password.";


    @Test
    void errorAllertValidationOnLoginPage() {
        loginPage= new LoginPage();
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField("test@gmail.com");
        loginPage.inputPasswordToPasswordField("1234");
        loginPage.clickSubmitButton();
        String loginErrorActualMessage = loginPage.getLoginErrorActualMessage();
        //Assertions.assertEquals(loginErrorExpectedText, loginErrorActualMessage);
        Assertions.assertThat(loginErrorActualMessage).as("error message is different")
                .isEqualTo(loginErrorExpectedText);
    }
    @Test
    void errorAllertInvalidPassword(){
        loginPage= new LoginPage();
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
        loginPage.inputPasswordToPasswordField("000000");
        loginPage.clickSubmitButton();

        String passwordErrorActualMessage = loginPage.getLoginErrorActualMessage();
       // Assertions.assertEquals(loginErrorExpectedText, passwordErrorActualMessage);
       Assertions.assertThat(passwordErrorActualMessage).as("error message is different")
               .isEqualTo(loginErrorExpectedText);
    }
    @Test
    void AllertValidLoginAndPassword(){
        loginPage= new LoginPage();
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
        loginPage.inputPasswordToPasswordField("123123");
        loginPage.clickSubmitButton();
        Assertions.assertThat(loginPage.isYourStoreTitleDisplayed()).isEqualTo(true);
    }
    @Test
    void errorAllertEmptyFieldPassword(){
        loginPage= new LoginPage();
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField("sajowi9588@epeva.com");
        loginPage.inputPasswordToPasswordField(" ");
        loginPage.clickSubmitButton();
        Assertions.assertThat(loginPage.isYourStoreTitleDisplayed()).isEqualTo(false);
    }
    @Test
    void errorAllertEmptyFieldEmail(){
        loginPage= new LoginPage();
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField(" ");
        loginPage.inputPasswordToPasswordField("123123");
        loginPage.clickSubmitButton();
        Assertions.assertThat(loginPage.isYourStoreTitleDisplayed()).isEqualTo(false);
    }
    @Test
    void errorAllertEmptyFieldEmailAndFieldPassword(){
        loginPage= new LoginPage();
        loginPage.clickAccountDropdown();
        loginPage.clickLoginFromDropdown();
        loginPage.inputEmailToEmailField(" ");
        loginPage.inputPasswordToPasswordField(" ");
        loginPage.clickSubmitButton();
        Assertions.assertThat(loginPage.isYourStoreTitleDisplayed()).isEqualTo(false);
    }






    }



