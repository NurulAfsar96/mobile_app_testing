package pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.DriverManager;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.ScreenshotUtil;


public class Homepage {
    AndroidDriver<AndroidElement> driver;
    ExtentTest test;

    public Homepage(ExtentTest test) {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.test =test;
        
    }

    @AndroidFindBy(xpath = "//android.view.View[@index=4]")
    private AndroidElement lastItem;
    
    @AndroidFindBy(xpath ="//android.widget.Button[@index=1]")
    private AndroidElement okBtn;
    
	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Categories\"]/android.widget.Image")
	AndroidElement categoryOpt;
    
	public void scrollLast() throws InterruptedException, IOException {
		try {
			Thread.sleep(3000);
	        okBtn.click();
	        Thread.sleep(3000);

	        // Perform scrolling
	        String scrollDescription = "Attractive Handloom Cotton Silk Saree with Blouse piece 4.3 Attractive Handloom Cotton Silk Saree with Blouse piece ₹ 553";
	        @SuppressWarnings("unused")
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
	                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
	                + "new UiSelector().textContains(\"" + scrollDescription + "\").instance(0))"));
	     
	        Thread.sleep(3000);
	        @SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "ScrollSuccess");
	        String dest = System.getProperty("user.dir") + "/screenshots/" + "ScrollSuccess" + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        // Handle failures
	        test.fail("<p style=\"color:#ff3300; font-size:14px\"><b>Scrolling failed</b></p>");
	        
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "Scrolling failed");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ScrollingFailed.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			DriverManager.getDriver().quit();
	        
	    }
    }
	
	
	public void navigateCategoryPage() throws InterruptedException, IOException {
		try {
			categoryOpt.click();
	        Thread.sleep(3000);
	        test.pass("<p style=\"color:#29a329; font-size:14px\"><b>Successfully Navigate To Categories</b></p>");
	     
	        @SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "NavigateCategoryPage");
	        String dest = System.getProperty("user.dir") + "/screenshots/" + "NavigateCategoryPageSuccess" + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        // Handle failures
	        test.fail("<p style=\"color:#ff3300; font-size:14px\"><b>FailToNavigateCategories</b></p>");
	        
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "NavigateCategoryPageFailed");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NavigateCategoryPageFailed.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			DriverManager.getDriver().quit();
	        
	    }
    }

}
