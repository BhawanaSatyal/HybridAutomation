package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AddToCart extends Utils{

    Actions actions = new Actions(driver);

    By btn_WomenCategory = By.xpath("//a[@title='Women']");
    By btn_Tshirts = By.xpath("//li[1]/ul/li[1]/a[@title='T-shirts']");
    By btn_Blouses = By.xpath("//a[@title='Blouses']");
    By btn_CasualDresses = By.xpath("//ul/li[1]/ul/li[2]/ul/li[1]/a[@title='Casual Dresses']");
    By btn_EveningDresses = By.xpath("//ul/li[1]/ul/li[2]/ul/li[2]/a[@title='Evening Dresses']  ");
    By btn_SummerDresses = By.xpath("//ul/li[1]/ul/li[2]/ul/li[3]/a[@title='Summer Dresses']");
    By btn_PrintedSummerDress = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]");
    By btn_AddToCart = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span");
    By btn_ProceedToCheckout = By.xpath("//a[@title='Proceed to checkout']/span");
    By btn_ProceedToCheckout1= By.xpath("//p/a[@title='Proceed to checkout']/span");
    By txt_AlreadyRegistered = By.xpath("//form[@id='login_form']/h3");

    public void verifyUserIsOnHomePage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("automationpractice"));
        System.out.println("User is on Correct Homepage");
    }
    public void userHoversAroundWomenCategory() {
        actions.moveToElement(driver.findElement(btn_WomenCategory)).perform();
        actions.moveToElement(driver.findElement(btn_Tshirts)).perform();
        actions.moveToElement(driver.findElement(btn_Blouses)).perform();
        actions.moveToElement(driver.findElement(btn_CasualDresses)).perform();
        actions.moveToElement(driver.findElement(btn_EveningDresses)).perform();
    }

    public void userClicksOnSummerDresses(){
            actions.moveToElement(driver.findElement(btn_SummerDresses)).click().perform();

        }

        public void userClicksOnAddToCartButton(){
        actions.moveToElement(driver.findElement(btn_PrintedSummerDress)).perform();
        clickOnElement(btn_AddToCart);
        }

        public void userClicksOnProceedToCheckout(){
        clickOnElement(btn_ProceedToCheckout);
        clickOnElement(btn_ProceedToCheckout1);
        }

        public void verifyOnlyRegisteredUserCanCompletePurchase(){
        Assert.assertTrue(driver.findElement(txt_AlreadyRegistered).isDisplayed());
            System.out.println("User Must Log In to Complete purchase");
        }

    }

