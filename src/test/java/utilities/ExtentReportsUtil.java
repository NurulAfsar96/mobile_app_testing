
package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsUtil {
    private static ExtentReports report;
    private static ExtentSparkReporter sparkReporter;
   
    public synchronized static ExtentReports getInstance() {
        if (report == null) {
            report = new ExtentReports();
            sparkReporter = new ExtentSparkReporter("reports/AppTestingExtentReport.html");
            sparkReporter.config().setReportName("CartApp Appium Testing Report");
            report.attachReporter(sparkReporter);
        }
        return report;
    }
}
