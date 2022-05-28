package config;

import com.codeborne.selenide.Configuration;



public interface WebDriverUtil {

    static void configure() {

        Configuration.browser = WebConfigProvider.config.browser();
        Configuration.browserVersion = WebConfigProvider.config.browserVersion();

        if (WebConfigProvider.config.remote() !=null) {
            Configuration.remote=WebConfigProvider.config.remote();
        }
    }
}
