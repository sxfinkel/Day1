package day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;


import static java.lang.Thread.sleep;

public class TestScript02 {
    static WebDriver driver;
    public static void main(String[] args) throws Exception {
        setUp();
        // Accessing the base URL
        String baseUrl = Util.BASE_URL;
        // Accessing chrome driver username and password
        String username = Util.USER_NAME;
        String password = Util.PASSWD;
        // Accessing the ChromeDriver path
        String chromeDriverPath = Util.CHROME_DRIVER_PATH;

        // Specifies the amount of time the driver should wait when searching for an element if it is not immediately present.
        driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);

        // Go to http://www.demo.guru99.com/V4/
        driver.get(baseUrl + "/V4/");

        String actualTitle;



        driver.findElement(By.name("uid")).clear(); // Good practice to clear a field before use
        driver.findElement(By.name("uid")).sendKeys(Util.USER_NAME);  // Enter username


        driver.findElement(By.name("password")).clear(); // Good practice to clear a field before use
        driver.findElement(By.name("password")).sendKeys(Util.PASSWD);  // Enter Password

        // Click Login
        driver.findElement(By.name("btnLogin")).click();

        actualTitle = driver.getTitle();
        if (actualTitle.contains(Util.EXPECT_TITLE)) {
            System.out.println("Test case: Passed");
        }
        else {
            System.out.println("Test case : Failed");
        }

        driver.close();
    }

    public static void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", Util.CHROME_DRIVER_PATH);
        driver = new ChromeDriver();
    }
}


