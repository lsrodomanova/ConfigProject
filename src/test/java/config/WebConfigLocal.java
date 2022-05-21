package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credentials.properties")

public interface WebConfigLocal extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("browserVersion")
    @DefaultValue("91.0")
    String browserVersion();

}
