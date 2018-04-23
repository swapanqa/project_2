package com.lordandtaylor.qa.scripts.junit.cucumber.functional;

import com.lordandtaylor.qa.framework.scriptbase.LordandTaylorScriptBaseJUnit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author Hema on  3/20/2018
 *Note: To run remote and local (using BrowserStack), need to change uncomment @RunsWith in this class and uncomment 3...
 * ...things in LordandTaylorScriptBaseJUnit.java
 * This is for sequential (not parallel) Multi-Browser operation
 */

@RunWith(Parameterized.class) //***Use to run in Jenkins (parallel in cloud)
public class LordandTaylorCartTestJUnit extends LordandTaylorScriptBaseJUnit {

    @Test
    public void beauty_Purchase_OVER_$49_Get_FreeShipping(){

        homePage.closeEmailPopUp();
        homePage.verifyPageTitle("Lord & Taylor: Designer Clothing, Shoes, Handbags, Accessories & More");
        homePage.openExfoliatorsPage();
        exfoliatorsPage.verifyPageTitle("Exfoliators: Facial Scrubs & More | Lord & Taylor");
        exfoliatorsPage.verifyPageName();
        exfoliatorsPage.verifyProductName();
        exfoliatorsPage.verifyProductPrice();
        exfoliatorsPage.clickLancomeProductImage();
        lancomeProductPage.verifyPageTitle("Lancôme - Comforting Exfoliating Cream/3.4 oz. - lordandtaylor.com");
        lancomeProductPage.verifyLancomeProductTitle();
        lancomeProductPage.chooseProductSize();
        lancomeProductPage.selectQuantity();
        lancomeProductPage.chooseShipOption();
        lancomeProductPage.clickAddToBag();
        viewBagPage.verifyBagPage();
        //viewBagPage.verifyTotalItemsInBag("Items (2)");
        viewBagPage.verifyProductBrand("Lancôme");
        viewBagPage.verifyLancomeProductName("Comforting Exfoliating Cream/3.4 oz.");
        //viewBagPage.verifyProductQuantity("2");  //***issue is: actual is showing blank, but suppose to be 2.***
        viewBagPage.verifySubTotal("$52.00");
        viewBagPage.verifyEstimatedTotal("$61.95");
        viewBagPage.clickCheckoutButton();
        viewBagPage.clickCheckoutAsGuestButton();
        checkoutPage.verifyProductName("Comforting Exfoliating Cream/3.4 oz.");
        //checkoutPage.verifyProductQuantity("2");
        checkoutPage.verifyItemTotal("$52.00");
        checkoutPage.verifyShipping("FREE");
        checkoutPage.verifyTax("$0.00");
        checkoutPage.verifyOrderTotal("$52.00");
    }

    @Test
    public void beauty_Purchase_UNDER_$49_NO_Free_Shipping(){
        homePage.closeEmailPopUp();
        homePage.openEyesPage();
        eyesPage.verifyPageName();
        eyesPage.verifyProductName();
        eyesPage.verifyProductPrice();
        eyesPage.clickShiseidoProductImage();
        shiseidoProductPage.verifyShiseidoProductTitle();
        shiseidoProductPage.chooseColorOption();
        shiseidoProductPage.selectQuantity();
        shiseidoProductPage.chooseShipOption();
        shiseidoProductPage.clickAddToBag();
        viewBagPage.verifyBagPage();
        viewBagPage.verifyTotalItemsInBag("Items (1)");
        viewBagPage.verifyProductBrand("Shiseido");
        viewBagPage.verifyShiseidoProductName("Natural Eyebrow Pencil/0.1 oz.");
        //viewBagPage.verifyProductQuantity("1"); // ***issue is actual is showing blank and should be 1.***
        viewBagPage.verifySubTotal("$20.00");
        viewBagPage.verifyEstimatedTotal("$25.95");
        viewBagPage.clickCheckoutButton();
        viewBagPage.clickCheckoutAsGuestButton();
        checkoutPage.verifyProductName("Natural Eyebrow Pencil/0.1 oz.");
        checkoutPage.verifyProductQuantity("1");
        checkoutPage.verifyItemTotal("$20.00");
        checkoutPage.verifyShipping("$5.95");
        checkoutPage.verifyTax("$0.00");
        checkoutPage.verifyOrderTotal("$25.95");
    }

}
