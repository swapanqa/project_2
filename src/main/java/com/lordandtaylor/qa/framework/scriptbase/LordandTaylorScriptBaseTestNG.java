package com.lordandtaylor.qa.framework.scriptbase;

import com.lordandtaylor.qa.framework.pages.*;
import com.lordandtaylor.qa.framework.utils.DriverFactory;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * @author Hema on  4/6/2018
 * This scriptBase class is TestNG
 */
public class LordandTaylorScriptBaseTestNG extends PageBase{

    protected CheckoutPage checkoutPage;
    protected ExfoliatorsPage exfoliatorsPage;
    protected HomePage homePage;
    protected LancomeProductPage lancomeProductPage;
    protected ViewBagPage viewBagPage;
    protected EyesPage eyesPage;
    protected ShiseidoProductPage shiseidoProductPage;
    protected SignInPage signInPage;

    @BeforeMethod
    //@Parameters({"browserName"})
    //public void beforeMethod(@Optional(value = "chrome") String browserName) throws Exception{
    public void beforeMethod(){
        //driver = DriverFactory.getInstance(browserName).getDriver();
        driver = DriverFactory.getInstance().getDriver();

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
        signInPage = new SignInPage();

        try{
            driver.navigate().to(new URL("https://www.lordandtaylor.com/Entry.jsp"));
        }catch (MalformedURLException ex){
            ex.printStackTrace();
        }
    }


    @AfterMethod
    public void afterMethod(){
        checkoutPage = null;
        exfoliatorsPage = null;
        homePage = null;
        lancomeProductPage = null;
        viewBagPage = null;
        eyesPage = null;
        shiseidoProductPage = null;
        signInPage = null;

        DriverFactory.getInstance().removeDriver();
    }

}
