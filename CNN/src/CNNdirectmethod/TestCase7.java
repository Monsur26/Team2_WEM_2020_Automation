package CNNdirectmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase7 {
    //Test case 1: open cnn website in full size and close it after 5 seconds
    public static void main(String[] args) throws InterruptedException {

        //Setting the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver/windows/geckodriver.exe");
        //creating an object of chrome driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.cnn.com");
        //Make the cnn window in full screen
        driver.manage().window().maximize();
        //wait for 5 seconds before closing
        Thread.sleep(5000);
        String searchBox = "//input[@id=\"twotabsearchtextbox\"]";
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[10]/a")).click();
        //Back to HomePage
        driver.findElement(By.xpath("//*[@id=\"backToCnn\"]/a")).click();

    }
}
