package test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import org.testng.annotations.Test;
import page.HomePage;

import static page.MXPlayerPage.Link.*;
import static util.driver.DriverHolder.getDriver;

public class MxPlayerHomepageTest extends BaseTest {

    @Test(priority = 1)
    public void verifyMXPlayerHomepage() {
        ChainTestListener.log("verify MX Player Homepage");
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage()
                .verifyMXPlayerLink()
                .clickMXPlayerLink()
                .verifyMXPlayerHomepage();
    }

    @Test(priority = 2)
    public void verifyLinks() {
        ChainTestListener.log("verify MX Player Links");
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage()
                .verifyMXPlayerLink()
                .clickMXPlayerLink()
                .verifyMXPlayerHomepage()
                .verifyAllLinks(HOME.getLinkTextValue())
                .verifyAllLinks(NEWS_HOT.getLinkTextValue())
                .verifyAllLinks(WEB_SERIES.getLinkTextValue())
                .verifyAllLinks(MOVIES.getLinkTextValue())
                .verifyAllLinks(V_DESI.getLinkTextValue());
               // .verifyAllLinks(COMEDY.getLinkTextValue())
              //  .verifyAllLinks(TAMIL.getLinkTextValue());
    }
}