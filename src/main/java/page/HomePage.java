package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static util.CommonMethods.*;

public class HomePage extends BasePage {

    private final By logo = By.id("nav-logo-sprites");
    private final By searchBox = By.id("twotabsearchtextbox");
    private final By searchButton = By.id("nav-search-submit-button");
    private final By firstSearchResultName = By.xpath("(//*[text()='Results']/following::a/h2/span)[1]");
    private final By mxPlayerLink = By.xpath("//a[text()='MX Player']");
    private final By helloSignInLink = By.xpath("//*[text()='Hello, sign in']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage verifyHomePage()
    {
        verifyElementDisplayed(driver, logo);
        return this;
    }

    public HomePage searchProduct(String product)
    {
        sendKeys(driver, searchBox,product);
        click(driver, searchButton);
        return this;
    }

    public HomePage verifyFirstLink(String product)
    {
        waitUntilElementVisible(firstSearchResultName);
        Assert.assertTrue(driver.findElement(firstSearchResultName).getText().contains(product));
        return this;
    }

    public HomePage verifyMXPlayerLink()
    {
        verifyElementDisplayed(driver, mxPlayerLink);
        return this;
    }

    public MXPlayerPage clickMXPlayerLink()
    {
        click(driver, mxPlayerLink);
        return new MXPlayerPage(driver);
    }

    public SignInPage clickSignInLink()
    {
        click(driver,helloSignInLink);
        return new SignInPage(driver);
    }
}