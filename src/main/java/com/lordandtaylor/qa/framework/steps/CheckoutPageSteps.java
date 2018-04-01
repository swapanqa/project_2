package com.lordandtaylor.qa.framework.steps;

import com.lordandtaylor.qa.framework.steps.hook.StepBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * @author Hema on  3/29/2018
 */
public class CheckoutPageSteps extends StepBase {

    //Lancome checkout steps:
    @Then("^Checkout page should display Lancome products$")
    public void checkout_page_should_display_Lancome_products() {
        WebElement verifyCheckout = driver.findElement(By.xpath("//div[@class='minibag-heading items grid-70 grid-parent']"));
        String errormsg = verifyCheckout.getText();
        highlight(verifyCheckout);
        org.junit.Assert.assertEquals("Order Summary (2 Items)", errormsg);
    }

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
        //***Added this because products will keep adding to cart and quantity will be incorrect in next text.***
        WebElement removeFromCart = driver.findElement(By.xpath("//span[@class='action-link-text'][contains(text(),'Remove')]"));
        highlight(removeFromCart);
        removeFromCart.click();
        //Click second confirm Remove link
        WebElement confirmRemove = driver.findElement(By.xpath("//a[@class='action-link jsConfirm']//span[contains(text(),'Remove')]"));
        highlight(confirmRemove);
        confirmRemove.click();
        //Signout of account
/*        delayFor(5000);
        WebElement welcomeAccountLink = driver.findElement(By.xpath("//a[@class='account']"));
        highlight(welcomeAccountLink);
        hoverAction(welcomeAccountLink);
        delayFor(5000);
        WebElement signOutButton = driver.findElement(By.xpath("//b[contains(text(),'Sign Out')]"));
        highlight(signOutButton);
        click(signOutButton);*/
    }


    //Shiseido checkout steps:
    @Then("^Checkout page should display Shiseido products$")
    public void checkout_page_should_display_Shiseido_products() {
        WebElement verifyCheckout = driver.findElement(By.xpath("//div[@class='minibag-heading items grid-70 grid-parent']"));
        String errormsg = verifyCheckout.getText();
        highlight(verifyCheckout);
        org.junit.Assert.assertEquals("Order Summary (1 Item)", errormsg);
    }

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
        //***Added this because products will keep adding to cart and quantity will be incorrect in next text.***
        //Click first Remove link
        WebElement removeFromCart = driver.findElement(By.xpath("//span[@class='action-link-text'][contains(text(),'Remove')]"));
        highlight(removeFromCart);
        removeFromCart.click();
        //Click second confirm Remove link
        WebElement confirmRemove = driver.findElement(By.xpath("//a[@class='action-link jsConfirm']//span[contains(text(),'Remove')]"));
        highlight(confirmRemove);
        confirmRemove.click();
        //Signout of account
/*        delayFor(5000);
        WebElement welcomeAccountLink = driver.findElement(By.xpath("//a[@class='account']"));
        highlight(welcomeAccountLink);
        hoverAction(welcomeAccountLink);
        delayFor(5000);
        WebElement signOutButton = driver.findElement(By.xpath("//b[contains(text(),'Sign Out')]"));
        highlight(signOutButton);
        click(signOutButton);*/
    }

}
