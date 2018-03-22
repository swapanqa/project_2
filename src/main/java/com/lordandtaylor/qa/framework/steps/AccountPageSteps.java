package com.lordandtaylor.qa.framework.steps;

import com.lordandtaylor.qa.framework.steps.hook.StepBase;
import com.lordandtaylor.qa.framework.utils.RegexArrayMatcher;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.hamcrest.Matchers.*;

/**
 * @author Hema on  3/13/2018
 */
public class AccountPageSteps extends StepBase {

    @Then("^Account page should display greeting message$")
    public void account_page_should_display_greeting_message(){
        delayFor(3000);
        WebElement greetingMessage = driver.findElement(By.xpath("//h1[@class='account-header__greeting']"));
        waitForVisibilityOfElement(greetingMessage);
        highlight(greetingMessage);
        String greetingText = greetingMessage.getText();
        Pattern pattern = Pattern.compile(".*'s Account.*");
        Matcher matcher = pattern.matcher(greetingText);
        System.out.println(matcher.matches());
    }

    @Then("^User click SignOut button$")
    public void user_click_SignOut_button(){
        WebElement welcomeAccountLink = driver.findElement(By.xpath("//a[@class='account']"));
        hoverAction(welcomeAccountLink);
        WebElement signOutButton = driver.findElement(By.xpath("//b[contains(text(),'Sign Out')]"));
        highlight(signOutButton);
        click(signOutButton);
    }

    @Then("^EmailError should display as \"([^\"]*)\"$")
    public void emailerror_should_display_as(String expectedErrorMessage){
        WebElement emailError = driver.findElement(By.xpath("//span[@class='text-field__error-message']"));
        String emailErrorMessage = emailError.getText();
        highlight(emailError);
        assertThat(emailErrorMessage, equalTo(expectedErrorMessage));
    }

    @Then("^PasswordError should display as \"([^\"]*)\"$")
    public void passworderror_should_display_as(String expectedErrorMessage){
        WebElement passwordError = driver.findElement(By.xpath("//span[@class='text-field__error-message']"));
        String passwordErrorMessage = passwordError.getText();
        highlight(passwordError);
        Assert.assertEquals(passwordErrorMessage,expectedErrorMessage);
    }

    @Then("^Alert should display as \"([^\"]*)\"$")
    public void alert_should_display_as(String expectedAlertMessage){
       delayFor(5000);
       WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert--danger']"));
       String dangerAlert = alert.getText();
       highlight(alert);
       assertThat(dangerAlert, equalTo(expectedAlertMessage));
    }

}
