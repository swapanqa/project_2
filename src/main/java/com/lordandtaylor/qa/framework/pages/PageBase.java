package com.lordandtaylor.qa.framework.pages;

import com.lordandtaylor.qa.framework.utils.WebElementUtils;
import org.junit.Assert;

/**
 * @author Hema on  3/19/2018
 */
public class PageBase extends WebElementUtils {



    public void verifyPageTitle(String expectedTitle){ //This method is to verify the title of the webpage. So we can verify all page titles.
        String title = driver.getTitle();
        Assert.assertEquals(expectedTitle,title);
    }

}
