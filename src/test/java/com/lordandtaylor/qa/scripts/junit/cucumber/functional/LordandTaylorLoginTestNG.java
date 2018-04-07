package com.lordandtaylor.qa.scripts.junit.cucumber.functional;

import com.lordandtaylor.qa.framework.scriptbase.LordandTaylorScriptBaseTestNG;
import com.lordandtaylor.qa.framework.utils.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Hema on  4/6/2018
 * This Test class is TestNG
 */
public class LordandTaylorLoginTestNG extends LordandTaylorScriptBaseTestNG {


    @Test
    public void loginSuccessfullyTest(){
        homePage.verifyPageTitle("Lord & Taylor: Designer Clothing, Shoes, Handbags, Accessories & More");
        homePage.closeEmailPopUp();
        signInPage.clickSignInLink();
        signInPage.enterSignInInfo("hema_ahmad@yahoo.com","Hema&123");
        signInPage.clickSignIn();
        signInPage.verifyCustomerGreetingMessage("Hema's Account");
        signInPage.clickSignOut();
    }


}
