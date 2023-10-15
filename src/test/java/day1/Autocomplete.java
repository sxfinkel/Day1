package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver (you can uncomment the maximize line if needed)
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();

        // Navigate to the URL
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        System.out.println("Page Title: " + driver.getTitle());

        // Find the autocomplete input element
        driver.findElement(By.id("autocomplete")).sendKeys("2030 Test Drive");
// Sleep for 1 second (you can remove this if not needed)
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        // Quit the WebDriver
        sleep(1000);
        driver.quit();
    }
}