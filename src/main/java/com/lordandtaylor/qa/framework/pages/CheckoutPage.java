package com.lordandtaylor.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Hema on  3/20/2018
 */
public class CheckoutPage extends PageBase {

    @FindBy(how = How.XPATH, using = "//p[@class='minibag-item-short-description']")
    private WebElement productName;

    @FindBy(how = How.XPATH, using = "//dl[@class='description-list']//dd[3]")
    private WebElement productQuantity;

    @FindBy(how = How.XPATH, using = "//dd[@id='jsVal-itemsTotal']")
    private WebElement itemTotal;

    @FindBy(how = How.ID, using = "jsVal-shippingCost")
    private WebElement shippingHandling;

    @FindBy(how = How.ID, using = "jsVal-tax")
    private WebElement tax;

    @FindBy(how = How.ID, using = "jsVal-grandTotal")
    private WebElement orderTotal;


    public CheckoutPage(){
        PageFactory.initElements(driver, this);
    }

    public void verifyProductName(String expectedName){
        highlight(productName);
        String text = productName.getText();
        Assert.assertEquals(expectedName, text);
    }

    public void verifyProductQuantity(String expectedQuantity){
        highlight(productQuantity);
        String text = productQuantity.getText();
        Assert.assertEquals(expectedQuantity, text);
    }

    public void verifyItemTotal(String expectedTotal){
        highlight(itemTotal);
        String text = itemTotal.getText();
        Assert.assertEquals(expectedTotal, text);
    }

    public void verifyShipping(String expectedShip){
        highlight(shippingHandling);
        String text = shippingHandling.getText();
        Assert.assertEquals(expectedShip, text);
    }

    public void verifyTax(String expectedTax){
        highlight(tax);
        String text = tax.getText();
        Assert.assertEquals(expectedTax, text);
    }

    public void verifyOrderTotal(String expectedOrderTotal){
        highlight(orderTotal);
        String text = orderTotal.getText();
        Assert.assertEquals(expectedOrderTotal, text);
    }

}
