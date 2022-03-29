package com.cydeo.group12.utilities;

import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilities {
    static ChromeOptions options = new ChromeOptions();

    public static ChromeOptions setChromeOptions() {
        options.addArguments("start-maximized");
        options.addArguments("disable-extensions");
        return options;
    }

}
