package com.opencarttest.data;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class TestData {
    public static final String BASE_URL = "https://naveenautomationlabs.com/opencart";
    public static final String BASE_URL_TITLE = "Your Store";

    //Desktop Menu
    public static final By DESKTOP_MENU = By.xpath("//a[text()='Desktops']");
    public static final By ALL_DESKTOPS_MENU = By.xpath("//a[text()='Show All Desktops']");
    public static final String DESKTOP_URL = BASE_URL + "/index.php?route=product/category&path=20";
    public static final String DESKTOP_TITLE = "Desktops";

    //Laptops&Notebooks Menu
    public static final By LAPTOPS_MENU = By.xpath("//a[text()='Laptops & Notebooks']");
    public static final By ALL_LAPTOPS_MENU = By.xpath("//a[text()='Show All Laptops & Notebooks']");
    public static final String ALL_LAPTOPS_URL = BASE_URL + "/index.php?route=product/category&path=18";
    public static final String ALL_LAPTOPS_TITLE = "Laptops & Notebooks";

    //Components menu
    public static final By COMPONENTS_MENU = By.xpath("//a[text()='Components']");
    public static final By ALL_COMPONENTS_MENU = By.xpath("//a[text()='Show All Components']");
    public static final String ALL_COMPONENTS_URL = BASE_URL + "/index.php?route=product/category&path=25";
    public static final String ALL_COMPONENTS_TITLE = "Components";

    //Tablets menu
    public static final By TABLETS_MENU = By.xpath("//a[text()='Tablets']");
    public static final String TABLETS_URL = BASE_URL + "/index.php?route=product/category&path=57";
    public static final String TABLETS_TITLE = "Tablets";

    //Software Menu
    public static final By SOFTWARE_MENU = By.xpath("//a[text()='Software']");
    public static final String SOFTWARE_URL = BASE_URL + "/index.php?route=product/category&path=17";
    public static final String SOFTWARE_TITLE = "Software";

    //Phones & PDAs Menu
    public static final By PHONES_MENU = By.xpath("//a[text()='Phones & PDAs']");
    public static final String PHONES_URL = BASE_URL + "/index.php?route=product/category&path=24";
    public static final String PHONES_TITLE = "Phones & PDAs";

    //Cameras Menu
    public static final By CAMERAS_MENU = By.xpath("//a[text()='Cameras']");
    public static final String CAMERAS_URL = BASE_URL + "/index.php?route=product/category&path=33";
    public static final String CAMERAS_TITLE = "Cameras";

    //MP3 Players Menu
    public static final By MP3_PLAYERS_MENU = By.xpath("//a[text()='MP3 Players']");
    public static final By ALL_PLAYERS_MENU = By.xpath("//a[text()='Show All MP3 Players']");
    public static final String ALL_PLAYERS_URL = BASE_URL + "/index.php?route=product/category&path=34";
    public static final String ALL_PLAYERS_TITLE = "MP3 Players";


    @DataProvider(name = "navigationDataDropDown")
    public static Object[][] getNavMenuDataDropDown() {
        return new Object[][]{
                {BASE_URL, DESKTOP_MENU, ALL_DESKTOPS_MENU, DESKTOP_URL, DESKTOP_TITLE},
                {BASE_URL, LAPTOPS_MENU, ALL_LAPTOPS_MENU, ALL_LAPTOPS_URL, ALL_LAPTOPS_TITLE},
                {BASE_URL, COMPONENTS_MENU, ALL_COMPONENTS_MENU, ALL_COMPONENTS_URL, ALL_COMPONENTS_TITLE},
                {BASE_URL, MP3_PLAYERS_MENU, ALL_PLAYERS_MENU, ALL_PLAYERS_URL, ALL_PLAYERS_TITLE}
        };
    }

    @DataProvider(name = "navigationData")
    public static Object[][] getNavMenuData() {
        return new Object[][]{
                {BASE_URL, TABLETS_MENU, TABLETS_URL, TABLETS_TITLE},
                {BASE_URL, SOFTWARE_MENU, SOFTWARE_URL, SOFTWARE_TITLE},
                {BASE_URL, PHONES_MENU, PHONES_URL, PHONES_TITLE},
                {BASE_URL, CAMERAS_MENU, CAMERAS_URL, CAMERAS_TITLE}
        };
    }


    //Desktop menu options
    public static final By PC_MENU = By.xpath("//a[text()='PC (0)']");
    public static final String PC_URL = BASE_URL + "/index.php?route=product/category&path=20_26";
    public static final String PC_TITLE = "PC";
    public static final By MAC_MENU = By.xpath("//a[text()='Mac (1)']");
    public static final String MAC_URL = BASE_URL + "/index.php?route=product/category&path=20_27";
    public static final String MAC_TITLE = "Mac";

    @DataProvider(name = "navigationDesktop")
    public static Object[][] getNavMenuDesktop() {
        return new Object[][]{
                {BASE_URL, DESKTOP_MENU, PC_MENU, PC_URL, PC_TITLE},
                {BASE_URL, DESKTOP_MENU, MAC_MENU, MAC_URL, MAC_TITLE}
        };
    }

    // Products Pages
    public static final String APPLE_CINEMA_ID = "42";
    public static final String APPLE_BRAND = "Apple";
    public static final String APPLE_CINEMA_NAME = "Apple Cinema 30\"";
    public static final String APPLE_CINEMA_BREADCRUMBS = "Components Monitors Apple Cinema 30\"";
    public static final String APPLE_CINEMA_ALERT_MESSAGE = "You must login or create an account to save Apple Cinema 30\" to your wish list!\n×";





}
