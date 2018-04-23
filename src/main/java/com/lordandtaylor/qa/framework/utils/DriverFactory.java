package com.lordandtaylor.qa.framework.utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Hema on  3/9/2018
 */
public class DriverFactory  {

    private static DriverFactory instance = null;

    public static final String USERNAME = "hemaahmad1";
    public static final String AUTOMATE_KEY = "hSiW1nmuWsDrPpu9mUn7";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub"; //This selenium cloud Hub address from BrowserStack.
    //public static final String LOCAL_GRID_URL = "http://10.10.20.70:4444/wd/hub";


    private DriverFactory() {
        //Do-nothing..Do not allow to initialize this class from outside
    }

    public static DriverFactory getInstance()
    {
        if(instance == null){
            instance = new DriverFactory();
        }
        return instance;
    }
    public static DriverFactory getInstance(String browserName)
    {
        if(instance == null){
            instance = new DriverFactory();
        }

    /*    FirefoxDriverManager.getInstance().setup();
        ChromeDriverManager.getInstance().setup();
*/
        if(browserName.equalsIgnoreCase("chrome")){
            ChromeDriverManager.getInstance().setup();
            instance.driver.set(new ChromeDriver());
        }
        else if(browserName.equalsIgnoreCase("firefox")){
            FirefoxDriverManager.getInstance().setup();
            instance.driver.set(new FirefoxDriver());
        }
        else if(browserName.equalsIgnoreCase("cloud_chrome_64")){
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "64.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "7");
            caps.setCapability("resolution", "1920x1080");
            caps.setCapability("browserstack.debug", "true");
            caps.setCapability("browserstack.networkLogs", "true");

            try {
                instance.driver.set(new RemoteWebDriver(new URL(URL), caps));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        else if(browserName.equalsIgnoreCase("cloud_ie_11")){
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "IE");
            caps.setCapability("browser_version", "11.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "7");
            caps.setCapability("resolution", "1920x1080");
            caps.setCapability("browserstack.debug", "true");
            caps.setCapability("browserstack.networkLogs", "true");

            try {
                instance.driver.set(new RemoteWebDriver(new URL(URL), caps));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        /*}else if(browserName.equalsIgnoreCase("grid_chrome_16")){
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setPlatform(Platform.ANY);
            caps.setBrowserName("chrome");
            try {
                instance.driver.set(new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        else if(browserName.equalsIgnoreCase("grid_firefox_16")){
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setPlatform(Platform.ANY);
            caps.setBrowserName("firefox");
            try {
                instance.driver.set(new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        else if(browserName.equalsIgnoreCase("grid_ie_16")){
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setPlatform(Platform.ANY);
            caps.setBrowserName("internet explorer");
            try {
                instance.driver.set(new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }*/
        }
        return instance;
    }

    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() // thread local driver object for webdriver
    {
        @Override
        protected WebDriver initialValue()
        {
            ChromeDriverManager.getInstance().setup();
            return new ChromeDriver();
            //return null;
        }
    };
    public WebDriver getDriver() // call this method to get the driver object and launch the browser
    {
        return driver.get();
    }
    public void removeDriver() // Quits the driver and closes the browser
    {
        driver.get().quit();
        driver.remove();
    }
}

