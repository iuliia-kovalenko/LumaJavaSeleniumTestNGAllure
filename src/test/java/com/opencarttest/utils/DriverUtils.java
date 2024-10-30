package com.opencarttest.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Map;


public class DriverUtils {
    private static final ChromeOptions chromeOptions;
    private static final FirefoxOptions fireFoxOptions;

    static {
        chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");

        fireFoxOptions = new FirefoxOptions();

        fireFoxOptions.addArguments("--incognito");
        fireFoxOptions.addArguments("--headless");
        fireFoxOptions.addArguments("--window-size=1920,1080");
        fireFoxOptions.addArguments("--disable-gpu");
        fireFoxOptions.addArguments("--no-sandbox");
        fireFoxOptions.addArguments("--disable-dev-shm-usage");

    }

    private static WebDriver createChromeDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }

        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.executeCdpCommand("Network.enable", Map.of());
        chromeDriver.executeCdpCommand("Network.setExtraHTTPHeaders", Map.of("headers", Map.of("accept-language", "en-US,en;q=0.9")));

        return chromeDriver;
    }

    private static WebDriver createFirefoxDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
        FirefoxDriver firefoxDriver = new FirefoxDriver(fireFoxOptions);

        return firefoxDriver;
    }

    public static WebDriver createDriver(String browser, WebDriver driver) {
        switch (browser) {
            case "chrome" -> {
                return createChromeDriver(driver);
            }
            case "firefox" -> {
                return createFirefoxDriver(driver);
            }
            default -> {
                return null;
            }
        }
    }


// For OpenCart site
//        public static WebDriver createChromeDriver(WebDriver driver) {
//            if (driver == null) {
//                return new ChromeDriver(chromeOptions);
//            } else {
//                driver.quit();
//                return new ChromeDriver(chromeOptions);
//            }
//        }


}
