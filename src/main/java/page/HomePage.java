package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {

    By logo = By.id("nav-logo-sprites");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void verifyHomePage()
    {
        waitUntilElementVisible(logo);
        Assert.assertTrue(driver.findElement(logo).isDisplayed());
    }
}
