package hooks;
import driver.DriverInit;
import io.cucumber.java.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
//import org.junit.Before;

public class Hook {
    private WebDriver driver;

    @Before
    public void getDriver() {
        driver = new DriverInit().setDriver();
        BasePage.setDriver(driver);
    }

    @After
    public void quitDriver() {
        if (driver != null)
            BasePage.getDriver().quit();
    }
}
