package com.lordandtaylor.qa.framework.steps;

import com.lordandtaylor.qa.framework.steps.hook.StepBase;
import cucumber.api.java.en.When;

/**
 * @author Hema on  3/29/2018
 */
public class CheckoutPageSteps extends StepBase {

    //Lancome checkout steps:
    @When("^User verify product name on LancomeCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_product_name_on_LancomeCheckoutPage_as(String expectedProductName)  {
        checkoutPage.verifyProductName(expectedProductName);
    }

    @When("^User verify product quantity on LancomeCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_product_quantity_on_LancomeCheckoutPage_as(String expectedQuantity) {
        checkoutPage.verifyProductQuantity(expectedQuantity);
    }

    @When("^User verify itemTotal on LancomeCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_itemTotal_on_LancomeCheckoutPage_as(String expectedItemTotal) {
        checkoutPage.verifyItemTotal(expectedItemTotal);
    }

    @When("^User verify shipping on LancomeCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_shipping_on_LancomeCheckoutPage_as(String expectedShipping) {
        checkoutPage.verifyShipping(expectedShipping);
    }

    @When("^User verify verify tax on LancomeCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_verify_tax_on_LancomeCheckoutPage_as(String expectedTax) {
        checkoutPage.verifyTax(expectedTax);
    }

    @When("^User verify orderTotal on LancomeCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_orderTotal_on_LancomeCheckoutPage_as(String expectedOrderTotal) {
        checkoutPage.verifyOrderTotal(expectedOrderTotal);
    }

    //Shiseido checkout steps:
    @When("^User verify product name on ShiseidoCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_product_name_on_ShiseidoCheckoutPage_as(String expectedName) {
        checkoutPage.verifyProductName(expectedName);
    }

    @When("^User verify product quantity on ShiseidoCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_product_quantity_on_ShiseidoCheckoutPage_as(String expectedQuantity) {
        checkoutPage.verifyProductQuantity(expectedQuantity);
    }

    @When("^User verify itemTotal on ShiseidoCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_itemTotal_on_ShiseidoCheckoutPage_as(String expectedItemTotal) {
        checkoutPage.verifyItemTotal(expectedItemTotal);
    }

    @When("^User verify shipping on ShiseidoCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_shipping_on_ShiseidoCheckoutPage_as(String expectedShipping) {
        checkoutPage.verifyShipping(expectedShipping);
    }

    @When("^User verify verify tax on ShiseidoCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_verify_tax_on_ShiseidoCheckoutPage_as(String expectedTax) {
        checkoutPage.verifyTax(expectedTax);
    }

    @When("^User verify orderTotal on ShiseidoCheckoutPage as \"([^\"]*)\"$")
    public void user_verify_orderTotal_on_ShiseidoCheckoutPage_as(String expectedOrderTotal) {
        checkoutPage.verifyOrderTotal(expectedOrderTotal);
    }

}
