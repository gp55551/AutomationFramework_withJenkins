package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
        waitUntilElementVisible(logo);
        Assert.assertTrue(driver.findElement(logo).isDisplayed());
        return this;
    }

    public HomePage searchProduct(String product)
    {
        waitUntilElementVisible(searchBox);
        driver.findElement(searchBox).sendKeys(product);
        waitUntilElementVisible(searchButton);
        driver.findElement(searchButton).click();
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
        waitUntilElementVisible(mxPlayerLink);
        Assert.assertTrue(driver.findElement(mxPlayerLink).isDisplayed());
        return this;
    }

    public MXPlayerPage clickMXPlayerLink()
    {
        waitUntilElementVisible(mxPlayerLink);
        driver.findElement(mxPlayerLink).click();
        return new MXPlayerPage(driver);
    }

    public SignInPage clickSignInLink()
    {
        waitUntilElementVisible(helloSignInLink);
        driver.findElement(helloSignInLink).click();
        return new SignInPage(driver);
    }
}