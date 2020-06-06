package Amazondirectmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase6 {
    //Test case 1: open amazon website in full size and close it after 5 seconds
    public static void main(String[] args) throws InterruptedException {

        //Setting the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver/windows/geckodriver.exe");
        //creating an object of Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        //Make the amazon window in full screen
        driver.manage().window().maximize();
        //wait for 5 seconds before closing
        Thread.sleep(5000);
        String searchBox = "//input[@id=\"twotabsearchtextbox\"]";
        driver.findElement(By.cssSelector("#icp-nav-flyout > span > span.nav-line-1 > span")).click();
        Thread.sleep(5000);
        driver.close();

    }
}
