package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver (you can uncomment the maximize line if needed)
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();

        // Navigate to the URL
        driver.get("https://www.demo.guru99.com/V4/");

        System.out.println("Page Title: " + driver.getTitle());

        // Find the autocomplete input element
        driver.findElement(By.name("uid")).sendKeys("mngr532417");
        driver.findElement(By.name("password")).sendKeys("UpupEju");
        driver.findElement(By.name("btnLogin")).click();
// Sleep for 1 second (you can remove this if not needed)

        System.out.println("Page Title: " + driver.getTitle());


        // Quit the WebDriver
        sleep(1000);
        driver.quit();
    }
}

