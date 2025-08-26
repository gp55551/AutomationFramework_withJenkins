package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignInPage extends BasePage {

    private final By signInHeader = By.xpath("//*[contains(text(),'Sign in or create account')]");
    private final By enterEmailField = By.id("ap_email_login");
    private final By continueButton = By.id("continue");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage verifySignInHomepage() {
        waitUntilElementVisible(signInHeader);
        Assert.assertTrue(driver.findElement(signInHeader).isDisplayed());
        return this;
    }

    public SignInPage verifyFields() {
        waitUntilElementVisible(enterEmailField);
        Assert.assertTrue(driver.findElement(enterEmailField).isDisplayed());
        waitUntilElementVisible(continueButton);
        Assert.assertTrue(driver.findElement(continueButton).isDisplayed());
        return this;
    }
}