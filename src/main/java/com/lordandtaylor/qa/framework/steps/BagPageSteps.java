package com.lordandtaylor.qa.framework.steps;

import com.lordandtaylor.qa.framework.steps.hook.StepBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Hema on  3/29/2018
 */
public class BagPageSteps extends StepBase{

    //Lancome Bag:
    @Then("^BagPage should display$")
    public void bagpage_should_display() {
        viewBagPage.verifyBagPage();
    }

    @When("^User verify totalItems on LancomeBagPage as \"([^\"]*)\"$")
    public void user_verify_totalItems_on_LancomeBagPage_as(String expectedTotalItems) {
        viewBagPage.verifyTotalItemsInBag(expectedTotalItems);
    }

    @When("^User verify product name on LancomeBagPage as \"([^\"]*)\"$")
    public void user_verify_product_name_on_LancomeBagPage_as(String expectedProductName) {
        viewBagPage.verifyLancomeProductName(expectedProductName);
    }

    @When("^User verify subTotal on LancomeBagPage as \"([^\"]*)\"$")
    public void user_verify_subTotal_on_LancomeBagPage_as(String expectedSubTotal) {
        viewBagPage.verifySubTotal(expectedSubTotal);
    }

    @When("^User verify estimatedTotal on LancomeBagPage as \"([^\"]*)\"$")
    public void user_verify_estimatedTotal_on_LancomeBagPage_as(String expectedEstimatedTotal) {
        viewBagPage.verifyEstimatedTotal(expectedEstimatedTotal);
    }


    //Shiseido Bag:
    @Then("^Bag page should display$")
    public void bag_page_should_display() {
        viewBagPage.verifyBagPage();
    }

    @When("^User verify totalItems on ShiseidoBagPage as \"([^\"]*)\"$")
    public void user_verify_totalItems_on_ShiseidoBagPage_as(String expectedTotalItems) {
        viewBagPage.verifyTotalItemsInBag(expectedTotalItems);
    }

    @When("^User verify product name on ShiseidoBagPage as \"([^\"]*)\"$")
    public void user_verify_product_name_on_ShiseidoBagPage_as(String expectedName) {
        viewBagPage.verifyShiseidoProductName(expectedName);
    }

    @When("^User verify subTotal on ShiseidoBagPage as \"([^\"]*)\"$")
    public void user_verify_subTotal_on_ShiseidoBagPage_as(String expectedSubTotal) {
        viewBagPage.verifySubTotal(expectedSubTotal);
    }

    @When("^User verify estimatedTotal on ShiseidoBagPage as \"([^\"]*)\"$")
    public void user_verify_estimatedTotal_on_ShiseidoBagPage_as(String expectedEstimatedTotal) {
        viewBagPage.verifyEstimatedTotal(expectedEstimatedTotal);
    }



}
