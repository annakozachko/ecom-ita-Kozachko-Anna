package steps;

import io.cucumber.java.en.Then;
import pages.MyAccountPage;
import org.assertj.core.api.Assertions;

public class MyAccountPageStepdefs {
    private static final MyAccountPage myAccountPage = new MyAccountPage();

    @Then("My Account Page is displayed")
    public void myAccountPageIsDisplayed() {
        Assertions.assertThat(myAccountPage.isMyAccountHeaderVisible()).isEqualTo(true);
    }
}
