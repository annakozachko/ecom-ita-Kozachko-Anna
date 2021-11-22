package pages;

import org.openqa.selenium.By;

public class YourStorePage extends BasePage {

    private static final String YOUR_STORE_PAGE_LINK = "//a[starts-with(text(),'%s')]";
    private static final String MY_ACCOUNT_INFORMATION = "//h2[text()='My Account']";

    void clickEditYourAccountLink(String field) {
        findElementBy(By.xpath(String.format(YOUR_STORE_PAGE_LINK, field))).click();
    }


    public Boolean isYourAccountInformationDisplayed() {
        return findElementBy(By.xpath(MY_ACCOUNT_INFORMATION)).isDisplayed();
    }

}
