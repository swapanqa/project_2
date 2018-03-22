package com.lordandtaylor.qa.framework.utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
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
public class DriverFactory {

    private static DriverFactory instance = null; //declare DriverFactory variable.

    //1.CloudTest-To execute in Cloud, need these credentials from BrowserStack.com.
    public static final String USERNAME = "hemaahmad1";
    public static final String AUTOMATE_KEY = "hSiW1nmuWsDrPpu9mUn7";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub"; //This selenium cloud Hub address from BrowserStack.


    private DriverFactory() {
        //Constructor. Making it private will not allow this class to be initialized from outside. We only need 1 instance of DriverFactory.
    }

    public static DriverFactory getInstance() //getter for private variable instance. Can get instance only from inside this class since constructor is private.
    {
        if(instance == null){ //if the instance is null...
            instance = new DriverFactory(); //...create new instance of DriverFactory.
        }
        return instance;
    }
    public static DriverFactory getInstance(String browserName) //Overloaded method, used for parallel exe, which has browserName as parameter.
    {
        if(instance == null){
            instance = new DriverFactory();
        }

        FirefoxDriverManager.getInstance().setup(); //get instance of specific FireFox browser,default will be chrome if not specified, because of code just below.
        ChromeDriverManager.getInstance().setup(); //get instance of specific Chrome browser, ,default will be chrome if not specified, because of code just below.

        if(browserName.equalsIgnoreCase("chrome")){ //if statement to set instance of whatever browser is passes as parameter.
            instance.driver.set(new ChromeDriver());
        }
        else if(browserName.equalsIgnoreCase("firefox")){
            instance.driver.set(new FirefoxDriver());
        }
        else if(browserName.equalsIgnoreCase("cloud_chrome_64")){ //2.CloudTest-need cloud chrome option.
            DesiredCapabilities caps = new DesiredCapabilities(); //need DesiredCapabilities object to see all capabilities for cloud chrome.
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "64.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "7");
            caps.setCapability("resolution", "1920x1080");
            caps.setCapability("browserstack.networkLogs", "true"); //will enable ConsoleLog in BrowserStack
            caps.setCapability("browserstack.debug", "true"); //will enable VisualLogs in BrowserStack

            try {
                instance.driver.set(new RemoteWebDriver(new URL(URL), caps)); //3.CloudTest-need to get remote driver instance to use cloud chrome driver.
            } catch (MalformedURLException e) { //need to surround with try\catch block.
                e.printStackTrace();
            }
        }
        else if(browserName.equalsIgnoreCase("cloud_ie_11")){ //2.CloudTest-need cloud Internet Explorer option.
            DesiredCapabilities caps = new DesiredCapabilities(); //need DesiredCapabilities object to see all capabilities for cloud ie.
            caps.setCapability("browser", "IE");
            caps.setCapability("browser_version", "11.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "7");
            caps.setCapability("resolution", "1920x1080");
            caps.setCapability("browserstack.networkLogs", "true"); //will enable ConsoleLog in BrowserStack
            caps.setCapability("browserstack.debug", "true"); //will enable VisualLogs in BrowserStack

            try {
                instance.driver.set(new RemoteWebDriver(new URL(URL), caps)); //3.CloudTest-need to get remote driver instance to use cloud ie driver.
            } catch (MalformedURLException e) { //need to surround with try\catch block.
                e.printStackTrace();
            }
        }

        return instance;
    }

    // thread local driver object for webdriver.
    // Need to store WebDriver in ThreadLocal datastrudture. So we created instance of special type of hashtable.
    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>()
    {
        @Override
        protected WebDriver initialValue() // Create temporary instance of class and override initialValue protected method.
        {
            ChromeDriverManager.getInstance().setup(); //To override this method, everytime WebDriver instance is made...
            return new ChromeDriver(); // ...a ChromeDriver instance is created and stored in datastructure for that instance.
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
