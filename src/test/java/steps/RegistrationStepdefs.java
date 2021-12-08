package steps;

import enums.elements.RegistrationPageInputField;
import enums.table.TableField;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.RegistrationPage;

import java.util.Map;


public class RegistrationStepdefs {
    private static final RegistrationPage registrationPage = new RegistrationPage();
    private static final String checkboxIsNotFilledExpectedMessage  = "Warning: You must agree to the Privacy Policy!";

    @Given("Registration page is opened in header dropdown")
    public void registrationPageIsOpenedInHeaderDropdown() {
        registrationPage.headerComponent().clickAccountDropdown();
        registrationPage.headerComponent().clickRegisterFromDropdown();
    }

    @When("I enter in the field {string} data {string} on Registration page")
    public void iEnterDataInTheFieldOnRegistrationPage(String field, String data) {
        registrationPage.inputDataToRegistrationField(field, data);
    }

    @And("I click agree with Privacy Policy")
    public void iClickAgreeWithPrivacyPolicy() {
        registrationPage.clickPrivacyPolicyCheckbox();
    }

    @And("I click button Continue")
    public void iClickButtonContinue() {
        registrationPage.clickButtonContinue();
    }

    @And("I click button Continue after Registration")
    public void iClickButtonContinueAfterRegistration() {
        registrationPage.clickButtonContinueAfterRegistration();
    }


    @Then("Message {string} is displayed above Register Account")
    public void messageYouMustAgreeToThePrivacyPolicyIsDisplayedAboveRegisterAccount(String message) {
        String checkboxIsNotActualMessage = registrationPage.getCheckboxIsNotFilledActualMessage();
        Assertions.assertThat(message).as(String.format("Expected: %s, Actual: %s", message, checkboxIsNotActualMessage)).isEqualTo(checkboxIsNotActualMessage);
      //  registrationPage.implicitlyWait();
      //  Assertions.assertThat(checkboxIsNotActualMessage).as(String.format("Expected: %s, Actual: %s", message, checkboxIsNotActualMessage)).contains(message);


    }


    @Then("Message {string}is displayed under the empty email field")
    public void messageEMailAddressDoesNotAppearToBeValidIsDisplayedUnderTheEmptyEmailField(String message) {
        String  emailDoesNotAppearMessage = registrationPage.getEmailDoesNotAppearMessage();
        Assertions.assertThat(message).as(String.format("Expected: %s, Actual: %s", message, emailDoesNotAppearMessage)).isEqualTo(emailDoesNotAppearMessage);
    }

    @Then("Message {string} is displayed under the empty telephone field")
    public void messageTelephoneMustBeBetweenAndCharactersIsDisplayedUnderTheEmptyTelephoneField(String message) {
        String telephoneDoesNotAppearMessage = registrationPage.getTelephoneDoesNotAppearMessage();
        Assertions.assertThat(message).as(String.format("Expected: %s, Actual: %s", message, telephoneDoesNotAppearMessage)).isEqualTo(telephoneDoesNotAppearMessage);
    }

    @And("I click radiobutton Yes in the field Subscribe")
    public void iClickRadiobuttonYesInTheFieldSubscribe() {
        registrationPage.clickSubmitButtonYes();
    }

    @When("I enter text into field on Registration Page:")
    public void iEnterTextIntoFieldOnRegistrationPage(DataTable table) {
        for (Map<String, String> row : table.asMaps()) {
            String data = row.get(TableField.INPUT_DATA.toString());
            String field = row.get(TableField.FIELD_NAME.toString());
            registrationPage.inputDataToInputField(field, data);
        }
    }

    @When("I enter in the enum field {} data {string} on Registration page")
    public void iEnterInTheEnumFieldFIRST_NAME_FIELDDataAnnaOnRegistrationPage(RegistrationPageInputField field, String data) {
        registrationPage.inputDataToInputEnumField(field, data);
    }
}