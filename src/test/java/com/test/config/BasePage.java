package com.test.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver = null;

    public void webDriver() {

        try {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            ChromeOptions option = new ChromeOptions();
            option.addArguments(new String[]{"enable-automation"});
            option.addArguments(new String[]{"--disable-popup-blocking"});
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability("goog:chromeOptions",option);
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
    }


}
