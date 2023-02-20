package test;

import org.testng.annotations.Test;

public class ExampleTest extends BaseTest {

    @Test
    public void userNameTest() {
        System.out.println(System.getenv("User Name"));
    }

    @Test
    public void passwordTest() {
        System.out.println(System.getenv("Password"));
    }

    @Test
    public void suiteNameTest() {
        System.out.println(System.getenv("Suite"));
    }
}
