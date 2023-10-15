package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class myClass {

         String driverPath = "C:\\selenium drivers\\chromedriver-win64\\chromedriver.exe";
         public WebDriver driver;
         public String baseUrl = "https://formy-project.herokuapp.com/";

    @Test
    public void verifyHomepageTitle() {


         System.out.println("launching chrome browser");
         System.setProperty("webdriver.chrome.driver", driverPath);
         WebDriver driver = new ChromeDriver();
         driver.get(baseUrl);
         String expectedTitle = "Formy";
         String actualTitle = driver.getTitle();
         Assert.assertEquals(actualTitle, expectedTitle);
         driver.close();

        }
}
