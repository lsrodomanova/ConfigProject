package lubl;

import com.codeborne.selenide.Selenide;
import config.WebDriverConfigSelenoid;
import config.WebDriverUtil;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUp() {
        WebDriverUtil.configure();
    }

    @AfterEach
            void close() {
        Selenide.closeWebDriver();
    }
}
