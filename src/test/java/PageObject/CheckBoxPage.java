package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToCheckBoxPage() {
        driver.get("https://formy-project.herokuapp.com/checkbox");
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void selectCheckbox1() {
        WebElement checkbox1 = driver.findElement(By.cssSelector("input[value='checkbox-1']"));
        checkbox1.click();
    }

    public void selectCheckbox2() {
        WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkbox-2\"]"));
        checkbox2.click();
    }

    public void selectCheckbox3() {
        WebElement checkbox3 = driver.findElement(By.cssSelector("input[value='checkbox-3']"));
        checkbox3.click();
    }
}
