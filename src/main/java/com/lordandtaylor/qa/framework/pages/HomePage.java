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

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.assertEquals;

/**
 * @author Hema on  3/19/2018
 */
public class HomePage extends PageBase{

    @FindBy(how = How.XPATH, using = "//div[@id='close-button']")
    private WebElement email_popUp;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Always Free Shipping')]")
    private WebElement alwaysFreeShipping;

    @FindBy(how = How.XPATH, using = "//a[@class='menu-item-link'][contains(text(),'Beauty')]")
    private WebElement beauty;

    @FindBy(how = How.XPATH, using = "//li[@id='BeautyNavMenu']//a[contains(text(),'Exfoliators')]")
    private WebElement skinCare_Exfoliators;

    @FindBy(how = How.XPATH, using = ".//*[@id='BeautyNavMenu']//a[contains(text(),'Eyes')]")
    private WebElement makeUp_Eyes;



    //constructor
 /*   public HomePage(){
        PageFactory.initElements(driver,this);
    }*/

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

    public void openExfoliatorsPage(){
        delayFor(5000);
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
