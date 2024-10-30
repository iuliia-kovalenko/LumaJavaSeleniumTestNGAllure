package com.opencarttest.model;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubCategoryPage extends SideMenu {
    protected SubCategoryPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click productId={productId}")
    public ProductPage clickProductImg(String productId) {
        getDriver().findElement(By.cssSelector(".image [href$='product_id=" + productId + "']")).click();

        return new ProductPage(getDriver());
    }
}
