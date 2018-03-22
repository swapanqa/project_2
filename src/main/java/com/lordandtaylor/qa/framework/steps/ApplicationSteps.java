package com.lordandtaylor.qa.framework.steps;

import com.lordandtaylor.qa.framework.steps.hook.StepBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author Hema on  3/9/2018
 */
public class ApplicationSteps extends StepBase{


    @Given("^As a non-validated user$")
    public void as_a_non_validated_user(){
        driver.manage().deleteAllCookies();
    }

    @When("^User navigate to site$")
    public void user_navigate_to_site(){
        driver.navigate().to("http://www.lordandtaylor.com");
    }

    @When("^User close emailPopUp button$")
    public void user_close_emailPopUp_button(){
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

    @Then("^LordAndTaylor home page should display$")
    public void lordandtaylor_home_page_should_display(){
        String homePageTitle = driver.getTitle();
        Assert.assertEquals("Lord & Taylor: Designer Clothing, Shoes, Handbags, Accessories & More",homePageTitle);
    }

}
