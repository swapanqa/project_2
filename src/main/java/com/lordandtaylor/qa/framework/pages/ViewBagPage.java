package com.lordandtaylor.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Hema on  3/20/2018
 */
public class ViewBagPage extends PageBase {

    @FindBy(how = How.XPATH, using = "//h1[@class='masthead-saksbag-title']")
    private WebElement bagPage;

    @FindBy(how = How.XPATH, using = "//a[@class='widebag-heading items']")
    private WebElement totalBagItems;

    @FindBy(how = How.XPATH, using = "//p[@class='widebag-item-product-name']")
    private WebElement productBrand;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Comforting Exfoliating Cream/3.4 oz.')]")
    private WebElement productNameLancome;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Natural Eyebrow Pencil/0.1 oz.')]")
    private WebElement productNameShiseido;

    @FindBy(how = How.XPATH, using = "//input[starts-with(@id,'jsItemQty-')]")
    private WebElement productQuantity;

    @FindBy(how = How.XPATH, using = "//div[@class='grid-10']//p[@class='widebag-item-extended-price']")
    private WebElement subTotal;

    @FindBy(how = How.XPATH, using = "//dd[@id='jsVal-grandTotal']")
    private WebElement estimatedTotal;

    @FindBy(how = How.XPATH, using = "//a[contains(@id,'Checkout')][contains(text(),'Checkout')]")
    private WebElement checkOutButton;

    @FindBy(how = How.ID, using = "jsCheckoutRemediationGuestCheckout")
    private WebElement checkoutAsGuest;


    public ViewBagPage(){
        PageFactory.initElements(driver, this);
    }

    public void verifyBagPage(){
        highlight(bagPage);
        String text = bagPage.getText();
        Assert.assertEquals("BAG", text);
    }

    public void verifyTotalItemsInBag(String expectedTotalItems){
        highlight(totalBagItems);
        String text = totalBagItems.getText();
        Assert.assertEquals(expectedTotalItems, text);
    }

    public void verifyProductBrand(String expectedBrand){
        highlight(productBrand);
        String text = productBrand.getText();
        Assert.assertEquals(expectedBrand, text);
    }

    public void verifyLancomeProductName(String expectedName){
        highlight(productNameLancome);
        String text = productNameLancome.getText();
        Assert.assertEquals(expectedName, text);
    }

    public void verifyShiseidoProductName(String expectedName){
        highlight(productNameShiseido);
        String text = productNameShiseido.getText();
        Assert.assertEquals(expectedName, text);
    }

    public void verifyProductQuantity(String expectedQuantity){
        highlight(productQuantity);
        String text = productQuantity.getText();
        Assert.assertEquals(expectedQuantity, text);
    }

    public void verifySubTotal(String expectedSubTotal){
        highlight(subTotal);
        String text = subTotal.getText();
        Assert.assertEquals(expectedSubTotal, text);
    }

    public void verifyEstimatedTotal(String expectedEstimatedTotal){
        highlight(estimatedTotal);
        String text = estimatedTotal.getText();
        Assert.assertEquals(expectedEstimatedTotal, text);
    }

    public void clickCheckoutButton(){
        highlight(checkOutButton); //***note: sometimes this button works, other times not. Xpath is correctly identified.
        checkOutButton.click();
    }

    public void clickCheckoutAsGuestButton(){
        highlight(checkoutAsGuest);
        checkoutAsGuest.click();
    }

}
