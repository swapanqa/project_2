package com.lordandtaylor.qa.framework.steps;

import com.lordandtaylor.qa.framework.steps.hook.StepBase;
import com.lordandtaylor.qa.framework.utils.RegexArrayMatcher;
import com.sun.org.apache.xpath.internal.operations.Bool;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

import javax.enterprise.inject.Stereotype;

import static org.hamcrest.MatcherAssert.assertThat;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * @author Hema on  3/13/2018
 */
public class AccountPageSteps extends StepBase {

    @Then("^Account page should display greeting message$")
    public void account_page_should_display_greeting_message() {
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
    public void user_click_SignOut_button() {
        delayFor(5000);
        WebElement welcomeAccountLink = driver.findElement(By.xpath("//a[@class='account']"));
        highlight(welcomeAccountLink);
        hoverAction(welcomeAccountLink);
        delayFor(5000);
        WebElement signOutButton = driver.findElement(By.xpath("//b[contains(text(),'Sign Out')]"));
        highlight(signOutButton);
        click(signOutButton);
    }

    @Then("^EmailError should display as \"([^\"]*)\"$")
    public void emailerror_should_display_as(String expectedErrorMessage) {
        WebElement emailError = driver.findElement(By.xpath("//span[@class='text-field__error-message']"));
        String emailErrorMessage = emailError.getText();
        highlight(emailError);
        assertThat(emailErrorMessage, equalTo(expectedErrorMessage));
    }

    @Then("^PasswordError should display as \"([^\"]*)\"$")
    public void passworderror_should_display_as(String expectedErrorMessage) {
        WebElement passwordError = driver.findElement(By.xpath("//span[@class='text-field__error-message']"));
        String passwordErrorMessage = passwordError.getText();
        highlight(passwordError);
        Assert.assertEquals(passwordErrorMessage, expectedErrorMessage);
    }

/*    @Then("^Alert should display$")
    public void alert_should_display() {
        delayFor(5000);
        WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert--danger']"));
        String dangerAlert = alert.getText();
        highlight(alert);

        String expectedAlert[] = {
                "Sorry, this does not match our records. Please try again.",
                "We're sorry, your entry does not match our records. Forgot Password?",
                "We're sorry, your entry does not match our records. You have 3 more attempts. Forgot Password?",
                "We're sorry, your entry does not match our records. You have 2 more attempts. Forgot Password?",
                "We're sorry, your entry does not match our records. You have 1 more attempt. Forgot Password?"};
        List<String> expectedAlertList = Arrays.asList(expectedAlert);
        String theList = expectedAlertList.toString();

       if(!theList.equals(dangerAlert)) {
            //Assert.assertTrue(theList.equals(dangerAlert));
            System.out.println("We have a match!");
        }else{
           delayFor(5000);
            WebElement element = driver.findElement(By.xpath("//h2[@class='account-message-card__title'][text()='Account Locked']"));
            highlight(element);
            String acctLockMsg = element.getText();
            Assert.assertEquals("Account Locked",acctLockMsg);
            System.out.println("No match! Need to reset password!");
        }*/


/*        Boolean alertIsPresent = driver.findElements(By.xpath("//div[@class='alert alert--danger']")).size() > 0;
        System.out.println("Was alert msg displayed?: " + alertIsPresent);
        Assert.assertTrue(alertIsPresent);
*/



}