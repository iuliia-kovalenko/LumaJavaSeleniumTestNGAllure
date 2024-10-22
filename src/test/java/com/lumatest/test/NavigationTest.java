package com.lumatest.test;

import com.lumatest.base.BaseTest;
import com.lumatest.base.TestUtils;
import com.lumatest.data.TestData;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test(testName = "TC-01 Open Base URL")
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

    @Test(dataProvider = "navigationData", dataProviderClass = TestData.class)
    @Story("Navigation main menu")
    @Description("TC-02 Verify that all tabs of Navigation menu work correctly as expected")
    @Severity(SeverityLevel.CRITICAL)
    @Link(TestData.BASE_URL)
    public void testNavigationMenu(String baseURL, By navBarMenu, String expectedURL, String expectedTitle) {

        Allure.step("Open Base URL");
        getDriver().get(baseURL);

        Allure.step("Click on " + navBarMenu.toString());
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

    @Test(dataProvider = "navigationSubMenuDataWomen", dataProviderClass = TestData.class)
    @Story("Navigation Women subMenu's")
    @Description("TC-03 Verify that all tabs of Women menu work correctly as expected")
    @Severity(SeverityLevel.CRITICAL)
    @Link(TestData.BASE_URL)
    public void testNavigationWomenMenu(String baseURL, By webElement, String expectedURL, String expectedTitle) {

        Allure.step("Open Base URL");
        getDriver().get(baseURL);

        Allure.step("Hover over First Menu level (Women)");
        TestUtils.moveAndHoverToElement(this, TestData.WOMEN_MENU);

        Allure.step("Click element of first level menu");
        getDriver().findElement(webElement).click();

        Allure.step("Collect actualURL");
        final String actualURL = getDriver().getCurrentUrl();
        Allure.step("Collect actualURL");
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "navigationSubMenuDataWomenTops", dataProviderClass = TestData.class)
    @Story("Navigation Women subMenu's")
    @Description("TC-04 Verify that all tabs of Women Tops menu work correctly as expected")
    @Severity(SeverityLevel.CRITICAL)
    @Link(TestData.BASE_URL)
    public void testNavigationMenuWomenTops(String baseURL, By webElement, String expectedURL, String expectedTitle) {

        Allure.step("Open Base URL");
        getDriver().get(baseURL);

        Allure.step("Hover over First Menu level (Women)");
        TestUtils.moveAndHoverToElement(this, TestData.WOMEN_MENU);

        Allure.step("Hover over Second Menu level (Tops, Bottoms)");
        TestUtils.moveAndHoverToElement(this, TestData.TOPS_MENU);

        Allure.step("Click element of second level menu");
        getDriver().findElement(webElement).click();

        Allure.step("Collect actualURL");
        final String actualURL = getDriver().getCurrentUrl();
        Allure.step("Collect actualURL");
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "navigationSubMenuDataWomenBottoms", dataProviderClass = TestData.class)
    @Story("Navigation Women subMenu's")
    @Description("TC-05 Verify that all tabs of Women Bottoms menu work correctly as expected")
    @Severity(SeverityLevel.CRITICAL)
    @Link(TestData.BASE_URL)
    public void testNavigationMenuWomenBottoms(String baseURL, By webElement, String expectedURL, String expectedTitle) {

        Allure.step("Open Base URL");
        getDriver().get(baseURL);

        Allure.step("Hover over First Menu level (Women)");
        TestUtils.moveAndHoverToElement(this, TestData.WOMEN_MENU);

        Allure.step("Hover over Second Menu level (Tops, Bottoms)");
        TestUtils.moveAndHoverToElement(this, TestData.BOTTOMS_MENU);

        Allure.step("Click element of second level menu");
        getDriver().findElement(webElement).click();

        Allure.step("Collect actualURL");
        final String actualURL = getDriver().getCurrentUrl();
        Allure.step("Collect actualURL");
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "navigationSubMenuDataMen", dataProviderClass = TestData.class)
    @Story("Navigation Men subMenu's")
    @Description("TC-06 Verify that all tabs of Men menu work correctly as expected")
    @Severity(SeverityLevel.CRITICAL)
    @Link(TestData.BASE_URL)
    public void testNavigationMenMenu(String baseURL, By webElement, String expectedURL, String expectedTitle) {

        Allure.step("Open Base URL");
        getDriver().get(baseURL);

        Allure.step("Hover over First Menu level (Men)");
        TestUtils.moveAndHoverToElement(this, TestData.MEN_MENU);

        Allure.step("Click element of first level menu");
        getDriver().findElement(webElement).click();

        Allure.step("Collect actualURL");
        final String actualURL = getDriver().getCurrentUrl();
        Allure.step("Collect actualURL");
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "navigationSubMenuDataMenTops", dataProviderClass = TestData.class)
    @Story("Navigation Men subMenu's")
    @Description("TC-07 Verify that all tabs of Men Tops menu work correctly as expected")
    @Severity(SeverityLevel.CRITICAL)
    @Link(TestData.BASE_URL)
    public void testNavigationMenMenuTops(String baseURL, By webElement, String expectedURL, String expectedTitle) {

        Allure.step("Open Base URL");
        getDriver().get(baseURL);

        Allure.step("Hover over First Menu level (Men)");
        TestUtils.moveAndHoverToElement(this, TestData.MEN_MENU);

        Allure.step("Hover over Second Menu level (Tops, Bottoms)");
        TestUtils.moveAndHoverToElement(this, TestData.TOPS_MEN_MENU);

        Allure.step("Click element of second level menu");
        getDriver().findElement(webElement).click();

        Allure.step("Collect actualURL");
        final String actualURL = getDriver().getCurrentUrl();
        Allure.step("Collect actualURL");
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "navigationSubMenuDataMenBottoms", dataProviderClass = TestData.class)
    @Story("Navigation Men subMenu's")
    @Description("TC-08 Verify that all tabs of Men Bottoms menu work correctly as expected")
    @Severity(SeverityLevel.CRITICAL)
    @Link(TestData.BASE_URL)
    public void testNavigationMenMenuBottoms(String baseURL, By webElement, String expectedURL, String expectedTitle) {

        Allure.step("Open Base URL");
        getDriver().get(baseURL);

        Allure.step("Hover over First Menu level (Men)");
        TestUtils.moveAndHoverToElement(this, TestData.MEN_MENU);

        Allure.step("Hover over Second Menu level (Tops, Bottoms)");
        TestUtils.moveAndHoverToElement(this, TestData.BOTTOMS_MEN_MENU);

        Allure.step("Click element of second level menu");
        getDriver().findElement(webElement).click();

        Allure.step("Collect actualURL");
        final String actualURL = getDriver().getCurrentUrl();
        Allure.step("Collect actualURL");
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(dataProvider = "navigationGearMenu", dataProviderClass = TestData.class)
    @Story("Navigation Gear subMenu's")
    @Description("TC-09 Verify that all tabs of Gear menu work correctly as expected")
    @Severity(SeverityLevel.CRITICAL)
    @Link(TestData.BASE_URL)
    public void testNavigationGearMenu(String baseURL, By webElement, String expectedURL, String expectedTitle) {

        Allure.step("Open Base URL");
        getDriver().get(baseURL);

        Allure.step("Hover over Gear menu");
        TestUtils.moveAndHoverToElement(this, TestData.GEAR_MENU);

        Allure.step("Click element of menu");
        getDriver().findElement(webElement).click();

        Allure.step("Collect actualURL");
        final String actualURL = getDriver().getCurrentUrl();
        Allure.step("Collect actualURL");
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    @Story("Navigation Training subMenu's")
    @Description("TC-10 Verify that all tabs of Training menu work correctly as expected")
    @Severity(SeverityLevel.NORMAL)
    @Link(TestData.BASE_URL)
    public void testNavigationTrainingMenu() {
        Allure.step("SetUp expected results");
        final String expectedURL = TestData.TRAINING_VIDEO_DOWNLOAD_URL;
        final String expectedTitle = TestData.TRAINING_VIDEO_DOWNLOAD_TITLE;

        Allure.step("Open Base URL");
        getDriver().get(TestData.BASE_URL);

        Allure.step("Hover over training menu");
        TestUtils.moveAndHoverToElement(this, TestData.TRAINING_MENU);

        Allure.step("Click element of menu");
        getDriver().findElement(TestData.TRAINING_VIDEO_DOWNLOAD_MENU).click();

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
