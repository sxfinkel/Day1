package tests;

import PageObject.CheckBoxPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

//import PageObject.CheckBoxPage;

public class MainTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        CheckBoxPage checkBoxPage = new CheckBoxPage(driver);

        checkBoxPage.navigateToCheckBoxPage();
        System.out.println("Page Title: " + checkBoxPage.getPageTitle());

        checkBoxPage.selectCheckbox1();
        checkBoxPage.selectCheckbox2();
        checkBoxPage.selectCheckbox3();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
