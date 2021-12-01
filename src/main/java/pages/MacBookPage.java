package pages;

import org.openqa.selenium.By;

public class MacBookPage extends BasePage{
    private static final String MACBOOK_INFORMATION = "//ul[@class='breadcrumb']//a[text()='MacBook']";

    public boolean isMacBookVisible() {
        return findElementBy(By.xpath(MACBOOK_INFORMATION)).isDisplayed();
    }
}
