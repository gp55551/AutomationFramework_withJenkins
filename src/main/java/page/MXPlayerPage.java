package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MXPlayerPage extends BasePage {

    private final By mxPlayerHeader = By.xpath("(//a[@href='/minitv'])[1]");

    public MXPlayerPage(WebDriver driver) {
        super(driver);
    }

    public MXPlayerPage verifyMXPlayerHomepage() {
        waitUntilElementVisible(mxPlayerHeader);
        Assert.assertTrue(driver.findElement(mxPlayerHeader).isDisplayed());
        return this;
    }

    public MXPlayerPage verifyAllLinks(String linkText) {
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='"+linkText+"']")).isDisplayed());
        return this;
    }

    public enum Link {

        HOME("Home"),
        NEWS_HOT("New & Hot"),
        WEB_SERIES("Web Series"),
        MOVIES("Movies"),
        V_DESI("VDesi"),
        ROMANCE("Romance"),
        COMEDY("Comedy"),
        TAMIL("Tamil");

        private final String linkText;

        Link(String linkText) {
            this.linkText = linkText;
        }

        public String getLinkTextValue() {
            return linkText;
        }
    }
}