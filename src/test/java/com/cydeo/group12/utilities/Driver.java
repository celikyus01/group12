package com.cydeo.group12.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver() {}

    private static WebDriver driver;

    public static WebDriver get() {
        String browserName = ConfigurationReader.get("browser");

        if (driver == null) {
            switch (browserName.toLowerCase()) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(DesiredCapabilities.setChromeOptions());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    Assert.fail("No matching browser found in the configuration.properties");
                    break;
            }
        }
        return driver;
    }


}
