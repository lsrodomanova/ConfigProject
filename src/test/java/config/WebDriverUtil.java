package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.Config;


@Config.Sources({"system:properties",
        "classpath:config/WebConfig.properties"})

public interface WebDriverUtil {

    static void configure() {

        Configuration.browser = WebConfigProvider.config.browser();
        Configuration.browserVersion = WebConfigProvider.config.browserVersion();
        Configuration.remote = WebConfigProvider.config.remote();

    }
}
