package com.lordandtaylor.qa.framework.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Hema on  3/9/2018
 */
public class WebElementUtils extends SeleniumUtils{

    public WebElementUtils() {
        super(); //No need to inherit constructor, containing referenced driver, from SeleniumUtils. Since DriverFactory will give instance.
    }

    //method to find using by.
    public By getFindBy(String by, String using) {

        if (by.trim().toUpperCase().contentEquals("ID")) {
            return By.id(using);
        } else if (by.trim().toUpperCase().contentEquals("NAME")) {
            return By.name(using);
        } else if (by.trim().toUpperCase().contentEquals("XPATH")) {
            return By.xpath(using);
        } else if (by.trim().toUpperCase().contentEquals("CSS")) {
            return By.cssSelector(using);
        } else if (by.trim().toUpperCase().contentEquals("CLASS_NAME")) {
            return By.className(using);
        } else if (by.trim().toUpperCase().contentEquals("LINK_TEXT")) {
            return By.linkText(using);
        } else if (by.trim().toUpperCase().contentEquals("TAGNAME")) {
            return By.tagName(using);
        } else if (by.trim().toUpperCase().contentEquals("PARTIAL_LINK_TEXT")) {
            return By.partialLinkText(using);
        } else {
            return null;
        }
    }


    //method to type some text using by and text as 2 parameters, which is not hardcoded.
    /**public void typeText(By by, String text){ //just pass the locator and what to type.

     WebElement element = waitForElementDisplayed(by,SeleniumUtils.DEFAULT_WAIT_TIME); //find the element using waitForElementDisplayed method from SeleniumUtils by the constant time.
     highlight(element); //highlight element
     element.clear(); //clear the text, or whatever text might have been there before.
     element.sendKeys(text); //type the text you wanted to type.
     }*/

    //Same as typeText method above, but this one uses the typeText method below. This is the correct way of using code.
    //method to type some text using by and text as 2 parameters, which is not hardcoded.
    public void typeText(By by, String text){ //just pass the locator and what to type.

        WebElement element = waitForElementDisplayed(by,SeleniumUtils.DEFAULT_WAIT_TIME); //find the element using waitForElementDisplayed method from SeleniumUtils by the constant time.
        typeText(element,text); //this line is calling typeText method below which is 3 line of code. But same method functionalty as above.
    }

    public void typeText(WebElement element, String text){ //method overload with first typeText and different parameters.

        highlight(element); //highlight element
        element.clear(); //clear the text, or whatever text might have been there before.
        element.sendKeys(text); //type the text you wanted to type.
    }

    //method to click a button, which is not hardcoded.
    public void click(By by){ //give locator for button to click
        WebElement element = waitForElementDisplayed(by,SeleniumUtils.DEFAULT_WAIT_TIME); //find the button using wait time.
        click(element); //This method is using method below to do rest of things.
    }

    //method to click a button, which is not hardcoded.Overloaded method.
    public void click(WebElement element){ //give locator for button to click
        highlight(element); //highlight element
        element.click(); //click element
    }

    //click buton using JavaScript
    public void jsClick (WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);
    }

    //method to get text and verify actual text (actualText) to the text you pass as parameter (textToVerify).
    public void verifyText(By by, String textToVerify){
        WebElement element = waitForElementDisplayed(by,10);
        String actualText = element.getText();
        assertThat(actualText,equalTo(textToVerify));
    }

    public void hoverAction(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

}
