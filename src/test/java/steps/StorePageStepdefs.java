package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.YourStorePage;


public class StorePageStepdefs {
    private static final YourStorePage yourStorePage = new YourStorePage();

    @Then("Store Page is displayed")
    public void storePageIsDisplayed() {
        Assertions.assertThat(yourStorePage.isYourAccountInformationDisplayed()).isEqualTo(true);
    }

    @When("I click on the button Add to cart")
    public void iClickOnTheButtonAddToCart() {
        yourStorePage.clickAddToCart();
    }


    @Then("Message {string} is displayed under header")
    public void messageYouHaveAddedMacBookToYourShoppingCartIsDisplayedUnderHeader(String message) {
        String successActualMassageAddToCart = yourStorePage.getSuccessMassageAddToCart();
        Assertions.assertThat(message).as(String.format("Expected: %s, Actual: %s", message, successActualMassageAddToCart)).isEqualTo(successActualMassageAddToCart);
    }

    @And("I click on Your Store link")
    public void iClickOnYourStoreLink() {
        yourStorePage.clickYourStoreLink();
    }

    @And("I click on the button Add to Wish List")
    public void iClickOnTheButtonAddToWishList() {
        yourStorePage.clickAddToWishList();
    }

    @And("I click on the button Compare this Product")
    public void iClickOnTheButtonCompareThisProduct() {
        yourStorePage.clickCompareThisProduct();
    }

    @And("I click on the link MacBook")
    public void iClickOnTheLinkMacBook() {
        yourStorePage.clickMacBook();
    }

    @Given("Your Store Page is displayed")
    public void yourStorePageIsDisplayed() {
        yourStorePage.isYourStoreLinkDisplayed();
    }

    @Then("Unsuccessful message {string} is displayed under header")
    public void unsuccessfulMessageYouMustLoginOrCreateAnAccountToSaveMacBookToYourWishListIsDisplayedUnderHeader(String message) {
        String successActualMassageAddToWishList = yourStorePage.getSuccessMassageAddToWishList();
        Assertions.assertThat(message).as(String.format
                ("Expected: %s, Actual: %s", message, successActualMassageAddToWishList)).isEqualTo(successActualMassageAddToWishList);
        yourStorePage.isUnSuccessMassageAddToWishListIsDisplayed();
    }

    //    @Then("Unsuccessful message {string} is displayed under header")
//    public void unsuccessfulMessageYouHaveAddedMacBookToYourProductComparisonIsDisplayedUnderHeader(String message) {
//        String successActualMassageComparisonThisProduct = yourStorePage.getSuccessMassageCompareThisProduct();
//        Assertions.assertThat(message).as(String.format
//                ("Expected: %s, Actual: %s", message, successActualMassageComparisonThisProduct)).isEqualTo(successActualMassageComparisonThisProduct);
//
//    }
//
    @When("I click on the button Compare this  Product")
    public void iClickOnTheButtonCompareThisProducts() {
        yourStorePage.getSuccessMassageCompareThisProduct();
    }
}

