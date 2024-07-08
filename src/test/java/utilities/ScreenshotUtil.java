package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScreenshotUtil {
    public static String captureScreenshot(AndroidDriver<AndroidElement> driver, String ScreenshotName) throws IOException 
    {
    	 TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 String dest = System.getProperty("user.dir") + "\\screenshots\\" + ScreenshotName + ".png";
		 File destination = new File(dest);
		 FileUtils.copyFile(source, destination);
		 return dest;	

    }
}
