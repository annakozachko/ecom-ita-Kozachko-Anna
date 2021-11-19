package tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.YourStorePage;

public class YourStoreTest extends BaseTest{
    private YourStorePage yourStorePage;

    @Test
    void AllertMyAccountInformation(){
        yourStorePage = new YourStorePage();
        yourStorePage.clickEditAccount();
        Assertions.assertThat(yourStorePage.isYourAccountInformationDisplayed()).isEqualTo(true);
    }
}
