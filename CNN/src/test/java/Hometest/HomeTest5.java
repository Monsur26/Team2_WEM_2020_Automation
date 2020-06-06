package Hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class HomeTest5 extends WebAPI {
    static HomePage homePage; // Reference Variable/ object of HomePage


    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testVideoLinksButton() throws InterruptedException {
        getInitElements();
        homePage.VideoLinksButton();
    }
}
