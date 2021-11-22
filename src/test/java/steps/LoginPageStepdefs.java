package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepdefs {
    private static final LoginPage loginPage = new LoginPage();


    @Given("Login page is opened in header dropdown")
    public void loginPageIsOpenedInHeaderDropdown() {
        loginPage.headerComponent().clickAccountDropdown();
        loginPage.headerComponent().clickLoginFromDropdown();

    }

    @When("I enter email {string} on Login page")
    public void iEnterEmailAnnaKozachkoGmailComOnLoginPage(String email) {
        loginPage.inputEmailToEmailField(email);
    }

    @And("I enter password {string} on Login page")
    public void iEnterPasswordOnLoginPage(String password) {
        loginPage.inputPasswordToPasswordField(password);
    }

    @And("I click the button Login on Login page")
    public void iClickTheButtonLoginOnLoginPage() {
        loginPage.clickSubmitButton();
    }
}
