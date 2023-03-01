package test;

import core.reporting.ReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest extends BaseTest {

    @Test
    public void userNameTest() {
        System.out.println(System.getenv("APP_CREDENTIALS_USR"));
    }

    @Test
    public void passwordTest() {
        System.out.println(System.getenv("APP_CREDENTIALS_PSW"));
        ReportManager.info("This assertion have to fail");
        Throwable exception = new RuntimeException("A runtime exception");
        ReportManager.fail(exception);
        Assert.assertTrue(false, "This assertion have to fail");
    }

    @Test
    public void suiteNameTest() {
        System.out.println(System.getenv("Suite"));
    }
}
