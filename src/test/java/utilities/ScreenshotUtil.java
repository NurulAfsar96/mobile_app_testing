package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import drivers.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScreenshotUtil {
    public static String captureScreenshot(String testName) {
        String screenshotPath = "screenshots/" + testName + ".png";
        AndroidDriver<AndroidElement> driver = DriverManager.getDriver();
        File srcFile = driver.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(screenshotPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return screenshotPath;
    }
}
