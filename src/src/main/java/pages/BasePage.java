package pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

@Getter
@Accessors(fluent = true)
public class BasePage extends AbstractBasePage{
    @Getter
    @Accessors(fluent = true)
    protected HeaderComponent headerComponent = new HeaderComponent();





}
