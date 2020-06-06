package CNNdirectmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

    public static void main(String[] args) throws InterruptedException {

        //Setting the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver/windows/geckodriver.exe");
        //creating an object of Firefox driver
        WebDriver driver = new FirefoxDriver();
        //open the CNN webpage
        driver.get("https://www.cnn.com");
        //Make the CNN window in full screen
        driver.manage().window().maximize();
        //wait for 5 seconds before closing
        Thread.sleep(5000);
       // String searchBox = "//input[@id=\"twotabsearchtextbox\"]";
        driver.findElement(By.cssSelector("#homepage-injection-zone-1 > div.l-container.zn__background--content-relative > div > div > div > ul > li:nth-child(1) > article > div > div > h3 > a > span.cd__pre-headline")).click();


    }
}
