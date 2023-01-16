package config;
import org.aeonbits.owner.Config;
@Config.LoadPolicy(Config.LoadType.MERGE)

@Config.Sources({
        "classpath:properties/remote.properties"

})

public interface RemoteConfig extends Config {


    @Key("user")
    String user();

    @Key("key")
    String key();

    @Key("app")
    String app();

    @Key ("device")
    String device();

    @Key ("osVersion")
    String osVersion();

    @Key("project")
    String project();

    @Key("build")
    String build();

    @Key("name")
    String name();

    @Key("baseUrl")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String baseUrl();

    @Key("deviceHost")
    @DefaultValue("remote")
    String deviceHost();


}
