package com.lordandtaylor.qa.framework.scriptbase;

import com.lordandtaylor.qa.framework.pages.*;
import com.lordandtaylor.qa.framework.utils.DriverFactory;
import com.lordandtaylor.qa.framework.utils.WebElementUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Hema on  3/19/2018
 */
public class LordandTaylorScriptBaseJUnit extends PageBase{

    protected CheckoutPage checkoutPage;
    protected ExfoliatorsPage exfoliatorsPage;
    protected HomePage homePage;
    protected LancomeProductPage lancomeProductPage;
    protected ViewBagPage viewBagPage;
    protected EyesPage eyesPage;
    protected ShiseidoProductPage shiseidoProductPage;

    @Before
    public void beforeMethod() throws Exception{

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);

        checkoutPage = new CheckoutPage();
        exfoliatorsPage = new ExfoliatorsPage();
        homePage = new HomePage();
        lancomeProductPage = new LancomeProductPage();
        viewBagPage = new ViewBagPage();
        eyesPage = new EyesPage();
        shiseidoProductPage = new ShiseidoProductPage();

        driver.navigate().to("https://www.lordandtaylor.com/Entry.jsp");
    }



    @After
    public void afterMethod(){

        checkoutPage = null;
        exfoliatorsPage = null;
        homePage = null;
        lancomeProductPage = null;
        viewBagPage = null;
        eyesPage = null;
        shiseidoProductPage = null;

        DriverFactory.getInstance().removeDriver();
    }

}
