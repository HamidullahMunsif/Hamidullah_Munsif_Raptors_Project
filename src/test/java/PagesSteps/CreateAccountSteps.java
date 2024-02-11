package PagesSteps;

import Base.BaseSetup;
import Pages.CreateAccount;
import Utility.SeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.假如;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAccountSteps extends SeleniumUtility {

    @When("click on primary account button")
    public void primaryAccountButton(){
        primaryButtonClick(CreateAccount.PRIMARY_ACOUNTB_LOCATOR);
    }
    @Then ("validate form title Create Primary Account Holder")
    public void validateFormTitle() {
        String formTitle = textDisplayed(CreateAccount.ACCOUNT_FORM_TITLE);
        Assert.assertEquals("Create Primary Account Holder", formTitle);
    }
    @Then("fill up the form with user data")
    public void emailAddress(){
  sendText(CreateAccount.EMAIL_ADDRESS, "hameedmunsif@gmail.com");
  sendText(CreateAccount.FIRST_NAME, "Hamidullah");
  DropBox(CreateAccount.GENDER_BOX, "Male");
  DropBox(CreateAccount.TITLE_PREFIX, "Mr.");
  sendText(CreateAccount.LAST_NAME, "Munsif");
  DropBoxByindex(CreateAccount.MARITIAL_STATUS);
  sendText(CreateAccount.DATE_LOCATOR, "01/01/1998");
    }
    @Then("click on create Account")
    public void CreateAccount(){
    primaryButtonClick(CreateAccount.CREATE_ACCOUNT_BTLOCATOR);
    }
    @Given("validate error message as expected")
    public void ErrorMessage(){
        boolean Errormsg = isElementEnabled(CreateAccount.ERROR_MSG_LOCATOR);
        Assert.assertTrue("Account with email hameedmunsif@gmail.com is exist", Errormsg);

    }


    }

