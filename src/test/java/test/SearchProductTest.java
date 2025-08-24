package test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import org.testng.annotations.Test;
import page.HomePage;

import static util.driver.DriverHolder.getDriver;

public class SearchProductTest extends BaseTest {

    @Test
    public void searchProductAndVerifyFirstLink() {
        ChainTestListener.log("search Product And Verify First Link");
        HomePage homePage = new HomePage(getDriver());
        homePage.searchProduct("iPhone 15");
        homePage.verifyFirstLink("iPhone 15");
    }
}