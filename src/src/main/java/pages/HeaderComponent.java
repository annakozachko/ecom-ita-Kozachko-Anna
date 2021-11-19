package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.ref.PhantomReference;

public class HeaderComponent extends AbstractBasePage{


    private static final String CURRENCY = "//span[contains(text(), 'Currency')]";
    private static final String EURO_DROPDOWN_BUTTON = "//button[text()='€ Euro']";
    private static final String POUND_STERLING_DROPDOWN_BUTTON = "//button[text()='£ Pound Sterling']";
    private static final String US_DOLLAR_DROPDOWN_BUTTON = "//button[text()='$ US Dollar']";

    private static final String MY_TELEPHONE_BUTTON ="//span[contains(text(), '123456789')]";
    private static final String WISH_lIST = "//span[contains(text(), 'Wish List (0)')]";
    private static final String SHOPPING_CART = "//span[contains(text(), 'Shopping Cart')]";
    private static final String CHECKOUT = "//span[contains(text(), 'Checkout')]";

    private static final String REGISTER_DROPDOWN_BUTTON = "//li[contains(@class, 'dropdown')]//following::a[text()='Register']";

    private static final String MY_ACCOUNT_BUTTON = "//span[contains(text(), 'Account')]";
    private static final String LOGIN_DROPDOWN_BUTTON = "//li[contains(@class, 'dropdown')]//following::a[text()='Login']";
    private static final String EMAIL_INPUT_FIELD = "input-email";
    private static final String PASSWORD_INPUT_FIELD = "password";
    private static final String SUBMIT_LOGIN_BUTTON = "//input[@type='submit']";
    private static final String LOGIN_ERROR_ALLERT = "//div[contains(@class, 'alert')]";
    private static final String YOUR_STORE_TITLE = "//a[text()='Your Store']";


    public void clickCurrencyDropdown(){findElementBy(By.xpath(CURRENCY)).click();}
    public void choiceEuroCurrency(){findElementBy(By.xpath(EURO_DROPDOWN_BUTTON)).click();}
    public void choicePoundSterlingCurrency(){findElementBy(By.xpath(POUND_STERLING_DROPDOWN_BUTTON)).click();}
    public void choiceUSDollarCurrency(){findElementBy(By.xpath(US_DOLLAR_DROPDOWN_BUTTON)).click();}
    public void clickTelephoneButton(){findElementBy(By.xpath(MY_TELEPHONE_BUTTON)).click();}
    public void clickWishListButton(){findElementBy(By.xpath(WISH_lIST)).click();}
    public void clickShoppingCartButton(){findElementBy(By.xpath(SHOPPING_CART)).click();}
    public void clickCheckoutButton(){findElementBy(By.xpath(CHECKOUT)).click();}

    public void clickRegisterFromDropdown() {
        findElementBy(By.xpath(REGISTER_DROPDOWN_BUTTON)).click();
    }

    public void clickAccountDropdown(){findElementBy(By.xpath(MY_ACCOUNT_BUTTON)).click();}
    public void clickLoginFromDropdown(){findElementBy(By.xpath(LOGIN_DROPDOWN_BUTTON)).click();}
    public void inputEmailToEmailField(String email){findElementBy(By.id(EMAIL_INPUT_FIELD)).sendKeys();}
    public void inputPasswordToPasswordField(String password){findElementBy(By.name(PASSWORD_INPUT_FIELD)).sendKeys(password);}
    public void clickSubmitButton(){findElementBy(By.xpath(SUBMIT_LOGIN_BUTTON)).click();}
    public String getLoginErrorActualMessage(){return findElementBy(By.xpath(LOGIN_ERROR_ALLERT)).getText();}
    public Boolean isYourStoreTitleDisplayed(){return findElementBy(By.xpath(YOUR_STORE_TITLE)).isDisplayed();}
}
