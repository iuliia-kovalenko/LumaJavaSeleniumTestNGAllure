package com.opencarttest.test;

import com.opencarttest.base.BaseTest;
import com.opencarttest.base.TestUtils;
import com.opencarttest.data.TestData;
import io.qameta.allure.Allure;
import io.qameta.allure.Story;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Link;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

  @Test(
    description = "TC-01 Open Base URL",
    groups = {"smoke", "regression"},
    testName = "NAVIGATION |Open Base URL"
  )
  @Story("Navigation")
  @Description("Verify that base URL and the page title matches the expected results.")
  @Severity(SeverityLevel.BLOCKER)
  @Link(TestData.BASE_URL)
  public void testOpenBaseURL() {
    Allure.step("SetUp expected results");
    final String expectedURL = TestData.BASE_URL + "/";
    final String expectedTitle = TestData.BASE_URL_TITLE;

    Allure.step("Open Base URL");
    getDriver().get(TestData.BASE_URL);

    Allure.step("Collect actual URL");
    final String actualURL = getDriver().getCurrentUrl();

    Allure.step("Collect actual Title");
    final String actualTitle = getDriver().getTitle();

    Allure.step("Verify actual URL as expected");
    Assert.assertEquals(actualURL, expectedURL);
    Allure.step("Verify actual Title as expected");
    Assert.assertEquals(actualTitle, expectedTitle);
  }

  @Test(
    groups = {"smoke", "regression"},
    description = "TC-02 Verify that all tabs with dropdown menu of Navigation menu work correctly as expected",
    dataProvider = "navigationDataDropDown", dataProviderClass = TestData.class,
    testName = "NAVIGATION |Open Menu with dropdown"
  )
  @Story("Navigation main menu")
  @Description("TC-02 Verify that all tabs of Navigation menu work correctly as expected")
  @Severity(SeverityLevel.CRITICAL)
  @Link(TestData.BASE_URL)
  public void testNavigationMenu(String baseURL, By navBarMenu, By navBarDropdownMenu, String expectedURL, String expectedTitle) {
    Allure.step("Open Base URL");
    getDriver().get(baseURL);

    Allure.step("Hover over navBarMenu");
    TestUtils.moveAndHoverToElement(this, navBarMenu);

    Allure.step("Click on dropDown element");
    getDriver().findElement(navBarDropdownMenu).click();

    Allure.step("Collect actual URL");
    final String actualURL = getDriver().getCurrentUrl();

    Allure.step("Collect actual Title");
    final String actualTitle = getDriver().getTitle();

    Allure.step("Verify actual URL as expected");
    Assert.assertEquals(actualURL, expectedURL);
    Allure.step("Verify actual Title as expected");
    Assert.assertEquals(actualTitle, expectedTitle);
  }

  @Test(
    groups = {"smoke", "regression"},
    description = "TC-03 Verify that all tabs without dropdown menu work correctly as expected",
    dataProvider = "navigationData", dataProviderClass = TestData.class,
    testName = "NAVIGATION |Open Menu without dropdown"
  )
  @Story("Navigation main menu")
  @Description("TC-03 Verify that all tabs without dropdown menu work correctly as expected")
  @Severity(SeverityLevel.CRITICAL)
  @Link(TestData.BASE_URL)
  public void testNavigationMenuWithoutDropdown(String baseURL, By navBarMenu, String expectedURL, String expectedTitle) {
    Allure.step("Open Base URL");
    getDriver().get(baseURL);

    Allure.step("Click on dropDown element");
    getDriver().findElement(navBarMenu).click();

    Allure.step("Collect actual URL");
    final String actualURL = getDriver().getCurrentUrl();
    Allure.step("Collect actual Title");
    final String actualTitle = getDriver().getTitle();

    Allure.step("Verify actual URL as expected");
    Assert.assertEquals(actualURL, expectedURL);
    Allure.step("Verify actual Title as expected");
    Assert.assertEquals(actualTitle, expectedTitle);
  }

  @Test(
    groups = {"smoke", "regression"},
    description = "TC-04 Verify that all tabs of Desktop dropdown menu work correctly as expected",
    dataProvider = "navigationDesktop", dataProviderClass = TestData.class,
    testName = "NAVIGATION |Open Desktop subMenu"
  )
  @Story("Navigation Desktop subMenu's")
  @Description("C-04 Verify that all tabs of Desktop dropdown menu work correctly as expected")
  @Severity(SeverityLevel.CRITICAL)
  @Link(TestData.BASE_URL)
  public void testNavigationDesktopMenu(String baseURL, By navBarMenu, By desktopMenu, String expectedURL, String expectedTitle) {

    Allure.step("Open Base URL");
    getDriver().get(baseURL);

    Allure.step("Hover over desktop menu");
    TestUtils.moveAndHoverToElement(this, navBarMenu);

    Allure.step("Click element of menu");
    getDriver().findElement(desktopMenu).click();

    Allure.step("Collect actualURL");
    final String actualURL = getDriver().getCurrentUrl();
    Allure.step("Collect actualURL");
    final String actualTitle = getDriver().getTitle();

    Allure.step("Verify actualURL as expected");
    Assert.assertEquals(actualURL, expectedURL);
    Allure.step("Verify actualTitle as expected");
    Assert.assertEquals(actualTitle, expectedTitle);
  }
}
