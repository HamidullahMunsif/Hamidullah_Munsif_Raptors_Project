package PagesSteps;

import Pages.Profile;
import Utility.SeleniumUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class UserProfileSteps extends SeleniumUtility {
    @Then("click on profile button")
    public void ProfileButton(){
        primaryButtonClick(Profile.PROFILE_BUTTON);
    }
    @Then("validate profile information")
    public void ProfileInfoValidating(){
        String Fullname = textDisplayed(Profile.FULLNAME_LOCATOR);
        Assert.assertEquals("Supervisor", Fullname);
        String Username= textDisplayed(Profile.USERNAME_LOCATOR);
        Assert.assertEquals("supervisor", Username);
    }
    @When("click on Logout Button")
    public void LogOut(){
        primaryButtonClick(Profile.LOGOUT_BTLOCATOR);
    }

}
