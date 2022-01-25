package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LogIn extends Utils{


    By btn_SignIn = By.xpath("//a[@class='login']");
    By txt_UserName = By.id("email");
    By txt_Password = By.id("passwd");
    By btn_SignIn2 = By.xpath("//*[@id=\"SubmitLogin\"]/span");
    By msg_Alert = By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
   // By msg_Authentication = By.xpath("//*[@id=\"center_column\"]/div[1]");


    public void verifyUserIsOnHomePage(){

        Assert.assertTrue(driver.getCurrentUrl().contains("automationpractice"));
        System.out.println("User is on correct homepage");

    }

    public void userClicksOnSignInButton(){
        clickOnElement(btn_SignIn);

    }

    public void usertypesInUserNameAndPassword(String username, String password){
      typeText(txt_UserName,username);
      typeText(txt_Password,password);

    }
    public void userClicksOnSignOnButton2(){
        clickOnElement(btn_SignIn2);

    }
       public void verifyUserReceivesCorrectStatus(String status){
            Assert.assertEquals(getTextFromElement(msg_Alert),status);
         // Assert.assertEquals(getTextFromElement(msg_Authentication),status);
       }

    }



