package pages;

import org.openqa.selenium.By;

public class RegistrationPage extends BasePage {

    private static final String MY_ACCOUNT_BUTTON = "//span[contains(text(), 'Account')]";
    private static final String REGISTER_DROPDOWN_BUTTON = "//li[contains(@class, 'dropdown')]//following::a[text()='Register']";

    private static final String REGISTRATION_FIELD = "//input[@name='%s']";

    private static final String SUBSCRIBE_CHOICE_RADIO_BUTTON = "//div[@class='form-group']";
    private static final String SUBMIT_BUTTON = "//label[@class='radio-inline'][2]";
    private static final String PRIVACY_POLICY = "//input[@name='agree']";
    private static final String CONTINUE = "//input[@class='btn btn-primary']";
    private static final String EMAIL_DOES_NOT_APPEAR_MESSAGE = "//div[@class='text-danger']";
    private static final String CHECKBOX_IS_NOT_FILLED_ACTUAL_MESSAGE = "//div[@class='alert alert-danger alert-dismissible']";
    private static final String TELEPHONE_DOES_NOT_APPEAR_MESSAGE = "//div[text()='Telephone must be between 3 and 32 characters!']";
    private static final String YOUR_STORE_TITLE = "//a[text()='Your Store']";

    public void inputDataToRegistrationField(String field, String data) {
        findElementBy(By.xpath(String.format(REGISTRATION_FIELD, field))).sendKeys(data);
    }

    public void clickAccountDropdown() {
        findElementBy(By.xpath(MY_ACCOUNT_BUTTON)).click();
    }

    public void clickPrivacyPolicyCheckbox() {
        findElementBy(By.xpath(PRIVACY_POLICY)).click();
    }

    public void clickSubmitButton() {
        findElementBy(By.xpath(SUBMIT_BUTTON)).click();
    }


    public void clickButtonContinue() {
        findElementBy(By.xpath(CONTINUE)).click();
    }

    public String getEmailDoesNotAppearMessage() {
        return findElementBy(By.xpath(EMAIL_DOES_NOT_APPEAR_MESSAGE)).getText();

    }

    public String getCheckboxIsNotFilledActualMessage() {
        return findElementBy(By.xpath(CHECKBOX_IS_NOT_FILLED_ACTUAL_MESSAGE)).getText();

    }

    public String getTelephoneDoesNotAppearMessage() {
        return findElementBy(By.xpath(TELEPHONE_DOES_NOT_APPEAR_MESSAGE)).getText();

    }

    public Boolean isYourStoreTitleDisplayed() {
        return findElementBy(By.xpath(YOUR_STORE_TITLE)).isDisplayed();
    }


}


