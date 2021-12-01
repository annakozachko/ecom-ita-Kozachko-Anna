package pages;

import org.openqa.selenium.By;

public class YourStorePage extends BasePage {

    private static final String YOUR_STORE_PAGE_LINK = "//a[starts-with(text(),'%s')]";
    private static final String MY_ACCOUNT_INFORMATION = "//h2[text()='My Account']";
    private static final String YOUR_STORE_LINK = "//a[text()='Your Store']";
    //recommended products
    private static final String MAC_BOOK = "//div[@class='caption']//a[text()='MacBook']";
    private static final String iPHONE = "//div[@class='caption']//a[text()='iPhone']";
    private static final String APPLE_CINEMA_30 = "//div[@class='caption']//a[text()='Apple Cinema 30\"']";
    private static final String CANON_EOS_5D = "//div[@class='caption']//a[text()='Canon EOS 5D']";
    private static final String ADD_TO_CART = "//h3[text()='Featured']//following::button[1] ";//span[text()='Add to Cart']";
    private static final String ADD_TO_WISH_LIST = "//div[@class ='row']//div[contains(@class, 'product-layout')][1]//div[@class='button-group']//button[contains(@onclick, 'wishlist')]";
    private static final String COMPARE_THIS_PRODUCT = "//i[@class='fa fa-exchange']";

    private static final String BUTTON_ITEMS = "//button[contains(@class,'btn btn-inverse')]";

    private static final String SUCCESS_MESSAGE_ADD_TO_CART = "//div[@class='alert alert-success alert-dismissible']";
    private static final String UNSUCCESSFUL_MESSAGE_ADD_TO_WISH_LIST = "//div[@class='alert alert-success alert-dismissible']/i";


    void clickEditYourAccountLink(String field) {
        findElementBy(By.xpath(String.format(YOUR_STORE_PAGE_LINK, field))).click();
    }

    public Boolean isYourAccountInformationDisplayed() {
        return findElementBy(By.xpath(MY_ACCOUNT_INFORMATION)).isDisplayed();
    }

    public void clickEditAccount() {
    }

    public void clickMacBook() {
        findElementBy(By.xpath(MAC_BOOK)).click();
    }

    public void clickIPhone() {
        findElementBy(By.xpath(iPHONE)).click();
    }

    public void clickAppleCinema() {
        findElementBy(By.xpath(APPLE_CINEMA_30)).click();
    }

    public void clickCanonEos5D() {
        findElementBy(By.xpath(CANON_EOS_5D)).click();
    }

    public void clickAddToCart() {
        findElementBy(By.xpath(ADD_TO_CART)).click();
    }

    public void clickAddToWishList() {
        findElementBy(By.xpath(ADD_TO_WISH_LIST)).click();
    }

    public void clickCompareThisProduct() {
        findElementBy(By.xpath(COMPARE_THIS_PRODUCT)).click();
    }

    public Boolean isYourButtonItemsHasANewProduct() {
        return findElementBy(By.xpath(BUTTON_ITEMS)).isDisplayed();
    }

    public Boolean isSuccessMassageAddToCartIsDisplayed() {
        return findElementBy(By.xpath(SUCCESS_MESSAGE_ADD_TO_CART)).isDisplayed();
    }

    public String getSuccessMassageAddToCart() {
        return findElementBy(By.xpath(SUCCESS_MESSAGE_ADD_TO_CART)).getText();
    }

    public void clickYourStoreLink() {
        findElementBy(By.xpath(YOUR_STORE_LINK)).click();
    }

    public Boolean isYourStoreLinkDisplayed() {
        return findElementBy(By.xpath(YOUR_STORE_LINK)).isDisplayed();
    }
    public String getSuccessMassageAddToWishList(){
        return findElementBy(By.xpath(UNSUCCESSFUL_MESSAGE_ADD_TO_WISH_LIST)).getText();
    }
    public Boolean isUnSuccessMassageAddToWishListIsDisplayed(){
        return findElementBy(By.xpath(UNSUCCESSFUL_MESSAGE_ADD_TO_WISH_LIST)).isDisplayed();
    }
    public String getSuccessMassageCompareThisProduct(){
        return findElementBy(By.xpath(UNSUCCESSFUL_MESSAGE_ADD_TO_WISH_LIST)).getText();
    }

}
