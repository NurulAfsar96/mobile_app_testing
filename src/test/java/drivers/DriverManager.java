package drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DriverManager {
    private static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> getDriver() {
        return driver;
    }

    public static void setDriver(AndroidDriver<AndroidElement> driver) {
        DriverManager.driver = driver;
    }
}
