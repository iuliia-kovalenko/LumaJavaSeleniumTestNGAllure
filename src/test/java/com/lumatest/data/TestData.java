package com.lumatest.data;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class TestData {
    public static final String BASE_URL = "https://magento.softwaretestingboard.com";
    public static final String BASE_URL_TITLE = "Home Page";

    //NavBar Menu
    public static final By WHATS_NEW_MENU = By.id("ui-id-3");
    public static final String WHATS_NEW_URL = BASE_URL + "/what-is-new.html";
    public static final String WHATS_NEW_TITLE = "What's New";

    //Women Menu ui-id-4
    public static final By WOMEN_MENU = By.id("ui-id-4");
    public static final String WOMEN_URL = BASE_URL + "/women.html";
    public static final String WOMEN_TITLE = "Women";

    //Men menu
    public static final By MEN_MENU = By.id("ui-id-5");
    public static final String MEN_URL = BASE_URL + "/men.html";
    public static final String MEN_TITLE = "Men";

    //Gear menu
    public static final By GEAR_MENU = By.id("ui-id-6");
    public static final String GEAR_URL = BASE_URL + "/gear.html";
    public static final String GEAR_TITLE = "Gear";

    //Training Menu
    public static final By TRAINING_MENU = By.id("ui-id-7");
    public static final String TRAINING_URL = BASE_URL + "/training.html";
    public static final String TRAINING_TITLE = "Training";

    //Sale Menu
    public static final By SALE_MENU = By.id("ui-id-8");
    public static final String SALE_URL = BASE_URL + "/sale.html";
    public static final String SALE_TITLE = "Sale";

    // Allure.step("SetUp expected results");
    @DataProvider(name = "navigationData")
    public static Object[][] getNavMenuData() {
        return new Object[][]{
                {BASE_URL, WHATS_NEW_MENU, WHATS_NEW_URL, WHATS_NEW_TITLE},
                {BASE_URL, WOMEN_MENU, WOMEN_URL, WOMEN_TITLE},
                {BASE_URL, MEN_MENU, MEN_URL, MEN_TITLE},
                {BASE_URL, GEAR_MENU, GEAR_URL, GEAR_TITLE},
                {BASE_URL, TRAINING_MENU, TRAINING_URL, TRAINING_TITLE},
                {BASE_URL, SALE_MENU, SALE_URL, SALE_TITLE}
        };
    }

    //Women menu options
    public static final By TOPS_MENU = By.id("ui-id-9");
    public static final String TOPS_URL = BASE_URL + "/women/tops-women.html";
    public static final String TOPS_TITLE = "Tops - Women";
    public static final By JACKETS_MENU = By.id("ui-id-11");
    public static final String JACKETS_URL = BASE_URL + "/women/tops-women/jackets-women.html";
    public static final String JACKETS_TITLE = "Jackets - Tops - Women";
    public static final By HOODIES_MENU = By.id("ui-id-12");
    public static final String HOODIES_URL = BASE_URL + "/women/tops-women/hoodies-and-sweatshirts-women.html";
    public static final String HOODIES_TITLE = "Hoodies & Sweatshirts - Tops - Women";
    public static final By TEES_MENU = By.id("ui-id-13");
    public static final String TEES_URL = BASE_URL + "/women/tops-women/tees-women.html";
    public static final String TEES_TITLE = "Tees - Tops - Women";
    public static final By BRAS_MENU = By.id("ui-id-14");
    public static final String BRAS_URL = BASE_URL + "/women/tops-women/tanks-women.html";
    public static final String BRAS_TITLE = "Bras & Tanks - Tops - Women";
    public static final By BOTTOMS_MENU = By.id("ui-id-10");
    public static final String BOTTOMS_URL = BASE_URL + "/women/bottoms-women.html";
    public static final String BOTTOMS_TITLE = "Bottoms - Women";
    public static final By PANTS_MENU = By.id("ui-id-15");
    public static final String PANTS_URL = BASE_URL + "/women/bottoms-women/pants-women.html";
    public static final String PANTS_TITLE = "Pants - Bottoms - Women";
    public static final By SHORTS_MENU = By.id("ui-id-16");
    public static final String SHORTS_URL = BASE_URL + "/women/bottoms-women/shorts-women.html";
    public static final String SHORTS_TITLE = "Shorts - Bottoms - Women";

    //Men menu options
    public static final By TOPS_MEN_MENU = By.id("ui-id-17");
    public static final String TOPS_MEN_URL = BASE_URL + "/men/tops-men.html";
    public static final String TOPS_MEN_TITLE = "Tops - Men";
    public static final By JACKETS_MEN_MENU = By.id("ui-id-19");
    public static final String JACKETS_MEN_URL = BASE_URL + "/men/tops-men/jackets-men.html";
    public static final String JACKETS_MEN_TITLE = "Jackets - Tops - Men";
    public static final By HOODIES_MEN_MENU = By.id("ui-id-20");
    public static final String HOODIES_MEN_URL = BASE_URL + "/men/tops-men/hoodies-and-sweatshirts-men.html";
    public static final String HOODIES_MEN_TITLE = "Hoodies & Sweatshirts - Tops - Men";
    public static final By TEES_MEN_MENU = By.id("ui-id-21");
    public static final String TEES_MEN_URL = BASE_URL + "/men/tops-men/tees-men.html";
    public static final String TEES_MEN_TITLE = "Tees - Tops - Men";
    public static final By TANKS_MENU = By.id("ui-id-22");
    public static final String TANKS_URL = BASE_URL + "/men/tops-men/tanks-men.html";
    public static final String TANKS_TITLE = "Tanks - Tops - Men";
    public static final By BOTTOMS_MEN_MENU = By.id("ui-id-18");
    public static final String BOTTOMS_MEN_URL = BASE_URL + "/men/bottoms-men.html";
    public static final String BOTTOMS_MEN_TITLE = "Bottoms - Men";
    public static final By PANTS_MEN_MENU = By.id("ui-id-23");
    public static final String PANTS_MEN_URL = BASE_URL + "/men/bottoms-men/pants-men.html";
    public static final String PANTS_MEN_TITLE = "Pants - Bottoms - Men";
    public static final By SHORTS_MEN_MENU = By.id("ui-id-24");
    public static final String SHORTS_MEN_URL = BASE_URL + "/men/bottoms-men/shorts-men.html";
    public static final String SHORTS_MEN_TITLE = "Shorts - Bottoms - Men";

    //Gear Menu

    public static final By GEAR_BAGS_MENU = By.id("ui-id-25");
    public static final String GEAR_BAGS_URL = BASE_URL + "/gear/bags.html";
    public static final String GEAR_BAGS_TITLE = "Bags - Gear";
    public static final By GEAR_FITNESS_MENU = By.id("ui-id-26");
    public static final String GEAR_FITNESS_URL = BASE_URL + "/gear/fitness-equipment.html";
    public static final String GEAR_FITNESS_TITLE = "Fitness Equipment - Gear";
    public static final By GEAR_WATCHES_MENU = By.id("ui-id-27");
    public static final String GEAR_WATCHES_URL = BASE_URL + "/gear/watches.html";
    public static final String GEAR_WATCHES_TITLE = "Watches - Gear";

    // Training Menu
    public static final By TRAINING_VIDEO_DOWNLOAD_MENU = By.id("ui-id-28");
    public static final String TRAINING_VIDEO_DOWNLOAD_URL = BASE_URL + "/training/training-video.html";
    public static final String TRAINING_VIDEO_DOWNLOAD_TITLE = "Video Download - Training";



    @DataProvider(name = "navigationGearMenu")
    public static Object[][] getNavGearMenuData() {
        return new Object[][]{
                {BASE_URL, GEAR_BAGS_MENU, GEAR_BAGS_URL, GEAR_BAGS_TITLE},
                {BASE_URL, GEAR_FITNESS_MENU, GEAR_FITNESS_URL, GEAR_FITNESS_TITLE},
                {BASE_URL, GEAR_WATCHES_MENU, GEAR_WATCHES_URL, GEAR_WATCHES_TITLE}
        };
    }




    @DataProvider(name = "navigationSubMenuDataWomen")
    public static Object[][] getNavSubMenuData() {
        return new Object[][]{
                {BASE_URL, TOPS_MENU, TOPS_URL, TOPS_TITLE},
                {BASE_URL, BOTTOMS_MENU, BOTTOMS_URL, BOTTOMS_TITLE}
        };
    }


    @DataProvider(name = "navigationSubMenuDataMen")
    public static Object[][] getNavSubMenuDataMen() {
        return new Object[][]{
                {BASE_URL, TOPS_MEN_MENU, TOPS_MEN_URL, TOPS_MEN_TITLE},
                {BASE_URL, BOTTOMS_MEN_MENU, BOTTOMS_MEN_URL, BOTTOMS_MEN_TITLE}
        };
    }

    @DataProvider(name = "navigationSubMenuDataWomenTops")
    public static Object[][] getNavSubMenuDataSecondLevelTopsWomen() {
        return new Object[][]{
                {BASE_URL, JACKETS_MENU, JACKETS_URL, JACKETS_TITLE},
                {BASE_URL, HOODIES_MENU, HOODIES_URL, HOODIES_TITLE},
                {BASE_URL, TEES_MENU, TEES_URL, TEES_TITLE},
                {BASE_URL, BRAS_MENU, BRAS_URL, BRAS_TITLE}
             };
    }

    @DataProvider(name = "navigationSubMenuDataWomenBottoms")
    public static Object[][] getNavSubMenuDataSecondLevelBottomsWomen() {
        return new Object[][]{
                {BASE_URL, PANTS_MENU, PANTS_URL, PANTS_TITLE},
                {BASE_URL, SHORTS_MENU, SHORTS_URL, SHORTS_TITLE}
        };
    }

    @DataProvider(name = "navigationSubMenuDataMenTops")
    public static Object[][] getNavSubMenuDataSecondLevelTopsMen() {
        return new Object[][]{
                {BASE_URL, JACKETS_MEN_MENU, JACKETS_MEN_URL, JACKETS_MEN_TITLE},
                {BASE_URL, HOODIES_MEN_MENU, HOODIES_MEN_URL, HOODIES_MEN_TITLE},
                {BASE_URL, TEES_MEN_MENU, TEES_MEN_URL, TEES_MEN_TITLE},
                {BASE_URL, TANKS_MENU, TANKS_URL, TANKS_TITLE}

        };
    }

    @DataProvider(name = "navigationSubMenuDataMenBottoms")
    public static Object[][] getNavSubMenuDataSecondLevelBottomsMen() {
        return new Object[][]{
                {BASE_URL, PANTS_MEN_MENU, PANTS_MEN_URL, PANTS_MEN_TITLE},
                {BASE_URL, SHORTS_MEN_MENU, SHORTS_MEN_URL, SHORTS_MEN_TITLE}
        };
    }


}
