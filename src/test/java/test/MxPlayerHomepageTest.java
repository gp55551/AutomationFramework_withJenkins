package test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import org.testng.annotations.Test;
import page.HomePage;
import page.MXPlayerPage;

import static util.driver.DriverHolder.getDriver;

public class MxPlayerHomepageTest extends BaseTest {

    @Test
    public void verifyMXPlayerHomepage() {
        ChainTestListener.log("verify MX Player Homepage");
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage();
        homePage.verifyMXPlayerLink();
        homePage.clickMXPlayerLink();
        MXPlayerPage mxPlayerPage = new MXPlayerPage(getDriver());
        mxPlayerPage.verifyMXPlayerHomepage();
    }
}