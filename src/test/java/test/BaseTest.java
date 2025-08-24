package test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import page.BasePage;
import util.driver.DriverFactory;

import static util.PropertyFileReader.getProperty;
import static util.driver.DriverHolder.getDriver;
import static util.driver.DriverHolder.setDriver;
import com.aventstack.chaintest.plugins.ChainTestListener;

@Listeners(ChainTestListener.class)
public class BaseTest {

    @BeforeMethod
    public void before() {
        setDriver(DriverFactory.getNewDriverInstance(getProperty("browser")));
        getDriver().manage().window().maximize();
        ChainTestListener.log("Start testing....");
        getDriver().get(getProperty("application_url"));
        BasePage.clickContinueShopping(getDriver());
    }

    @AfterMethod
    public void after(ITestResult result) {
        if (getDriver() != null) {
            getDriver().quit();
        }
        ChainTestListener.log("Ending Test.....");
        if (!result.isSuccess()) {
            TakesScreenshot scr = (TakesScreenshot) getDriver();
            byte imgScr[] = scr.getScreenshotAs(OutputType.BYTES);
            // embed
            ChainTestListener.embed(imgScr, "image/png");
        }
    }
}