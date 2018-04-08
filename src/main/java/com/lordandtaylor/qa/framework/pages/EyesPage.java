package com.lordandtaylor.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

/**
 * @author Hema on  3/21/2018
 */
public class EyesPage extends PageBase {

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'EYES')]")
    private WebElement eyesPage;

    @FindBy(how = How.XPATH, using = "//div[@id='pc-top']//ol[@class='pa-page-number']//a[contains(text(),'3')]")
    private WebElement pageNumber;

    @FindBy(how = How.ID, using = "img_0500016268484-0")
    private WebElement shiseidoProductImage;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Natural Eyebrow Pencil/0.1 oz.')]")
    private WebElement shiseidoProductName;

    @FindBy(how = How.XPATH, using = "//div[@id='product-0500016268484-details']//span[contains(text(),'$20.00')]")
    private WebElement shiseidoProductPrice;

/*

    public EyesPage(){
        PageFactory.initElements(driver, this);
    }
*/

    public void verifyPageName(){
        highlight(eyesPage);
        String text = eyesPage.getText();
        Assert.assertEquals("EYES", text);
    }

    public void verifyProductName(){
        highlight(pageNumber);
        pageNumber.click();
        highlight(shiseidoProductName);
        String text = shiseidoProductName.getText();
        Assert.assertEquals("Natural Eyebrow Pencil/0.1 oz.", text);
    }

    public void verifyProductPrice(){
        highlight(shiseidoProductPrice);
        String text = shiseidoProductPrice.getText();
        Assert.assertEquals("$20.00", text);
    }

    public void clickShiseidoProductImage(){
        highlight(shiseidoProductImage);
        shiseidoProductImage.click();
    }

}
