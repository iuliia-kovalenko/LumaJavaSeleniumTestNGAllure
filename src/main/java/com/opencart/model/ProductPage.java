package com.opencart.model;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.util.List;

public class ProductPage extends SubCategoryPage {
  @FindBy(tagName = "h1")
  private WebElement productName;
  @FindBy(className = "breadcrumb")
  private WebElement breadcrumb;

  @FindBy(xpath = "//li/a[text()='Apple']")
  private WebElement brandLink;

  @FindBy(id = "button-cart")
  private WebElement addToCartButton;

  @FindBy(css = ".form-group.required.has-error .text-danger")
  private List<WebElement> requiredFields;

  @FindBy(xpath = "//button[contains(@onclick, \"wishlist.add('42')\")]")
  private WebElement wishlistButton;

  @FindBy(xpath = "//div[contains(text(), 'You must')]")
  private WebElement wishlistAlert;

  @FindBy(id="button-upload222")
  private WebElement uploadButton;

  @FindBy(css="#form-upload input[type='file']")
  private WebElement addFileForm;

  protected ProductPage(WebDriver driver) {
    super(driver);
  }

  @Step("Get actual product name")
  public String getProductName() {
    return productName.getText();
  }

  @Step("Get actual breadcrumb text")
  public String getBreadcrumbText() {
    return breadcrumb.getText();
  }

  @Step("Click brand {brandName} link.")
  public BrandPage clickBrandLink(String brandName) {
    getDriver().findElement(By.xpath("//li/a[text()='" + brandName + "']")).click();

    return new BrandPage(getDriver());
  }

  @Step("Get actual list of all required fields.")
  public List<String> getRequiredFields() {
    getWait().until(ExpectedConditions.visibilityOfAllElements(requiredFields));

    System.out.println(requiredFields.stream().map(WebElement::getText).toList());
    return requiredFields.stream().map(WebElement::getText).toList();
  }

  @Step("Click button Add to Cart.")
  public ProductPage clickAddToCartButton() {
    getWait().until(ExpectedConditions.visibilityOf(addToCartButton));
    ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", addToCartButton);

    addToCartButton.click();

    return new ProductPage(getDriver());
  }

  @Step("Click button to add to wish list.")
  public ProductPage clickWishlistButton() {
    wishlistButton.click();

    return new ProductPage(getDriver());
  }

  @Step("Get actual alert message.")
  public String getWishlistAlertMessage() {
    getWait().until(ExpectedConditions.visibilityOfAllElements(wishlistAlert));

    return wishlistAlert.getText();
  }

  @Step("Upload file")
  public ProductPage uploadFile(String path){
    File file = new File(path);
    uploadButton.click();
    addFileForm.sendKeys(file.getAbsolutePath());

    getWait().until(ExpectedConditions.alertIsPresent());

    return new ProductPage(getDriver());
  }

  @Step("Get alert message of successful uploading")
  public String getAlertMessage(){
    return getDriver().switchTo().alert().getText();
  }

}
