package com.opencart.test;

import com.opencart.base.BaseTest;
import com.opencart.base.TestUtils;
import com.opencart.data.TestData;
import com.opencart.model.HomePage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test(
        groups = {"regression"},
        description = "Verify uploading file"
    )
    @Story("Product page upload file")
    @Severity(SeverityLevel.NORMAL)
    public void uploadFile() {
        getDriver().get(TestData.BASE_URL);
        String actualAlertMessage = new HomePage(getDriver())
            .hoverOverComponentsTopMenu()
            .clickAllComponentsMenu()
            .clickMonitorsSideMenu()
            .clickProductImg(TestData.APPLE_CINEMA_ID)
            .uploadFile(TestData.PATH_TO_FILE)
            .getAlertMessage();

        Assert.assertEquals(actualAlertMessage, "Your file was successfully uploaded!");
    }


}
