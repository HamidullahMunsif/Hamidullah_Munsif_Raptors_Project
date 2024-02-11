package PagesSteps;

import Base.BaseSetup;
import Pages.HomePage;
import Utility.SeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestCase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;


public class HomePageSteps extends SeleniumUtility {
    public WebDriver driver;

    @When("validate Home page title")
    public void ValidateTitle() {
        String TitleLocate =getDriver().getTitle();
        System.out.println(TitleLocate);
        Assert.assertEquals("Tek Insurance UI", TitleLocate);
    }
    @Then("validate primary account button exist")
    public void ValidatePrButton(){
        WebElement primaryButton = primaryButton(HomePage.PRIMARY_BUTTON);
        primaryButton.isEnabled();
        Assert.assertTrue(primaryButton.isDisplayed());
    }


}
