package com.lordandtaylor.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Hema on  3/21/2018
 */
public class ShiseidoProductPage extends PageBase {

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Natural Eyebrow Pencil/0.1 oz.')]")
    private WebElement shiseidoProductTitle;

    @FindBy(how = How.XPATH, using = "//li[@data-reactid='22']")
    private WebElement colorOption;

    @FindBy(how = How.ID, using = "numberInput")
    private WebElement quantity;

    @FindBy(how = How.XPATH, using = "//span[@class='radiogroup__radio-button'][@data-reactid='51']")
    private WebElement shipOption;

    @FindBy(how = How.XPATH, using = "//button[@class='hbc-button hbc-button--full hbc-button--primary']")
    private WebElement addToBag;

    @FindBy(how = How.XPATH, using = "//div[@class='footer clearfix']//a[@class='sfa-button small transactional']")
    private WebElement viewMyBagAndCheckOut;


    public ShiseidoProductPage(){
        PageFactory.initElements(driver, this);
    }

    public void verifyShiseidoProductTitle(){
        highlight(shiseidoProductTitle);
        String text = shiseidoProductTitle.getText();
        Assert.assertEquals("Natural Eyebrow Pencil/0.1 oz.", text);
    }

    public void chooseColorOption(){
        highlight(colorOption);
        colorOption.click();
    }

    public void selectQuantity(){
        highlight(quantity);
        quantity.clear();
        typeText(quantity,"1");
    }

    public void chooseShipOption(){
        highlight(shipOption);
        shipOption.click();
    }

    public void clickAddToBag(){
        highlight(addToBag);
        addToBag.click();
        delayFor(5000);
        highlight(viewMyBagAndCheckOut);
        viewMyBagAndCheckOut.click();
    }

}
