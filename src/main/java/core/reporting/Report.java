package core.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
    private static final Report report = new Report();

    public static Report getReport() {
        return report;
    }

    ExtentReports extent = new ExtentReports();
    ExtentTest test;
    ExtentSparkReporter reporter;

    public void createTest(String suiteName, String testName) {
        reporter = new ExtentSparkReporter("reports/extent/" + suiteName + ".html");
        extent.attachReporter(reporter);
        test = extent.createTest(testName);
    }

    public void log(Status status, String msg) {
        test.log(status, msg);
    }

    public void log(Throwable exception) {
        test.fail(exception);
    }

    public void flush() {
        extent.flush();
    }
}
