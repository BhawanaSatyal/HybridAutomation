package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils{



    By btn_SignIn = By.xpath("//a[@class='login']");
    By txt_EmailAddress = By.id("email_create");
    By btn_CreateAnAccount = By.xpath("//button[@id='SubmitCreate']/span");
    By btn_Gender = By.id("id_gender2");
    By txt_FirstName = By.id("customer_firstname");
    By txt_LastName = By.name("customer_lastname");
    By txt_Password = By.id("passwd");
    By txt_DayOfBirth = By.id("days");
    By txt_MonthOfBirth = By.id("months");
    By txt_YearOfBirth = By.xpath("//select[@class='form-control' and @name ='years']");
    By btn_SignUpForNewsLetter = By.name("optin");
    By txt_Address = By.name("address1");
    By txt_City = By.id("city");
    By dropDown_State = By.id("id_state");
    By txt_Postcode = By.name("postcode");
    By txt_PhoneNumber = By.id("phone_mobile");
    By btn_Register = By.xpath("//button[@type='submit' and @name='submitAccount']/span");
    By txt_AddressAlias= By.id("alias");
    By btn_Logout = By.xpath("//a[@class='logout']");





    public void verifyUserIsOnHomePage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("automationpractice"));

    }
    public void userClicksOnSignInButton(){
        clickOnElement(btn_SignIn);

    }



    public void userTypesInEmailAddress(){

        String email = loadProp.getProperty("email1")+currentTimeStamp() + loadProp.getProperty("email2");
        typeText(txt_EmailAddress,email);
        System.out.println("email: " +email);

    }


    public void userClicksOnCreateAnAccountAndFillsUpPersonalDetails(){
        clickOnElement(btn_CreateAnAccount);
        clickOnElement(btn_Gender);
        typeText(txt_FirstName,loadProp.getProperty("FirstName"));
        typeText(txt_LastName, loadProp.getProperty("LastName"));
        typeText(txt_Password, loadProp.getProperty("Password"));
        //typeText(txt_DayOfBirth, loadProp.getProperty("DayofBirth"));
//        selectByVisibleText(txt_DayOfBirth,loadProp.getProperty("DayofBirth"));
        selectByValueText(txt_DayOfBirth,loadProp.getProperty("DayofBirth"));
        typeText(txt_MonthOfBirth, loadProp.getProperty("MonthOfBirthday"));
        typeText(txt_YearOfBirth,loadProp.getProperty("YearOfBirth"));
        clickOnElement(btn_SignUpForNewsLetter);
        typeText(txt_Address, loadProp.getProperty("Address"));
        typeText(txt_City,loadProp.getProperty("city"));
        selectByVisibleText(dropDown_State,"Alaska");
       // typeText(dropDown_State,loadProp.getProperty("Alaska"));
        typeText(txt_Postcode,loadProp.getProperty("Postcode"));
        typeText(txt_PhoneNumber,loadProp.getProperty("PhoneNumber"));
        typeText(txt_AddressAlias,loadProp.getProperty("AddressAlias"));
        clickOnElement(btn_Register);

    }

    public void verifyUserIsRegisteredSuccessfully(){

       Assert.assertTrue(driver.findElement(btn_Logout).isDisplayed());
        System.out.println("Registered Successfully");
    }


    public void userShouldBeLoggedOutSuccessfully(){
        clickOnElement(btn_Logout);
        System.out.println("Successful Logout");
    }
}
