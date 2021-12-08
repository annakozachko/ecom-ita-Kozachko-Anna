package steps;

import enums.elements.LoginPageInputField;
import enums.table.TableField;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import java.util.Map;
//@Log4j
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

    @And("I enter in the enum field {} data {string} on Login page")
    public void iEnterInTheFieldPasswordDataOnLoginPage(LoginPageInputField field, String data) {
        loginPage.inputDataToInputEnumField(field, data);
    }

    @And("I enter text into field on Login Page:")
    public void iEnterTextIntoFieldOnLoginPage(DataTable table) {
        for (Map<String, String> row : table.asMaps()) {
            String data = row.get(TableField.INPUT_DATA.toString());
            String field = row.get(TableField.FIELD_NAME.toString());
            loginPage.inputDataToInputField(field, data);
        }
    }

//    @And("I click {string} button on Login page")
//    public void iClickLoginButtonOnLoginPage() {
//        loginPage.clickSubmitButton();
//    }

    @Then("My Account page is displayed")
    public void myAccountPageIsDisplayed() {
    }

    @And("I click Login button on Login page")
    public void iClickLoginButtonOnLoginPage() {
        loginPage.clickSubmitButton();
    }

    @Given("User is logged in on Login Page")
    public void userIsLoggedInOnLoginPage() {
//        loginPage.headerComponent().clickAccountDropdown();
//        log.info("Account dropdown is opening");
//        loginPage.headerComponent().clickLoginFromDropdown();
//        log.info("Login page is opening");
//
//        String email = PropertyLoader.getProperty("USER_EMAIL");
//        String password = PropertyLoader.getProperty("USER_PASSWORD");
//
//        log.info(String.format("Entering email %s", email));
//
//        loginPage.inputDataToInputField(LoginPageInputField.EMAIL_INPUT_FIELD.toString(), email);
//        log.info(String.format("Entering password %s", password));
//        loginPage.inputDataToInputField(LoginPageInputField.PASSWORD_INPUT_FIELD.toString(), password);
//        log.info("Click submit button");
//        loginPage.clickSubmitButton();
    }
}
