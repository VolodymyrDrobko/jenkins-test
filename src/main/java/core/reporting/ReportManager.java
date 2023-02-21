package core.reporting;

import com.aventstack.extentreports.Status;

public class ReportManager {

    public static void createTest(String suiteName, String testName) {
        Report.getReport().createTest(suiteName, testName);
    }

    public static void info(String msg) {
        Report.getReport().log(Status.INFO, msg);
    }

    public static void pass(String msg) {
        Report.getReport().log(Status.PASS, msg);
    }

    public static void fail(String msg) {
        Report.getReport().log(Status.FAIL, msg);
    }

    public static void fail(Throwable exception) {
        Report.getReport().log(exception);
    }

    public static void skip(String msg) {
        Report.getReport().log(Status.SKIP, msg);
    }

    public static void flush() {
        Report.getReport().flush();
    }
}
