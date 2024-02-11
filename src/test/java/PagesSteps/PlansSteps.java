package PagesSteps;

import Pages.PlanPage;
import Utility.SeleniumUtility;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Currency;
import java.util.LinkedList;
import java.util.List;

public class PlansSteps extends SeleniumUtility {
@Then("click on plans button")
    public void PlanButton(){
        primaryButtonClick(PlanPage.PLAN_LOCATOR);
    }
    @Then("validate first row data")

    public void dataValidationFirstRow(){
    boolean bike = isElementEnabled(PlanPage.BIKE_LOCATOR);
        Assert.assertTrue(bike);
        String Motorcycle = textDisplayed(PlanPage.MOTORCYCLE);
        Assert.assertEquals("Motorcycle", Motorcycle);
        String Price1_Locator = textDisplayed(PlanPage.PRICE_1);
        Assert.assertEquals(dynamicValue(Price1_Locator), Price1_Locator);

        String DateCreated = textDisplayed(PlanPage.DATE_CREATED_1);
        Assert.assertEquals(CurrentDate(), DateCreated);
       String DateExpire = textDisplayed(PlanPage.DATE_EXPIRE);
        Assert.assertEquals(ExpiryDateMethod(), DateExpire);
    }
    @Then("validate second row data")
    public void dataValidationSecondRow(){
    boolean BoatObj = isElementEnabled(PlanPage.BOAT_OBJECT);
    Assert.assertTrue(BoatObj);
    String BoatTitle = textDisplayed(PlanPage.BOAT_TITLE);
    Assert.assertEquals("Boat", BoatTitle);
    String Price2_locator = textDisplayed(PlanPage.PRICE_2);
    Assert.assertEquals(dynamicValue(Price2_locator), Price2_locator);
    String DateCreated = textDisplayed(PlanPage.DATE_CREATED_2);
    Assert.assertEquals(CurrentDate(), DateCreated);
    String DateExpire = textDisplayed(PlanPage.DATE_EXPIRY2);
    Assert.assertEquals(ExpiryDateMethod(), DateExpire);
    }
    @Then("validate third row data")
    public void dataValidationThirdRow(){
    boolean House = isElementEnabled(PlanPage.HOUSE_LOCATOR);
    Assert.assertTrue(House);
    String Renters = textDisplayed(PlanPage.RENTERS_TITLE);
    Assert.assertEquals("Renters", Renters);
    String Price = textDisplayed(PlanPage.PRICE_3);
    Assert.assertEquals(dynamicValue(Price), Price);
    String DateCreated = textDisplayed(PlanPage.DATE_CREATED3);
    Assert.assertEquals(CurrentDate(),DateCreated);
    String DateExpiry3 = textDisplayed(PlanPage.DATE_EXPIRY3);
    Assert.assertEquals(ExpiryDateMethod(),DateExpiry3);
    }
    @Then("validate fourth row data")
    public void dataValidationFourthRow(){
    boolean CarObject = isElementEnabled(PlanPage.CAR_OBJECT);
    Assert.assertTrue(CarObject);
    String AutoTitle= textDisplayed(PlanPage.AUTO_TITLE);
    Assert.assertEquals("Auto", AutoTitle);
    String Price4 = textDisplayed(PlanPage.PRICE_4);
    Assert.assertEquals(dynamicValue(Price4),Price4);
    String DateCreated4 = textDisplayed(PlanPage.DATE_CREATED4);
    Assert.assertEquals(CurrentDate(),DateCreated4);
    String DateExpiry4 = textDisplayed(PlanPage.DATE_EXPIRY4);
    Assert.assertEquals(ExpiryDateMethod(),DateExpiry4);
    }
    @Then("validate Create Date")
    public void ValidateCreateDate(){
   String DateCreated = textDisplayed(PlanPage.DATE_CREATED_1);
   Assert.assertEquals(CurrentDate(),DateCreated);
    }
    @Then("validate Expiry Date")
    public void ExpiryDate(){
    String Expirydate = textDisplayed(PlanPage.DATE_EXPIRE);
    Assert.assertEquals(ExpiryDateMethod(),Expirydate);
    }

}
