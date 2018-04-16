package com.lordandtaylor.qa.framework.steps.hook;

import com.lordandtaylor.qa.framework.pages.*;
import com.lordandtaylor.qa.framework.utils.WebElementUtils;

/**
 * @author Hema on  3/9/2018
 */
public class StepBase extends WebElementUtils{

    protected HomePage homePage = new HomePage();
    protected ExfoliatorsPage exfoliatorsPage = new ExfoliatorsPage();
    protected LancomeProductPage lancomeProductPage = new LancomeProductPage();
    protected ViewBagPage viewBagPage = new ViewBagPage();
    protected CheckoutPage checkoutPage = new CheckoutPage();
    protected EyesPage eyesPage = new EyesPage();
    protected ShiseidoProductPage shiseidoProductPage = new ShiseidoProductPage();

}
