package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import pages.Categorypage;
import utilities.ExtentReportsUtil;

public class CategorypageTest extends BaseDriver {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	@Test(priority=0)
	public void categorypageTest() throws InterruptedException, IOException{
		report =ExtentReportsUtil.getInstance();
        parentTest = report.createTest("<p style=\"color:#ffcc00; font-size:22px\"><b>Cart App-Categories</b></p>").assignAuthor("Nurul Afsar").assignDevice("Pixel 6 pro");
    	childTest = parentTest.createNode("<p style=\"color:#9161AB; font-size:18px\"><b>CATEGORIES TEST</b></p>");
  
        Categorypage cp = new Categorypage(childTest);
        cp.clickSearchBar();
        cp.clickWomen();
        cp.clickEthnicWear();
        cp.clickSarees();
        cp.selectSarees();
        cp.addtocart();
        cp.gotocart();
        cp.removeProduct();
        cp.navigateback();
	}
	@AfterClass
	public void pushReport() {
		report.flush();
	}

}
