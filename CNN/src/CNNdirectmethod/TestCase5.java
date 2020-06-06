package CNNdirectmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {

        //Setting the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver/windows/geckodriver.exe");
        //creating an object of Firefox driver
        WebDriver driver = new FirefoxDriver();
        //open the CNN webpage
        driver.get("https://www.cnn.com");
        //Make the cnn window in full screen
        driver.manage().window().maximize();
        //wait for 5 seconds before closing
        Thread.sleep(5000);
        String searchBox = "//input[@id=\"twotabsearchtextbox\"]";
        //click the search button
        driver.findElement(By.cssSelector("#header-nav-container > div > div.Grid-sc-1kcyc0j-0.sc-fBuWsC.jBNLzo > div > div.Flex-sc-1sqrs56-0.sc-gisBJw.gUmXbL > button > svg")).click();
        driver.findElement(By.xpath(searchBox)).sendKeys("COVID-19");
        //open the desire page
        driver.findElement(By.cssSelector("#header-nav-container > div > div.Grid-sc-1kcyc0j-0.indexes__NavGrid-nujtvs-7.indexes__ExpandedContentGrid-nujtvs-9.gkATqD > div > div.Box-sc-1fet97o-0.iKQPmQ > form > button > div.Text-sc-1amvtpj-0.iEWJSI")).click();


    }

}
