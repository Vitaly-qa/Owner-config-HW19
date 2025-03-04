package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface ConfigData extends Config {

    @org.aeonbits.owner.Config.Key("browser")
    @org.aeonbits.owner.Config.DefaultValue("chrome")
    String browser();

    @org.aeonbits.owner.Config.Key("browserVersion")
    @org.aeonbits.owner.Config.DefaultValue("120.0")
    String browserVersion();

    @org.aeonbits.owner.Config.Key("browserSize")
    @org.aeonbits.owner.Config.DefaultValue("1920x1080")
    String browserSize();

    @org.aeonbits.owner.Config.Key("baseUrl")
    @org.aeonbits.owner.Config.DefaultValue("https://github.com")
    String baseUrl();

    @org.aeonbits.owner.Config.Key("isRemote")
    @org.aeonbits.owner.Config.DefaultValue("false")
    boolean isRemote();

    @org.aeonbits.owner.Config.Key("remoteUrl")
    @org.aeonbits.owner.Config.DefaultValue("https://github.com")
    String remoteUrl();
}


