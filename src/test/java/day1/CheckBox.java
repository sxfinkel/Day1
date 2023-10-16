package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;
public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");
        System.out.println("Page Title: " + driver.getTitle());

        //first radio button
        //id=radio-button1
        WebElement checkbox1 = driver.findElement(By.cssSelector("input[value='checkbox-1']"));
        checkbox1.click();

        //2nd radio button
        WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]"));
        checkbox2.click();

        //radio button 3

        WebElement checkbox3 = driver.findElement(By.cssSelector("input[value='checkbox-3']"));

        checkbox3.click();

        // Sleep for 1 second (you can remove this if not needed)
        sleep(1000);
        driver.quit();
    }

}
