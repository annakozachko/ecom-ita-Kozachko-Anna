package steps;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.MacBookPage;

public class MacBookStepdefs {
    private static final MacBookPage macBookPage = new MacBookPage();

    @Then("My Page of MacBook is displayed")
    public void PageOfMacBookIsDisplayed() {
        Assertions.assertThat(macBookPage.isMacBookVisible()).isEqualTo(true);
    }

}
