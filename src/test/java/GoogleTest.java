import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @BeforeClass
    public static void setup() {
        Configuration.baseUrl = "http://google.com/";
        Configuration.browser = "firefox";
    }

    @Test
    public void userCanSearch() {
        open("/");
        $(By.name("q")).val("selenide").pressEnter();
    }

    @AfterClass
    public static void shutDown() {
        closeWebDriver();
    }
}
