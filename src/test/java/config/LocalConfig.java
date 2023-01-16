package config;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:local.properties"})
public interface LocalConfig extends Config {


    @Key ("device")
    String device();

    @Key ("osVersion")
    String osVersion();


}
