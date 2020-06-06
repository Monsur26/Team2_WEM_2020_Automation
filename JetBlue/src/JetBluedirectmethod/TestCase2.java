package JetBluedirectmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {
    public static void main(String[] args) throws InterruptedException {

        //Setting the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver/windows/geckodriver.exe");
        //creating an object of Firefox driver
        WebDriver driver = new FirefoxDriver();
        //open the JetBlue webpage
        driver.get("https://www.jetblue.com");
        Thread.sleep(5000);
        //open the selected linkpage
        driver.findElement(By.cssSelector("body > jb-app > jb-header > jb-header-desktop > div.pa0.h-2-5.header-util-nav.ng-star-inserted > div > ul > li:nth-child(1) > a" )).click();
    }
}
