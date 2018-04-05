package com.lordandtaylor.qa.scripts.junit.cucumber.functional;

import com.lordandtaylor.qa.framework.pages.HomePage;
import com.lordandtaylor.qa.framework.scriptbase.LordandTaylorScriptBaseJUnit;
import com.lordandtaylor.qa.framework.utils.ExcelReader;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Hema on  3/19/2018
 * Lord & Taylor functional test for login using DataDriven concept.
 */


@RunWith(DataProviderRunner.class)
public class LordandTaylorLoginJUnit extends LordandTaylorScriptBaseJUnit {

    @Test
    @UseDataProvider("loginDataProviderAsExcelWithPOI")
    public void loginSuccessfullyTest(String email, String password, String greeting){
        homePage.verifyPageTitle("Lord & Taylor: Designer Clothing, Shoes, Handbags, Accessories & More");
        homePage.closeEmailPopUp();
        signInPage.clickSignInLink();
        signInPage.enterSignInInfo(email,password);
        signInPage.clickSignIn();
        signInPage.verifyCustomerGreetingMessage(greeting);
        signInPage.clickSignOut();
    }

    @DataProvider
    public static Object[][] loginDataProviderAsExcelWithPOI() {
        Object[][] data = null;
        String dataFile = System.getProperty("user.dir") + "/src/test/resources/LordandTaylorLoginData.xls";


        ExcelReader reader = new ExcelReader(dataFile);
        data = reader.getExcelSheetData("Sheet1",true);
        return data;
    }


}
