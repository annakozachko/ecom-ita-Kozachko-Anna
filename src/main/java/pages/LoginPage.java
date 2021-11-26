package pages;

import enums.elements.LoginPageInputField;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static final String MY_ACCOUNT_BUTTON = "//span[contains(text(), 'Account')]";
    private static final String LOGIN_DROPDOWN_BUTTON = "//li[contains(@class, 'dropdown')]//following::a[text()='Login']";
    private static final String EMAIL_INPUT_FIELD = "//input[@name='email']";// "input-email";
    private static final String PASSWORD_INPUT_FIELD = "//input[@name='password']";//"password";
    private static final String SUBMIT_LOGIN_BUTTON = "//input[@type='submit']";
    private static final String LOGIN_ERROR_ALERT = "//div[contains(@class, 'alert')]";
    private static final String YOUR_STORE_TITLE = "//a[text()='Your Store']";
    private static final String LOGIN_PAGE_INPUT_FIELD = "//input[@name='%s']";
    public void clickAccountDropdown() {
        findElementBy(By.xpath(MY_ACCOUNT_BUTTON)).click();
    }

    public void clickLoginFromDropdown() {
        findElementBy(By.xpath(LOGIN_DROPDOWN_BUTTON)).click();
    }

    public void inputEmailToEmailField(String email) {
        findElementBy(By.id(EMAIL_INPUT_FIELD)).sendKeys(email);
    }

    public void inputPasswordToPasswordField(String password) {
        findElementBy(By.name(PASSWORD_INPUT_FIELD)).sendKeys(password);
    }

    public void clickSubmitButton() {
        findElementBy(By.xpath(SUBMIT_LOGIN_BUTTON)).click();
    }

    public String getLoginErrorActualMessage() {
        return findElementBy(By.xpath(LOGIN_ERROR_ALERT)).getText();
    }


    public Boolean isYourStoreTitleDisplayed() {
        return findElementBy(By.xpath(YOUR_STORE_TITLE)).isDisplayed();
    }

    public void inputDataToInputEnumField(LoginPageInputField field, String data){
        findElementBy(By.xpath(String.format(LOGIN_PAGE_INPUT_FIELD, field.toString()))).sendKeys(data);
    }
    public void inputDataToInputField(String field, String data){
        findElementBy(By.xpath(String.format(LOGIN_PAGE_INPUT_FIELD, field))).sendKeys(data);
    }

}

