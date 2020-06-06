package Amazondirectmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {

        //Setting the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver/windows/geckodriver.exe");
        //creating an object of Firefox driver
        WebDriver driver = new FirefoxDriver();
        //open the amazon web
        driver.get("https://www.amazon.com/");
    }
}
