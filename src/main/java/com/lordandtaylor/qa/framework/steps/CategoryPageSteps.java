package com.lordandtaylor.qa.framework.steps;

import com.lordandtaylor.qa.framework.steps.hook.StepBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Hema on  3/29/2018
 */
public class CategoryPageSteps extends StepBase {

    //Exfoliators page display all products
    @Then("^Exfoliators page should display$")
    public void exfoliators_page_should_display() {
        exfoliatorsPage.verifyPageName();
    }

    @When("^User click on Lancome exfoliator product$")
    public void user_click_on_Lancome_exfoliator_product() {
        exfoliatorsPage.verifyProductName();
        exfoliatorsPage.verifyProductPrice();
        exfoliatorsPage.clickLancomeProductImage();
    }


    //Eyes page display all products
    @Then("^Eyes page should display$")
    public void eyes_page_should_display() {
        eyesPage.verifyPageName();
    }

    @When("^User click on Shiseido Eye product$")
    public void user_click_on_Shiseido_Eye_product() {
        eyesPage.verifyProductName();
        eyesPage.verifyProductPrice();
        eyesPage.clickShiseidoProductImage();
    }

}
