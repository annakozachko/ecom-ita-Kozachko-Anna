package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage{
    private static final String MY_ACCOUNT_INFORMATION = "//h2[text()='My Account']";

    public Boolean isMyAccountHeaderVisible() {
        return findElementBy(By.xpath(MY_ACCOUNT_INFORMATION)).isDisplayed();
    }
}
