package test;

import org.testng.annotations.Test;
import page.HomePage;
import static util.driver.DriverHolder.getDriver;

public class SignInPageTest extends BaseTest {

    @Test(priority = 1)
    public void verifySignInPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage()
                .clickSignInLink()
                .verifySignInHomepage();
    }

    @Test(priority = 2)
    public void verifySignInFields() {
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage()
                .clickSignInLink()
                .verifyFields();
    }
}