package config;

import org.aeonbits.owner.Config;

@Config.Sources({"system:properties",
        "classpath:config/WebConfig.properties"})

public interface WebConfig extends Config {


    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("browserVersion")
    @DefaultValue("91.0")
    String browserVersion();

    @Key("remote")
    String remote();

}
