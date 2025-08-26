package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static util.CommonMethods.*;

public class SignInPage extends BasePage {

    private final By signInHeader = By.xpath("//*[contains(text(),'Sign in or create account')]");
    private final By enterEmailField = By.id("ap_email_login");
    private final By continueButton = By.id("continue");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage verifySignInHomepage() {
        verifyElementDisplayed(driver, signInHeader);
        return this;
    }

    public SignInPage verifyFields() {
        verifyElementDisplayed(driver, enterEmailField);
        verifyElementDisplayed(driver, continueButton);
        return this;
    }
}