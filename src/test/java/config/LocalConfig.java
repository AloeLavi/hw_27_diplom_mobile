package config;
import org.aeonbits.owner.Config;

@Config.Sources({"classpath:properties/local.properties"})
public interface LocalConfig extends Config {


    @Key ("device")
    String device();

    @Key ("osVersion")
    String osVersion();


}
