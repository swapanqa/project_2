package com.lordandtaylor.qa.framework.scriptbase;

import com.lordandtaylor.qa.framework.pages.*;
import com.lordandtaylor.qa.framework.utils.DriverFactory;
import com.lordandtaylor.qa.framework.utils.WebElementUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.junit.runners.Parameterized;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
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
    protected SignInPage signInPage;

    @Parameterized.Parameter() //***Use to run in Jenkins (parallel in cloud)
    public String browserName = "chrome";

    @Before
    public void beforeMethod(){

        //System.out.println("Browser: " + browserName);//used to do Parallel //***Use to run in Jenkins (parallel in cloud)
        driver = DriverFactory.getInstance(browserName).getDriver(); //used to do Parallel by initaialze and get whatever Driver instance from DriverFactory
        //driver = DriverFactory.getInstance().getDriver(); //used to do Parallel by initaialze and get whatever Driver instance from DriverFactory

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

        driver.navigate().to("https://www.lordandtaylor.com/Entry.jsp");
/*
        try{
            driver.navigate().to(new URL("https://www.lordandtaylor.com/Entry.jsp"));
        }catch (MalformedURLException ex){
            ex.printStackTrace();
        }
*/

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
        signInPage = null;

        DriverFactory.getInstance().removeDriver();
    }

    public void delayFor(int timeInMili){
        homePage.delayFor(timeInMili);
    }

    //***Use to run in Jenkins (parallel in cloud)
    @Parameterized.Parameters(name = "{index} - Browser - {0}") //This is parameterized method which will open whatever browser you need, but default is chrome.
    public static Collection<Object[]> browsers(){
        return Arrays.asList(new Object[][]{
                {"chrome"}, //note: if you comment any browser, it would just run in the rest that's there.
                //{"firefox"},
                //{"cloud_chrome_64"}, //4.CloudTest-need to put this browser also, that you might want to execute in.
                //{"cloud_ie_11"} //5.CloudTest-need to put this browser also, that you might want to execute in.
        });
    }

}
