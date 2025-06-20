package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentReportManager {
    static ExtentReports extent;

    public static ExtentReports getReportInstance() {
        if (extent == null) {
            // Create folder if not exists
            File reportDir = new File("Reports");
            if (!reportDir.exists()) {
                reportDir.mkdirs();
            }

            ExtentSparkReporter htmlReporter = new ExtentSparkReporter("Reports/ExtentReport.html");
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("Tester", "Umme Kulsoom");
            extent.setSystemInfo("Environment", "QA");
        }
        return extent;
    }
}
