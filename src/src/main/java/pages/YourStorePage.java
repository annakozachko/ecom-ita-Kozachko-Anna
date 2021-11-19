package pages;

import org.openqa.selenium.By;

public class YourStorePage extends BasePage{
    private static final String MY_ACCOUNT = "//a[@class='list-group-item']";
    private static final String EDIT_ACCOUNT = "//a[@class='list-group-item'][2]";
    private static final String PASSWORD = "//a[@class='list-group-item'][3]";
    private static final String ADDRESS_BOOK = "//a[@class='list-group-item'][4]";
    private static final String WISH_LIST = "//a[@class='list-group-item'][5]";
    private static final String ORDER_HISTORY = "//a[@class='list-group-item'][6]";
    private static final String DOWNLOADS = "//a[@class='list-group-item'][7]";
    private static final String RECURING_PAYMENTS = "//a[@class='list-group-item'][8]";
    private static final String REWARD_POINS = "//a[@class='list-group-item'][9]";
    private static final String RETURNS = "//a[@class='list-group-item'][10]";
    private static final String TRANSACTIONS = "//a[@class='list-group-item'][11]";
    private static final String NEWSLETTER = "//a[@class='list-group-item'][12]";
    private static final String LOGOUT = "//a[@class='list-group-item'][13]";

    private static final String MY_ACCOUNT_INFORMATION = "//div[@id='account-edit']";

    public void clickMyAccount(){
        findElementBy(By.xpath(MY_ACCOUNT)).click();
    }
    public void clickEditAccount(){
        findElementBy(By.xpath(EDIT_ACCOUNT)).click();
    }
    public void clickPassword(){
        findElementBy(By.xpath(PASSWORD)).click();
    }
    public void clickAddressBook(){
        findElementBy(By.xpath(ADDRESS_BOOK)).click();
    }
    public void clickWishList(){
        findElementBy(By.xpath(WISH_LIST)).click();
    }
    public void clickOrderHistory(){
        findElementBy(By.xpath(ORDER_HISTORY)).click();
    }
    public void clickDownloads(){
        findElementBy(By.xpath(DOWNLOADS)).click();
    }
    public void clickRecuringPayments(){
        findElementBy(By.xpath(RECURING_PAYMENTS)).click();
    }
    public void clickRewardPoints(){
        findElementBy(By.xpath(REWARD_POINS)).click();
    }
    public void clickReturns(){
        findElementBy(By.xpath(RETURNS)).click();
    }
    public void clickTransactions(){
        findElementBy(By.xpath(TRANSACTIONS)).click();
    }
    public void clickNewsLetter(){
        findElementBy(By.xpath(NEWSLETTER)).click();
    }
    public void clickLogout(){
        findElementBy(By.xpath(LOGOUT)).click();
    }

    public Boolean isYourAccountInformationDisplayed(){return findElementBy(By.xpath(MY_ACCOUNT_INFORMATION)).isDisplayed();}

}
