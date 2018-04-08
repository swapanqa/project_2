package com.lordandtaylor.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Hema on  3/20/2018
 */
public class LancomeProductPage extends PageBase{

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Comforting Exfoliating Cream/3.4 oz.')]")
    private WebElement lancomeProductTitle;

    @FindBy(how = How.XPATH, using = "//ul[@class='product-variant-attribute-values']/li[@data-reactid='23']")
    private WebElement size;

    @FindBy(how = How.ID, using = "numberInput")
    private WebElement quanitiy;

    @FindBy(how = How.XPATH, using = "//div[@id='pdp-content-area']//span[@class='radiogroup__radio-button'][@data-reactid='50']")
    private WebElement shipOption;

    @FindBy(how = How.XPATH, using = "//button[@class='hbc-button hbc-button--full hbc-button--primary']")
    private WebElement addToBag;

    @FindBy(how = How.XPATH, using = "//div[@class='footer clearfix']//a[@class='sfa-button small transactional']")
    private WebElement viewMyBagAndCheckOut;


    public LancomeProductPage(){
        PageFactory.initElements(driver, this);
    }

    public void verifyLancomeProductTitle(){
        highlight(lancomeProductTitle);
        String text = lancomeProductTitle.getText();
        Assert.assertEquals("Comforting Exfoliating Cream/3.4 oz.", text);
    }

    public void chooseProductSize(){
        highlight(size);
        size.click();
    }

    public void selectQuantity(){
        highlight(quanitiy);
        quanitiy.clear();
        typeText(quanitiy,"2");
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
