package com.lumatest.test;

import com.lumatest.base.BaseTest;
import com.lumatest.base.TestUtils;
import com.lumatest.data.TestData;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test(description = "TC-01 Open Base URL")
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

        Allure.step("Collect actualURL");
        final String actualURL = getDriver().getCurrentUrl();

        Allure.step("Collect actualURL");
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(description = "TC-02 Verify that all tabs with dropdown menu of Navigation menu work correctly as expected",
            dataProvider = "navigationDataDropDown", dataProviderClass = TestData.class)
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

        Allure.step("Collect actualURL");
        final String actualURL = getDriver().getCurrentUrl();
        Allure.step("Collect actualURL");
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(description = "TC-03 Verify that all tabs without dropdown menu work correctly as expected",
            dataProvider = "navigationData", dataProviderClass = TestData.class)
    @Story("Navigation main menu")
    @Description("TC-03 Verify that all tabs without dropdown menu work correctly as expected")
    @Severity(SeverityLevel.CRITICAL)
    @Link(TestData.BASE_URL)
    public void testNavigationMenuWithoutDropdown(String baseURL, By navBarMenu, String expectedURL, String expectedTitle) {
        Allure.step("Open Base URL");
        getDriver().get(baseURL);

        Allure.step("Click on dropDown element");
        getDriver().findElement(navBarMenu).click();

        Allure.step("Collect actualURL");
        final String actualURL = getDriver().getCurrentUrl();
        Allure.step("Collect actualURL");
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(description = "TC-04 Verify that all tabs of Desktop dropdown menu work correctly as expected",
            dataProvider = "navigationDesktop", dataProviderClass = TestData.class)
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
