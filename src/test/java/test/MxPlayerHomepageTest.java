package test;

import org.testng.annotations.Test;
import page.HomePage;
import static util.driver.DriverHolder.getDriver;

public class MxPlayerHomepageTest extends BaseTest {

    @Test
    public void verifyMXPlayerHomepage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage();
        homePage.verifyMXPlayerLink();
        homePage.clickMXPlayerLink();
        homePage.verifyMXPlayerHomepage();
    }
}