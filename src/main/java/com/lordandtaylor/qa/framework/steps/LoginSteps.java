package com.lordandtaylor.qa.framework.steps;

import com.lordandtaylor.qa.framework.steps.hook.StepBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * @author Hema on  3/9/2018
 */
public class LoginSteps extends StepBase{


    @When("^User click SignIn link$")
    public void user_click_SignIn_link(){

        WebElement signInLink = driver.findElement(By.xpath("//a[@class='account' and text()='Welcome, Sign In']"));
        highlight(signInLink);
        click(signInLink);
    }

    @Then("^Browser should display SignIn page$")
    public void browser_should_display_SignIn_page(){
        WebElement signInText = driver.findElement(By.xpath("//h2[@class='sign-into-account__title']"));
        String signInMsg = signInText.getText();
        highlight(signInText);
        Assert.assertEquals("Sign Into My Account", signInMsg);
    }

    @When("^User enter email as \"([^\"]*)\"$")
    public void user_enter_email_as(String email){
        typeText(By.id("sign-into-account-email-field"), email);
    }

    @When("^User enter password as \"([^\"]*)\"$")
    public void user_enter_password_as(String password){
        typeText(By.id("sign-into-account-password-field"), password);
    }

    @When("^User click SignIn button$")
    public void user_click_SignIn_button(){
        WebElement signInButton = driver.findElement(By.xpath("//button[@class='hbc-button hbc-button--full hbc-button--primary sign-into-account__submit-button']"));
        highlight(signInButton);//button[contains(@class,'sign-into-account__submit-button')]
        //click(signInButton);
        jsClick(signInButton);
    }

}
