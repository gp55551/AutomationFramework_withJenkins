package test;

import org.testng.annotations.Test;
import page.HomePage;
import static util.driver.DriverHolder.getDriver;

public class HomepageTest extends BaseTest {

    @Test
    public void verifyHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage();
    }
}