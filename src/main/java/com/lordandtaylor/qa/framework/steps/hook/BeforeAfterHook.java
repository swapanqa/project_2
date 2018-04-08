package com.lordandtaylor.qa.framework.steps.hook;

import com.lordandtaylor.qa.framework.utils.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Hema on  3/9/2018
 */
public class BeforeAfterHook extends StepBase{

    @Before
    public void setUp(){

/*        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();*/

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){

        DriverFactory.getInstance().removeDriver();

    }


}
