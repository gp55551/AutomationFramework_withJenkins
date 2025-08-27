package test;

import org.testng.annotations.Test;
import page.HomePage;
import util.LoggerLoad;

import static page.MXPlayerPage.Link.*;
import static util.driver.DriverHolder.getDriver;

public class MxPlayerHomepageTest extends BaseTest {

    @Test(priority = 1)
    public void verifyMXPlayerHomepage() {
        LoggerLoad.info("verify MXPlayer Homepage");

        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage()
                .verifyMXPlayerLink()
                .clickMXPlayerLink()
                .verifyMXPlayerHomepage();
    }

    @Test(priority = 2)
    public void verifyLinks() {
        LoggerLoad.info("verify Links");

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