package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import pages.Homepage;
import utilities.ExtentReportsUtil;
import utilities.ScreenshotUtil;

public class HomepageTest extends BaseDriver {
    private ExtentTest test;

    @Test
    public void dashboardTest() throws InterruptedException {
        test = ExtentReportsUtil.createTest("add to cart");
        Homepage hp = new Homepage();
        hp.scrollLast();
        test.pass("Successfully Scroll");
    }

    @AfterMethod
    public void tearDown() {
        String screenshotPath = ScreenshotUtil.captureScreenshot(test.getModel().getName());
        test.addScreenCaptureFromPath(screenshotPath);
        ExtentReportsUtil.flush();
    }
}
