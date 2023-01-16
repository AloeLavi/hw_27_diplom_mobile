package tests;
import com.codeborne.selenide.Configuration;
import config.RemoteConfig;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class TestBase {
    static RemoteConfig config = ConfigFactory.create(RemoteConfig.class, System.getProperties());

    @BeforeAll
    public static void setup() {

        System.out.println("ATTENTION, config: " + config.deviceHost());

      switch (config.deviceHost()) {
            case "local":
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
            case "remote":
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                break;
        }

        Configuration.browser = BrowserstackMobileDriver.class.getName();

        Configuration.browserSize = null;
    }

    @BeforeEach
    void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        closeWebDriver();
    }
}