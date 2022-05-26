package config;

import org.aeonbits.owner.ConfigFactory;

public class ApiConfigProvider {
    public static APIconfig apiConfig = ConfigFactory.create(APIconfig.class, System.getProperties());
}
