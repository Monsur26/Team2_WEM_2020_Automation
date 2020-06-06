package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AmazonProductMenuTest extends WebAPI {
    static HomePage homePage; // Reference Variable/ object of HomePage

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testAmazonProductMenu() throws InterruptedException {
        getInitElements();
        homePage.amazonProductMenu();
    }

}
