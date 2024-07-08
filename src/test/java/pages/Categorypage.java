package pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.ScreenshotUtil;

public class Categorypage {
	AndroidDriver<AndroidElement> driver;
	ExtentTest test;
	
	
	public Categorypage(ExtentTest test) 
	{
		this.driver = DriverManager.getDriver();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.test = test;
	}

	@AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Categories\"]/android.widget.Image")
	AndroidElement categoryOpt;
	
	@AndroidFindBy(className ="android.widget.EditText")
	AndroidElement searchOpt;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@text=\"Women\"]")
	AndroidElement womenOpt;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@text=\"Digital Products\"]")
	AndroidElement digitalProductOpt;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@text=\"Ethnic Wear\"]")
	AndroidElement ethnicwearOpt;
	
	@AndroidFindBy(xpath ="(//android.view.View[@content-desc=\"Sarees\"])[2]/android.widget.TextView")
	AndroidElement sareesOpt;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@index=2]")
	AndroidElement selectSaree;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@text=\" Add To Cart\"]")
	AndroidElement addtoCartOpt;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@text=\"Go To Cart\"]")
	AndroidElement gotoCartOpt;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@text=\"REMOVE\"]")
	AndroidElement removeBtn;
	
	public void clickSearchBar() throws InterruptedException, IOException {
		try {
			Thread.sleep(3000);
			searchOpt.click();
	        Thread.sleep(3000);
	        test.pass("<p style=\"color:#29a329; font-size:14px\"><b>Successfully Click on Searchbar</b></p>");
	     
	        @SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "ClickOnSearch");
	        String dest = System.getProperty("user.dir") + "/screenshots/" + "ClickOnSearchSuccess" + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        // Handle failures
	        test.fail("<p style=\"color:#ff3300; font-size:14px\"><b>FailToClickOnSearch</b></p>");
	        
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "ClickOnSearchFailed");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnSearchFailed.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			DriverManager.getDriver().quit();
	        
	    }
    }
	
	public void clickWomen() throws InterruptedException, IOException {
		try {
			womenOpt.click();
	        Thread.sleep(3000);
	        test.pass("<p style=\"color:#29a329; font-size:14px\"><b>Successfully Click Women</b></p>");
	     
	        @SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "ClickWomen");
	        String dest = System.getProperty("user.dir") + "/screenshots/" + "Click Women Success" + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        // Handle failures
	        test.fail("<p style=\"color:#ff3300; font-size:14px\"><b>FailToClickWomen</b></p>");
	        
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "ClickWomenFailed");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickWomenFailed.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			DriverManager.getDriver().quit();
	        
	    }
    }
	
	public void clickEthnicWear() throws InterruptedException, IOException {
		try {
			ethnicwearOpt.click();
	        Thread.sleep(3000);
	        test.pass("<p style=\"color:#29a329; font-size:14px\"><b>Successfully Click EthnicWear</b></p>");
	     
	        @SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "ClickEthnicWear");
	        String dest = System.getProperty("user.dir") + "/screenshots/" + "Click EthnicWear Success" + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        // Handle failures
	        test.fail("<p style=\"color:#ff3300; font-size:14px\"><b>FailToClickEthnicWear</b></p>");
	        
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "ClickEthnicWearFailed");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickEthnicWearFailed.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			DriverManager.getDriver().quit();
	        
	    }
    }
	
	public void clickSarees() throws InterruptedException, IOException {
		try {
			sareesOpt.click();
	        Thread.sleep(3000);
	        test.pass("<p style=\"color:#29a329; font-size:14px\"><b>Successfully Click Sarees</b></p>");
	     
	        @SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "ClickSarees");
	        String dest = System.getProperty("user.dir") + "/screenshots/" + "Click Sarees Success" + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        // Handle failures
	        test.fail("<p style=\"color:#ff3300; font-size:14px\"><b>FailToClickSarees</b></p>");
	        
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "ClickSareesFailed");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickSareesFailed.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			DriverManager.getDriver().quit();
	        
	    }
    }
	
	public void selectSarees() throws InterruptedException, IOException {
		try {
			selectSaree.click();
	        Thread.sleep(3000);
	        test.pass("<p style=\"color:#29a329; font-size:14px\"><b>Successfully Select Sarees</b></p>");
	     
	        @SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "SelectSarees");
	        String dest = System.getProperty("user.dir") + "/screenshots/" + "Select Sarees Success" + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        // Handle failures
	        test.fail("<p style=\"color:#ff3300; font-size:14px\"><b>FailToSelectSarees</b></p>");
	        
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "SelectSareesFailed");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SelectSareesFailed.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			DriverManager.getDriver().quit();
	        
	    }
    }
	
	public void addtocart() throws InterruptedException, IOException {
		try {
			addtoCartOpt.click();
	        Thread.sleep(3000);
	        test.pass("<p style=\"color:#29a329; font-size:14px\"><b>Successfully Add To Cart</b></p>");
	     
	        @SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "Add To Cart");
	        String dest = System.getProperty("user.dir") + "/screenshots/" + "Add to Cart Success" + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        // Handle failures
	        test.fail("<p style=\"color:#ff3300; font-size:14px\"><b>FailedAddToCart</b></p>");
	        
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "FailedAddToCart");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FailedAddToCart.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			DriverManager.getDriver().quit();
	        
	    }
    }
	
	public void gotocart() throws InterruptedException, IOException {
		try {
			gotoCartOpt.click();
	        Thread.sleep(3000);
	        test.pass("<p style=\"color:#29a329; font-size:14px\"><b>Successfully Go to cart</b></p>");
	     
	        @SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "Go To Cart");
	        String dest = System.getProperty("user.dir") + "/screenshots/" + "Go to Cart Success" + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        // Handle failures
	        test.fail("<p style=\"color:#ff3300; font-size:14px\"><b>FailedGoToCart</b></p>");
	        
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "FailedGoToCart");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FailedGoToCart.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			DriverManager.getDriver().quit();
	        
	    }
    }
	
	public void removeProduct() throws InterruptedException, IOException {
		try {
			removeBtn.click();
	        Thread.sleep(3000);
	        test.pass("<p style=\"color:#29a329; font-size:14px\"><b>Successfully Remove Product</b></p>");
	     
	        @SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "Remove Product");
	        String dest = System.getProperty("user.dir") + "/screenshots/" + "Remove Product Success" + ".png";
	        test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
	    } catch (Exception e) {
	        // Handle failures
	        test.fail("<p style=\"color:#ff3300; font-size:14px\"><b>Failed Remove Product</b></p>");
	        
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenshotPath = ScreenshotUtil.captureScreenshot(DriverManager.getDriver(), "FailedRemoveProduct");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FailedRemoveProduct.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			DriverManager.getDriver().quit();
	        
	    }
    }
	
	public void navigateback() throws InterruptedException {
		
			driver.navigate().back();
	        Thread.sleep(3000);
	       }
    }
	
	

