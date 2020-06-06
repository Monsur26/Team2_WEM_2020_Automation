package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ProductAddToCart extends WebAPI {
    //disposable hand gloves search, select and add in cart


    static HomePage homePage; // Reference Variable/ object of HomePage

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, home.HomePage.class);
    }

    @Test
    public void testAmazonProductAddToCart() throws InterruptedException {
        getInitElements();
        homePage.ProductAddedToCart();
    }


}
