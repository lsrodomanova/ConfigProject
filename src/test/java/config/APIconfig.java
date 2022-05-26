package config;

import org.aeonbits.owner.Config;

@Config.Sources({"system:properties",
        "classpath:config/APIConfig.properties"})

public interface APIconfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String baseUrl();

    @Key("token")
    String token();
}
