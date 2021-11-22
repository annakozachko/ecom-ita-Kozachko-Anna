package steps;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.YourStorePage;
import tests.YourStoreTest;


public class StorePageStepdefs {
    private static final YourStorePage yourStorePage = new YourStorePage();

    @Then("Store Page is displayed")
    public void storePageIsDisplayed() {
        Assertions.assertThat(yourStorePage.isYourAccountInformationDisplayed()).isEqualTo(true);
    }
}
