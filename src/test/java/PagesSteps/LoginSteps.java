package PagesSteps;

import Pages.Login;
import Utility.SeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps extends SeleniumUtility {
    @Given("navigate to url")
    public void NavigatetoURL(){
        Openbrowser();
    }
    @When("click on login button")
    public void clickLoginButton(){
    primaryButtonClick(Login.LOGIN_BT_LOCATOR);
    }
    @When("enter credintials")
    public void Credintials(){
        sendText(Login.USER_NAME_LOCATOR, "supervisor");
        sendText(Login.PASSWORD_LOCATOR, "tek_supervisor");
    }
    @Then("click on sign in button")
    public void clickOnSignIn(){
        primaryButtonClick(Login.SIGNIN_BT_LOCATOR);
    }
    @Given("enter wrong credintials")
    public void WrongCredintials(){
        sendText(Login.USER_NAME_LOCATOR, "Wrongsupervisor");
        sendText(Login.PASSWORD_LOCATOR, "tek_supervisor");

    }
    @Then("wrong username error message validation")
    public void WrongUsername(){
    String WrongUsername =textDisplayed(Login.WRONG_USERNAME);
        Assert.assertEquals("ERROR\n" +
                "User Wrongsupervisor not found", WrongUsername);

    }
}
