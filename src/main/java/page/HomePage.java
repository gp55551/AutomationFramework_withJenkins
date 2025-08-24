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

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void verifyHomePage()
    {
        waitUntilElementVisible(logo);
        Assert.assertTrue(driver.findElement(logo).isDisplayed());
    }

    public void searchProduct(String product)
    {
        waitUntilElementVisible(searchBox);
        driver.findElement(searchBox).sendKeys(product);
        waitUntilElementVisible(searchButton);
        driver.findElement(searchButton).click();
    }

    public void verifyFirstLink(String product)
    {
        waitUntilElementVisible(firstSearchResultName);
        Assert.assertTrue(driver.findElement(firstSearchResultName).getText().contains(product));
    }

    public void verifyMXPlayerLink()
    {
        waitUntilElementVisible(mxPlayerLink);
        Assert.assertTrue(driver.findElement(mxPlayerLink).isDisplayed());
    }

    public void clickMXPlayerLink()
    {
        waitUntilElementVisible(mxPlayerLink);
        driver.findElement(mxPlayerLink).click();
    }
}