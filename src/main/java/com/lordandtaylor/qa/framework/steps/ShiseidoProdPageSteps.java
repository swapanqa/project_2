package com.lordandtaylor.qa.framework.steps;

import com.lordandtaylor.qa.framework.pages.PageBase;
import com.lordandtaylor.qa.framework.steps.hook.StepBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Hema on  3/29/2018
 */
public class ShiseidoProdPageSteps extends StepBase{

    @Then("^Shiseido product page should display$")
    public void shiseido_product_page_should_display() {
        shiseidoProductPage.verifyShiseidoProductTitle();
    }

    @When("^User select Shiseido product color as \"([^\"]*)\"$")
    public void user_select_Shiseido_product_color_as(String arg1) {
        shiseidoProductPage.chooseColorOption();
    }

    @When("^User select Shiseido product quantity as \"([^\"]*)\"$")
    public void user_select_Shiseido_product_quantity_as(String arg1) {
        shiseidoProductPage.selectQuantity();
    }

}
