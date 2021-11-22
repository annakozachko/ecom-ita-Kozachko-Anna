package pages;

import org.openqa.selenium.By;

public class HeaderComponent extends AbstractBasePage {


    private static final String CURRENCY = "//span[contains(text(), 'Currency')]";
    private static final String YOUR_STORE_DROPDOWN_BUTTON = "//button[text()='%s']";

    private static final String MY_TELEPHONE_BUTTON = "//ul[@class='list-inline']//span";
    private static final String HEADER_BUTTON = "//span[contains(text()='%s']";

    private static final String REGISTER_DROPDOWN_BUTTON = "//li[contains(@class, 'dropdown')]//following::a[text()='Register']";

    private static final String MY_ACCOUNT_BUTTON = "//span[contains(text(), 'Account')]";
    private static final String LOGIN_DROPDOWN_BUTTON = "//li[contains(@class, 'dropdown')]//following::a[text()='Login']";
    private static final String EMAIL_INPUT_FIELD = "input-email";
    private static final String PASSWORD_INPUT_FIELD = "password";
    private static final String SUBMIT_LOGIN_BUTTON = "//input[@type='submit']";
    private static final String LOGIN_ERROR_ALERT = "//div[contains(@class, 'alert')]";
    private static final String YOUR_STORE_TITLE = "//a[text()='Your Store']";


    public void clickCurrencyDropdown() {
        findElementBy(By.xpath(CURRENCY)).click();
    }

    public void choiceEuroCurrency() {
        findElementBy(By.xpath(YOUR_STORE_DROPDOWN_BUTTON)).click();
    }

    public void choicePoundSterlingCurrency() {
        findElementBy(By.xpath(YOUR_STORE_DROPDOWN_BUTTON)).click();
    }

    public void choiceUSDollarCurrency() {
        findElementBy(By.xpath(YOUR_STORE_DROPDOWN_BUTTON)).click();
    }

    public void clickTelephoneButton() {
        findElementBy(By.xpath(MY_TELEPHONE_BUTTON)).click();
    }

    public void clickWishListButton() {
        findElementBy(By.xpath(HEADER_BUTTON)).click();
    }

    public void clickShoppingCartButton() {
        findElementBy(By.xpath(HEADER_BUTTON)).click();
    }

    public void clickCheckoutButton() {
        findElementBy(By.xpath(HEADER_BUTTON)).click();
    }

    public void clickRegisterFromDropdown() {
        findElementBy(By.xpath(REGISTER_DROPDOWN_BUTTON)).click();
    }

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
}
