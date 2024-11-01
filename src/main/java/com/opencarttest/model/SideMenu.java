package com.opencarttest.model;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

abstract class SideMenu extends TopMenu {
  protected SideMenu(WebDriver driver) {
    super(driver);
  }


  @FindBy(xpath = "//aside[@id='column-left']//a[contains(text(), 'Monitors')]")
  private WebElement monitorsSideMenu;

  @Step("Click Monitors on left-side Menu")
  public ProductPage clickMonitorsSideMenu() {
    monitorsSideMenu.click();

    return new ProductPage(getDriver());
  }
}
