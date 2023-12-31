package io.github.jaygandhi.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Builder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v114.log.Log;

import java.util.Objects;

/**
 * Created By Faisal Khatri on 21-03-2022
 */
@Builder
public class DevToolsManager {

    private static final Logger       LOG = LogManager.getLogger ("DevToolsSetup.class");
    private static       ChromeDriver chromeDriver;

    public static void createDriver () {

        WebDriverManager.chromedriver ()
            .setup ();
        ChromeOptions options = new ChromeOptions ();
        options.addArguments ("--no-sandbox");
        options.addArguments ("--disable-dev-shm-usage");
        options.addArguments ("--window-size=1050,600");
        options.addArguments ("--safebrowsing-disable-download-protection");

        chromeDriver = new ChromeDriver (options);
        DevTools chromeDevTools = chromeDriver.getDevTools ();
        chromeDevTools.createSession ();
        chromeDevTools.send (Log.enable ());
        chromeDevTools.addListener (Log.entryAdded (), logEntry -> {
            LOG.error (logEntry.getText ());
            LOG.error (logEntry.getLevel ());
        });
    }

    public static ChromeDriver getDriver () {
        return chromeDriver;
    }

    public static void quitDriver () {
        if (null != chromeDriver) {
            chromeDriver.quit ();
        }
    }
}