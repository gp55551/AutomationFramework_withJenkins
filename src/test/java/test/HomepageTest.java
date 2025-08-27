package test;

import org.testng.annotations.Test;
import page.HomePage;
import util.LoggerLoad;

import static util.driver.DriverHolder.getDriver;

public class HomepageTest extends BaseTest {

    @Test
    public void verifyHomePage() {
        LoggerLoad.info("verify HomePage");
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage();
    }
}