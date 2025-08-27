package test;

import org.testng.annotations.Test;
import page.HomePage;
import util.LoggerLoad;

import static util.driver.DriverHolder.getDriver;

public class SearchProductTest extends BaseTest {

    @Test
    public void searchProductAndVerifyFirstLink() {
        LoggerLoad.info("search Product And Verify First Link");

        HomePage homePage = new HomePage(getDriver());
        homePage.searchProduct("iPhone 15")
                .verifyFirstLink("iPhone 15");
    }
}