package test;

import core.reporting.ReportManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Listener implements ITestListener {

    private String suiteName;
    private String testName;

    private static String getTimeStamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        return dateFormat.format(new Date());
    }


    @Override
    public void onStart(ITestContext iTestContext) {
        suiteName = iTestContext.getSuite().getName();
    }

    @Override
    public void onTestStart(ITestResult result) {
        testName = result.getMethod().getMethodName();
        ReportManager.createTest(suiteName, testName);
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        ReportManager.pass(testName + " - PASSED");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        ReportManager.fail(testName + " - FAILED");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        ReportManager.skip(testName + " - SKIPPED");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        ReportManager.flush();
    }
}
