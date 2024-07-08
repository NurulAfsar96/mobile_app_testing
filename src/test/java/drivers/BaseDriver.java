package drivers;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseDriver {
    protected AndroidDriver<AndroidElement> driver;

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        File f = new File("src");
        File file = new File(f, "AddToCart.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("deviceName", "Tester");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("autoGrantPermissions", true);
        cap.setCapability("app", file.getAbsolutePath());

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Set the driver instance in DriverManager
        DriverManager.setDriver(driver);
       
    }

    @AfterSuite
    public void closeApp() 
    	{
            DriverManager.getDriver().quit();
        }
 }

