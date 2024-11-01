package com.opencart.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestUtils {

  public static void moveAndHoverToElement(BaseTest basetest, By locator) {
    WebElement element = basetest.getDriver().findElement(locator);
    new Actions(basetest.getDriver())
      .moveToElement(element)
      .perform();
  }
}
