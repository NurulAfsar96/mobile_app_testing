package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import pages.Homepage;
import utilities.ExtentReportsUtil;

public class HomepageTest extends BaseDriver {
	ExtentReports report;
    ExtentTest parentTest;
    ExtentTest childTest;

    @Test(priority=0)
    public void dashboardTest() throws InterruptedException, IOException {
        report =ExtentReportsUtil.getInstance();
        parentTest = report.createTest("<p style=\"color:#ffcc00; font-size:22px\"><b>Cart App-HOME</b></p>").assignAuthor("Nurul Afsar").assignDevice("Pixel 6 pro");
    	childTest = parentTest.createNode("<p style=\"color:#9161AB; font-size:18px\"><b>HOMEPAGE TEST</b></p>");
  
        Homepage hp = new Homepage(childTest);
        hp.scrollLast();
        hp.navigateCategoryPage();
        
    }

    @AfterClass
    public void pushReport()
	{
		report.flush();
	}
    
}
