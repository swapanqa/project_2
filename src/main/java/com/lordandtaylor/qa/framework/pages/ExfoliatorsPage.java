package com.lordandtaylor.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Hema on  3/20/2018
 */
public class ExfoliatorsPage extends PageBase{

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'EXFOLIATORS')]")
    private WebElement exfoliatorsPage;

    @FindBy(how = How.ID, using = "img_0500006499206-0")
    private WebElement lancomeProductImage;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Comforting Exfoliating Cream/3.4 oz.')]")
    private WebElement lancomeProductName;

    @FindBy(how = How.XPATH, using = "//div[@id='product-0500006499206-details']//span[contains(text(),'$26.00')]")
    private WebElement lancomeProductPrice;


/*
    public ExfoliatorsPage(){
        PageFactory.initElements(driver,this);
    }
*/

    public void verifyPageName(){
        highlight(exfoliatorsPage);
        String text = exfoliatorsPage.getText();
        Assert.assertEquals("EXFOLIATORS", text);
    }

    public void verifyProductName(){
        highlight(lancomeProductName);
        String text = lancomeProductName.getText();
        Assert.assertEquals("Comforting Exfoliating Cream/3.4 oz.", text);
    }

    public void verifyProductPrice(){
        highlight(lancomeProductPrice);
        String text = lancomeProductPrice.getText();
        Assert.assertEquals("$26.00", text);
    }

    public void clickLancomeProductImage(){
        highlight(lancomeProductImage);
        lancomeProductImage.click();
    }


}
