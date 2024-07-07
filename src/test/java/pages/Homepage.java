package pages;

import org.openqa.selenium.support.PageFactory;
import drivers.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepage {
    private AndroidDriver<AndroidElement> driver;

    public Homepage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        
    }

    @AndroidFindBy(xpath = "//android.view.View[@index=4]")
    private AndroidElement lastItem;
    
    @AndroidFindBy(xpath ="//android.widget.Button[@index=1]")
    private AndroidElement okBtn;
    
	public void scrollLast() throws InterruptedException {
    	okBtn.click();
    	Thread.sleep(3000);

    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Attractive Handloom Cotton Silk Saree with Blouse piece 4.3 Attractive Handloom Cotton Silk Saree with Blouse piece ₹ 553\").instance(0))");
    	
    }

}
