package com.lumatest.base;

import com.lumatest.utils.DriverUtils;
import com.lumatest.utils.ReportUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.time.Duration;


public abstract class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait5;


    @BeforeSuite
    protected void setupWebDriverManager() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
//        WebDriverManager.edgedriver().setup();
//        WebDriverManager.operadriver().setup();
//        WebDriverManager.chromiumdriver().setup();
//        WebDriverManager.iedriver().setup();
    }

    @Parameters("browser")
    @BeforeMethod()
    protected void setupDriver(@Optional("chrome") String browser, ITestResult result) {
        Reporter.log("______________________________________________________________________");
        Reporter.log("RUN " + result.getMethod().getMethodName(), false);

        this.driver = DriverUtils.createDriver(browser, this.driver);

        if (getDriver() == null) {
            Reporter.log("ERROR: Unknown parameter 'browser' - '" + browser + "'.");

            System.exit(1);
        }

        Reporter.log("INFO: " + browser.toUpperCase() + " driver created.");
    }

    @Parameters("browser")
    @AfterMethod(alwaysRun = true)
    protected void tearDown(@Optional("chrome") String browser, ITestResult result) {
        Reporter.log(result.getMethod().getMethodName() + ": " + ReportUtils.getTestStatus(result), false);
        if (this.driver != null) {
            getDriver().quit();
            Reporter.log("INFO: " + browser.toUpperCase() + " driver closed.");

            this.driver = null;
        } else {
            Reporter.log("INFO: Driver is null.", false);
        }
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait5() {
        if (wait5 == null) {
            wait5 = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        }
        return wait5;
    }
}
