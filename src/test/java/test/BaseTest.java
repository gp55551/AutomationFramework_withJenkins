package test;

import io.qameta.allure.Step;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import util.driver.DriverFactory;

import static util.PropertyFileReader.getProperty;
import static util.driver.DriverHolder.getDriver;
import static util.driver.DriverHolder.setDriver;
import com.aventstack.chaintest.plugins.ChainTestListener;

@Listeners(ChainTestListener.class)
public class BaseTest {

    @Step("Opening Application")
    @BeforeMethod
    public void before() {
        setDriver(DriverFactory.getNewDriverInstance(getProperty("browser")));
        getDriver().manage().window().maximize();
        getDriver().get(getProperty("application_url"));
    }

    @Step("Closing Application")
    @AfterMethod
    public void after() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}