package test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import org.testng.annotations.Test;
import page.HomePage;
import static util.driver.DriverHolder.getDriver;

public class SignInPageTest extends BaseTest {

    @Test(priority = 1)
    public void verifySignInPage() {
        ChainTestListener.log("verify Sign In Page");
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage()
                .clickSignInLink()
                .verifySignInHomepage();
    }

    @Test(priority = 2)
    public void verifySignInFields() {
        ChainTestListener.log("verify Sign In Fields");
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage()
                .clickSignInLink()
                .verifyFields();
    }
}