package com.opencarttest.model;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

abstract class TopMenu extends BasePage {
    protected TopMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Components']")
    private WebElement componentsTopMenu;
    @FindBy(xpath = "//a[text()='Show All Components']")
    private WebElement allComponentsMenu;

    @Step("Click Show all Components in dropdown menu.")
    public SubCategoryPage clickAllComponentsMenu() {
        allComponentsMenu.click();

        return new SubCategoryPage(getDriver());
    }

    @Step("Hover over Components Top Menu.")
    public HomePage hoverOverComponentsTopMenu() {
        hoverOverElement(componentsTopMenu);

        return new HomePage(getDriver());
    }
}
