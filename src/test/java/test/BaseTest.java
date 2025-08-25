package test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.*;
import page.BasePage;
import util.driver.DriverFactory;

import static util.PropertyFileReader.getProperty;
import static util.driver.DriverHolder.getDriver;
import static util.driver.DriverHolder.setDriver;
import com.aventstack.chaintest.plugins.ChainTestListener;

@Listeners(ChainTestListener.class)
public class BaseTest {

    @BeforeTest
    public void beforeTest() {
        ChainTestListener.log("Start testing....");
    }

    @BeforeMethod
    public void before() {
        setDriver(DriverFactory.getNewDriverInstance(getProperty("browser")));
        getDriver().manage().window().maximize();
        ChainTestListener.log("Opening application....");
        getDriver().get(getProperty("application_url"));
        BasePage.clickContinueShopping(getDriver());
    }

    @AfterMethod
    public void after(ITestResult result) {
        ChainTestListener.log("Closing application....");
        if (!result.isSuccess()) {
            TakesScreenshot scr = (TakesScreenshot) getDriver();
            byte imgScr[] = scr.getScreenshotAs(OutputType.BYTES);
            ChainTestListener.embed(imgScr, "image/png");
        }
        if (getDriver() != null) {
            getDriver().quit();
        }
    }

    @AfterTest
    public void afterTest() {
        ChainTestListener.log("Ending Test.....");
    }
}