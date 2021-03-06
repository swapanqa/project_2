package com.lordandtaylor.qa.framework.steps;

import com.lordandtaylor.qa.framework.steps.hook.StepBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Hema on  3/29/2018
 * Note: This page consists of buttons that is repetitive.
 */
public class SimilarButtonsSteps extends StepBase{


    @When("^User click addToBag button$")
    public void user_click_addToBag_button() {
        WebElement addToBagButton = driver.findElement(By.xpath("//button[@class='hbc-button hbc-button--full hbc-button--primary']"));
        addToBagButton.click();
    }

    @When("^User click viewMyBagAndCheckOut$")
    public void user_click_viewMyBagAndCheckOut() {
        delayFor(5000);
        WebElement viewMyBagAndCheckOutButton = driver.findElement(By.xpath("//div[@class='footer clearfix']//a[@class='sfa-button small transactional']"));
        viewMyBagAndCheckOutButton.click();

    }

    @When("^User click checkout button on bagPage$")
    public void user_click_checkout_button_on_bagPage() {
        viewBagPage.clickCheckoutButton();
    }


}
