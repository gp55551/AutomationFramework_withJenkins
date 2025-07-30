package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {

    private final By logo = By.id("nav-logo-sprites");
    private final By searchBox = By.id("twotabsearchtextbox");
    private final By searchButton = By.id("nav-search-submit-button");

    private final By firstSearchResultName = By.xpath("(//*[text()='Results']/following::a/h2/span)[1]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("verify Home Page")
    public void verifyHomePage()
    {
        waitUntilElementVisible(logo);
        Assert.assertTrue(driver.findElement(logo).isDisplayed());
    }

    @Step("search Product")
    public void searchProduct(String product)
    {
        waitUntilElementVisible(searchBox);
        driver.findElement(searchBox).sendKeys(product);
        waitUntilElementVisible(searchButton);
        driver.findElement(searchButton).click();
    }

    @Step("verify First Link")
    public void verifyFirstLink(String product)
    {
        waitUntilElementVisible(firstSearchResultName);
        Assert.assertTrue(driver.findElement(firstSearchResultName).getText().contains(product));
    }
}