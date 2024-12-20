package com.opencart.test;

import com.opencart.base.BaseTest;
import com.opencart.data.TestData;
import com.opencart.model.HomePage;
import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ProductPageTest extends BaseTest {
  @Test(
    groups = {"regression"},
    description = "Verify product name"
  )
  @Story("Product page")
  @Severity(SeverityLevel.NORMAL)
  public void testAppleCinemaName() {
    Allure.step("Open Base URL");
    getDriver().get(TestData.BASE_URL);
    String actualProductName = new HomePage(getDriver())
                                 .hoverOverComponentsTopMenu()
                                 .clickAllComponentsMenu()
                                 .clickMonitorsSideMenu()
                                 .clickProductImg(TestData.APPLE_CINEMA_ID)
                                 .getProductName();

    Allure.step("Verify actual " + actualProductName + " equals to " + TestData.APPLE_CINEMA_NAME);
    Assert.assertEquals(actualProductName, TestData.APPLE_CINEMA_NAME);
  }

  @Test(
    groups = {"regression"},
    description = "Verify breadcrumbs"
  )
  @Story("Product page")
  @Severity(SeverityLevel.MINOR)
  public void testAppleCinemaPath() {
    Allure.step("Open Base URL");
    getDriver().get(TestData.BASE_URL);
    String actualBreadCrumb = new HomePage(getDriver())
                                .hoverOverComponentsTopMenu()
                                .clickAllComponentsMenu()
                                .clickMonitorsSideMenu()
                                .clickProductImg(TestData.APPLE_CINEMA_ID)
                                .getBreadcrumbText();

    Allure.step("Verify actual " + actualBreadCrumb + " equals to " + TestData.APPLE_CINEMA_BREADCRUMBS);
    Assert.assertEquals(actualBreadCrumb, TestData.APPLE_CINEMA_BREADCRUMBS);
  }

  @Test(
    groups = {"smoke", "regression"},
    description = "Verify redirection to brand page"
  )
  @Story("Product page")
  @Severity(SeverityLevel.CRITICAL)
  public void testRedirectionToBrand() {
    Allure.step("Open Base URL");
    getDriver().get(TestData.BASE_URL);
    String actualBrandLink = new HomePage(getDriver())
                               .hoverOverComponentsTopMenu()
                               .clickAllComponentsMenu()
                               .clickMonitorsSideMenu()
                               .clickProductImg(TestData.APPLE_CINEMA_ID)
                               .clickBrandLink(TestData.APPLE_BRAND)
                               .getCurrentURL();

    Allure.step("Verify actual " + actualBrandLink + " equals to " + TestData.BASE_URL + "/index.php?route=product/manufacturer/info&manufacturer_id=8");
    Assert.assertEquals(actualBrandLink, TestData.BASE_URL + "/index.php?route=product/manufacturer/info&manufacturer_id=8");
  }

  @Test(
    groups = {"smoke", "regression"},
    description = "Verify required fields in adding to shopping cart"
  )
  @Story("Product page")
  @Severity(SeverityLevel.CRITICAL)
  public void testRequiredFields() {
    final List<String> expectedRequiredFields = List.of("Radio required!", "Checkbox required!",
      "Select required!", "Textarea required!", "File required!");
    Allure.step("Open Base URL");
    getDriver().get(TestData.BASE_URL);
    List<String> actualRequiredFields = new HomePage(getDriver())
                                          .hoverOverComponentsTopMenu()
                                          .clickAllComponentsMenu()
                                          .clickMonitorsSideMenu()
                                          .clickProductImg(TestData.APPLE_CINEMA_ID)
                                          .clickAddToCartButton()
                                          .getRequiredFields();

    Allure.step("Verify actual " + actualRequiredFields + " equals to " + expectedRequiredFields);
    Assert.assertEquals(actualRequiredFields, expectedRequiredFields);

  }

  @Test(
    groups = {"regression"},
    description = "Verify alert message while adding item to wishlist by unauthorised user"
  )
  @Story("Product page")
  @Severity(SeverityLevel.NORMAL)
  public void testAddWishListAlert() {
    getDriver().get(TestData.BASE_URL);
    String actualAlertMessage = new HomePage(getDriver())
                                  .hoverOverComponentsTopMenu()
                                  .clickAllComponentsMenu()
                                  .clickMonitorsSideMenu()
                                  .clickProductImg(TestData.APPLE_CINEMA_ID)
                                  .clickWishlistButton()
                                  .getWishlistAlertMessage();

    Allure.step("Verify actual " + actualAlertMessage + " equals to " + TestData.APPLE_CINEMA_ALERT_MESSAGE);
    Assert.assertEquals(actualAlertMessage, TestData.APPLE_CINEMA_ALERT_MESSAGE);
  }
}
