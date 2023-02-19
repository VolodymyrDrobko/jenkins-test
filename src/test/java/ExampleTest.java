import org.testng.annotations.Test;

public class ExampleTest {

    @Test
    public void userNameTest() {
        System.out.println(System.getenv("username"));
    }

    @Test
    public void passwordTest() {
        System.out.println(System.getenv("password"));
    }

    @Test
    public void suiteNameTest() {
        System.out.println(System.getenv("suiteName"));
    }
}
