package PagesSteps;

import Pages.Accounts;
import Utility.SeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountsSteps extends SeleniumUtility {

    @Given("click on account")
    public void ClickOnaccount(){
        primaryButtonClick(Accounts.ACCOUNT_LOCATOR);
    }
    @Then("verify five rows data")
    public void VerifyFiveRowsData(){
    boolean email1 = isElementEnabled(Accounts.EMAIL_ADD1);
        Assert.assertTrue(email1);
        boolean Fullname = isElementEnabled(Accounts.FULLNAME_LOCATOR1);
        Assert.assertTrue(Fullname);
        boolean DOB = isElementEnabled(Accounts.DOB_LOCATOR1);
        Assert.assertTrue(DOB);
    }
    @When("change item number to {string}")
    public void ValidateNumberofRecords(String pageItem){
        SelectByVisibility(Accounts.NUMBER_LOCATOR,"Show " + pageItem);
        SelectByVisibility(Accounts.NUMBER_LOCATOR2, "Show " + pageItem);
    }
    @Then("validate table records per page to 10")
    public void Validate10rowsData(){
        boolean email1 = isElementEnabled(Accounts.EMAIL_ADD1);
        Assert.assertTrue(email1);
        boolean Fullname = isElementEnabled(Accounts.FULLNAME_LOCATOR1);
        Assert.assertTrue(Fullname);
        boolean DOB = isElementEnabled(Accounts.DOB_LOCATOR1);
        Assert.assertTrue(DOB);
    }
}
