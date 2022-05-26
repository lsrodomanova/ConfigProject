package config;

import org.aeonbits.owner.ConfigFactory;

public class WebConfigProvider {
    public static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());;
}
