package org.example;

import io.cucumber.java.en.*;

public class StepDef {

   RegistrationPage registrationPage = new RegistrationPage();

   LogIn logIn = new LogIn();
   AddToCart addToCart = new AddToCart();
   SocialMedia socialMedia = new SocialMedia();

    @Given("I am on homepage")
    public void i_am_on_homepage() {

     registrationPage.verifyUserIsOnHomePage();

    }

    @When("I click on Sign in")
    public void i_click_on_sign_in() {
     registrationPage.userClicksOnSignInButton();

    }

    @When("I type in my email address")
    public void i_type_in_my_email_address() {
     registrationPage.userTypesInEmailAddress();

    }


 @And("click on create an account and fill up Personal details")
    public void clickOnCreateAnAccountAndFillUpPersonalDetails() {
     registrationPage.userClicksOnCreateAnAccountAndFillsUpPersonalDetails();




    }

    @Then("I should be registered successfully")
    public void i_should_be_registered_successfully() {
        registrationPage.verifyUserIsRegisteredSuccessfully();
        registrationPage.userShouldBeLoggedOutSuccessfully();

    }



    @Given("User am on homepage")
    public void user_am_on_homepage() {
        logIn.verifyUserIsOnHomePage();

    }
    @When("User clicks on Sign in")
    public void user_clicks_on_sign_in() {
        logIn.userClicksOnSignInButton();

    }
    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        logIn.usertypesInUserNameAndPassword(username,password);


    }
    @When("User clicks on Sign in Button")
    public void user_clicks_on_sign_in_button() {
        logIn.userClicksOnSignOnButton2();
    }
    @Then("User should receive {string} accordingly")
    public void user_should_receive_accordingly(String status) {
        logIn.verifyUserReceivesCorrectStatus(status);

    }


    @When("I hover around Women category")
    public void i_hover_around_women_category() {
        addToCart.verifyUserIsOnHomePage();
        addToCart.userHoversAroundWomenCategory();


    }
    @When("click on Summer Dresses")
    public void click_on_summer_dresses() {
        addToCart.userClicksOnSummerDresses();

    }
    @Then("click on Add to Cart")
    public void click_on_add_to_cart() {
        addToCart.userClicksOnAddToCartButton();

    }
    @Then("Proceed to checkout")
    public void proceed_to_checkout() {
        addToCart.userClicksOnProceedToCheckout();

    }
    @Then("click again on proceed to checkout")
    public void click_again_on_proceed_to_checkout() {

    }
    @Then("I should be asked to log in")
    public void i_should_be_asked_to_log_in() {
        addToCart.verifyOnlyRegisteredUserCanCompletePurchase();

    }

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        socialMedia.VerifyUserIsOnHomePage();

    }
    @When("user clicks on Facebook icon")
    public void user_clicks_on_facebook_icon() {
        socialMedia.userClicksOnSocialMediaIcon();

    }
    @Then("user should be navigated to facebook page")
    public void user_should_be_navigated_to_facebook_page() {
        socialMedia.windowHandles();

    }
    @Then("user should click on login button")
    public void user_should_click_on_login_button() {

    }



}
