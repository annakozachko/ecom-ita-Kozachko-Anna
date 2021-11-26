package pages;

import org.openqa.selenium.By;

public class HeaderPage extends AbstractBasePage{
    private static final String HEADER_DROPDOWN_BUTTON = "//div[contains(@class,'collapse navbar')]//a[text()='%s']";

    public void clickHeaderDropdownButton(){
        findElementBy(By.xpath(HEADER_DROPDOWN_BUTTON)).click();
    }
}
