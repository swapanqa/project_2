package com.lordandtaylor.qa.framework.pages;

import com.lordandtaylor.qa.framework.utils.DriverFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Hema on  3/19/2018
 */
public class HomePage extends PageBase{

    @FindBy(how = How.XPATH, using = "//div[@id='close-button']")
    private WebElement email_popUp;

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

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Always Free Shipping')]")
    private WebElement alwaysFreeShipping;

    @FindBy(how = How.XPATH, using = "//a[@class='menu-item-link'][contains(text(),'Beauty')]")
    private WebElement beauty;

    @FindBy(how = How.XPATH, using = "//li[@id='BeautyNavMenu']//a[contains(text(),'Exfoliators')]")
    private WebElement skinCare_Exfoliators;

    @FindBy(how = How.XPATH, using = ".//*[@id='BeautyNavMenu']//a[contains(text(),'Eyes')]")
    private WebElement makeUp_Eyes;



    //constructor
    public HomePage(){
        super();
        PageFactory.initElements(driver,this);
    }

    public void closeEmailPopUp(){
        WebElement firstToKnowPopUpWindow = null;

        try {
            firstToKnowPopUpWindow = driver.findElement(By.xpath("//div[@id='generic-modal']"));
            System.out.println("Found iframe");

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        if(firstToKnowPopUpWindow != null){
            WebElement emailPopUpContainerIframe = firstToKnowPopUpWindow.findElement(By.xpath("./iframe"));
            driver.switchTo().frame(emailPopUpContainerIframe);
            System.out.println("Switched to iframe");

            WebElement closeButton = driver.findElement(By.xpath("//div[@id='close-button']"));
            highlight(closeButton);
            closeButton.click();
        }
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

    public void openExfoliatorsPage(){
        highlight(beauty);
        Actions actions = new Actions(driver);
        actions.moveToElement(beauty).perform();
        highlight(skinCare_Exfoliators);
        skinCare_Exfoliators.click();
    }

    public void openEyesPage(){
        highlight(beauty);
        Actions actions = new Actions(driver);
        actions.moveToElement(beauty).perform();
        highlight(makeUp_Eyes);
        makeUp_Eyes.click();
    }


}
