package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class SocialMedia extends Utils{

    By btn_ContactUs = By.xpath("//a[@title='Contact us']");
    By icon_Facebook = By.xpath("//*[@id=\"social_block\"]/ul/li[1]");
    By btn_AllowCookies = By.xpath("//div/div[5]/div/div[1]/div[1]/div/div[1]/div/span/span");


    public void VerifyUserIsOnHomePage(){
        Assert.assertTrue(driver.findElement(btn_ContactUs).isDisplayed());
        System.out.println("Correct HomePage");
    }

    public void userClicksOnSocialMediaIcon(){
        clickOnElement(icon_Facebook);

    }

    public void windowHandles(){
        Set<String> windowhandles = driver.getWindowHandles();
        Iterator<String> iterator = windowhandles.iterator();
        String parentwindow = iterator.next();
        String childwindow = iterator.next();
        driver.switchTo().window(childwindow);
        clickOnElement(btn_AllowCookies);
        driver.close();
        driver.switchTo().window(parentwindow);
    }


}
