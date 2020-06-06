package Amazondirectmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase3 {

    public static void main(String[] args) throws InterruptedException {

        //Setting the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver/windows/geckodriver.exe");
        //creating an object of Firefox driver
        WebDriver driver = new FirefoxDriver();
        //open the amazon web
        driver.get("https://www.amazon.com/");
        //Make the amazon window in full screen
        driver.manage().window().maximize();
        //wait for 5 seconds before closing
        Thread.sleep(5000);
        String searchBox = "//input[@id=\"twotabsearchtextbox\"]";
        driver.findElement(By.xpath(searchBox)).sendKeys("handbag");
        Thread.sleep(3000);
        //show the seleted page
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();



    }

}
