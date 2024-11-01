package com.opencarttest.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


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

  public static WebDriver createDriver(String browser) {
    return switch (browser.toLowerCase()) {
      case "chrome" -> new ChromeDriver(chromeOptions);
      case "firefox" -> new FirefoxDriver(fireFoxOptions);
      default -> throw new IllegalArgumentException("Unknown browser: " + browser);
    };
  }
}
