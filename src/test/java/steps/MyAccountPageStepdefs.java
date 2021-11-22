package steps;

import io.cucumber.java.en.Then;
import pages.MyAccountPage;

public class MyAccountPageStepdefs {
    private static final MyAccountPage myAccountPage = new MyAccountPage();

    @Then("My Account Page is displayed")
    public void myAccountPageIsDisplayed() {
    }
}
