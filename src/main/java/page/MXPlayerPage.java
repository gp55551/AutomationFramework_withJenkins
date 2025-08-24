package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MXPlayerPage extends BasePage {

    private final By mxPlayerHeader = By.xpath("(//a[@href='/minitv'])[1]");

    public MXPlayerPage(WebDriver driver) {
        super(driver);
    }

    public void verifyMXPlayerHomepage()
    {
        waitUntilElementVisible(mxPlayerHeader);
        Assert.assertTrue(driver.findElement(mxPlayerHeader).isDisplayed());
    }
}