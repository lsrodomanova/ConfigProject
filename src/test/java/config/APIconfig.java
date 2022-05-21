package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credentials.properties")
public interface APIconfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String baseUrl();

    @Key("token")
    String token();
}
