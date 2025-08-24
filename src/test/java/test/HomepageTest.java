package test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import org.testng.annotations.Test;
import page.HomePage;
import static util.driver.DriverHolder.getDriver;

public class HomepageTest extends BaseTest {

    @Test
    public void verifyHomePage() {
        ChainTestListener.log("verify Amazon Home Page");
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage();
    }
}