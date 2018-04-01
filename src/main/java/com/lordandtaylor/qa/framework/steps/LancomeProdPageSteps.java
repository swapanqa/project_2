package com.lordandtaylor.qa.framework.steps;

import com.lordandtaylor.qa.framework.steps.hook.StepBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Hema on  3/29/2018
 */
public class LancomeProdPageSteps extends StepBase {


    @Then("^Lancome product page should display$")
    public void lancome_product_page_should_display() {
        lancomeProductPage.verifyLancomeProductTitle();
    }

    @When("^User select Lancome product size as \"([^\"]*)\"$")
    public void user_select_Lancome_product_size_as(String arg1) {
        lancomeProductPage.chooseProductSize();
    }

    @When("^User select Lancome product quantity as \"([^\"]*)\"$")
    public void user_select_Lancome_product_quantity_as(String arg1) {
        lancomeProductPage.selectQuantity();
    }

    @When("^User select Lancome shipIt option$")
    public void user_select_Lancome_shipIt_option() {
        lancomeProductPage.chooseShipOption();
    }

}
