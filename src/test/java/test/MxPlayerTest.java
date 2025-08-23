package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.HomePage;

import static io.qameta.allure.SeverityLevel.NORMAL;
import static util.driver.DriverHolder.getDriver;

public class MxPlayerTest extends BaseTest {

    @Test(description = "Verify the homepage of the application")
    @Severity(NORMAL)
    @Description("Verify the homepage of the application")
    @Story("As a user I should be able to verify homepage of the application")
    public void verifyMXPlayerHomepage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage();
        homePage.verifyMXPlayerLink();
        homePage.clickMXPlayerLink();
        homePage.verifyMXPlayerHomepage();
    }
}