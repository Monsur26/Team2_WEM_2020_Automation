package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SelectProductTest extends WebAPI {


    static HomePage homePage; // Reference Variable/ object of HomePage

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, home.HomePage.class);
    }

    @Test
    public void testAmazonProductSearch() throws InterruptedException {
        getInitElements();
        homePage.selectProduct();
    }
}
