package com.lordandtaylor.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.assertEquals;

/**
 * @author Hema on  3/26/2018
 */
public class SignInPage extends PageBase {

    @FindBy(how = How.XPATH, using = "//a[@class='account' and text()='Welcome, Sign In']")
    private WebElement signInLink;

    @FindBy(how = How.ID, using = "sign-into-account-email-field")
    private WebElement emailInputBox;

    @FindBy(how = How.ID, using = "sign-into-account-password-field")
    private WebElement passwordInputBox;

    @FindBy(how = How.XPATH, using = "//button[@class='hbc-button hbc-button--full hbc-button--primary sign-into-account__submit-button']")
    private WebElement signInButton;   //button[contains(@class,'sign-into-account__submit-button')]

    @FindBy(how = How.XPATH,using = "//h1[@class='account-header__greeting']")
    private WebElement userGreetingMsg;

    @FindBy(how = How.XPATH, using = "//a[@class='account']")
    private WebElement signOutLink;

    @FindBy(how = How.XPATH, using = "//b[contains(text(),'Sign Out')]")
    private WebElement signOutButton;

    @FindBy(how = How.XPATH, using = "//span[@class='text-field__error-message']")
    private WebElement emailErrorMsg;

    @FindBy(how = How.XPATH, using = "//span[@class='text-field__error-message']")
    private WebElement passwordErrorMsg;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert--danger']")
    private WebElement alertMsg;


    public SignInPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickSignInLink(){
        highlight(signInLink);
        signInLink.click();
    }

    public void enterSignInInfo(String email, String password){
        highlight(emailInputBox);
        typeText(emailInputBox, email);
        highlight(passwordInputBox);
        typeText(passwordInputBox, password);
    }

    public void clickSignIn(){
        highlight(signInButton);
        signInButton.click();
    }

    public void verifyCustomerGreetingMessage(String greeting){
        delayFor(3000);
        //waitForInvisibilityOfElement(userGreetingMsg);
        highlight(userGreetingMsg);
        String greetText = userGreetingMsg.getText();
        Pattern pattern = Pattern.compile(".*'s Account.*");
        Matcher matcher = pattern.matcher(greetText);
        System.out.println(matcher.matches());
        Assert.assertEquals(greeting,greetText);
    }

    public void clickSignOut(){
        highlight(signOutLink);
        hoverAction(signOutLink);
        highlight(signOutButton);
        signOutButton.click();
    }

}

