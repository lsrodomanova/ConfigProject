package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("classpath:config/credentials.properties")

public interface WebDriverUtil {
    WebDriverConfigSelenoid config = ConfigFactory.create(WebDriverConfigSelenoid.class, System.getProperties());

    static void configure() {
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();
        Configuration.remote = config.remote();


        if (System.getProperty("typeProperties").equals("remote")) {
            Configuration.remote = config.remote();
        }
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();
    }
}
