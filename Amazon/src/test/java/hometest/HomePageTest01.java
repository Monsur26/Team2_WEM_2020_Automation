package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest01 extends WebAPI {

   static HomePage homePage; // Reference Variable/ object of HomePage
//
//
  public static void getInitElements(){
   homePage= PageFactory.initElements(driver, HomePage.class);
   }


   @Test
   public void testGetTitle(){
      getTitle();

   }

//
//
//    @Test
//    public void testSearchProduct() throws InterruptedException {
//        getInitElements();
//        homePage.searchProduct();
//    }

//    public static void main(String[] args) throws InterruptedException {
//        // Setting the Browser driver properties
//        System.setProperty("webdriver.chrome.driver", "BrowserDriver\\windows\\chromedriver.exe");
//        // creating a object of Chrome Driver class
//        WebDriver driver = new ChromeDriver();
//        //Open the Chrome browser and Nevigate to amazon url
//        driver.navigate().to("http:/www.amazon.com");
//        // Maximize the window size.
//        driver.manage().window().maximize();
//        // wait for 3 seconds
//        Thread.sleep(3000);
//        //Click on menu bar to expand it
//        driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();
//
//    }

}
