package Utility;

import Base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SeleniumUtility extends BaseSetup {


    public String getElement(By locator) {
        return getDriver().findElement(locator).getText();
    }

    private WebDriverWait getWait(){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(30));
    }
    private WebElement waitForvisibility(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public boolean isElementEnabled(By locator){
        return getDriver().findElement(locator).isEnabled();
    }
    public String textDisplayed(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }
    public WebElement primaryButton(By locator){
        return getDriver().findElement(locator);
    }
    public void primaryButtonClick(By locator){
          getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendText(By locator, String text){
        waitForvisibility(locator).sendKeys(text);
    }
    public void DropBox(By locator, String value){
        WebElement element = waitForvisibility(locator);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public void DropBoxByindex(By locator){
        WebElement element = waitForvisibility(locator);
        Select select = new Select(element);
        select.selectByIndex(1);
    }
    public void SelectByVisibility(By locator, String item){
        WebElement element = waitForvisibility(locator);
        Select select = new Select(element);
        select.selectByVisibleText(item);

    }
    public LocalDate nextDate(){
        LocalDate current = LocalDate.now();
        LocalDate nextDay = current.plusDays(1);
        return nextDay;
    }
    public String ExpiryDateMethod(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formateDate =nextDate().format(formatter);
        return formateDate;
    }
    public String CurrentDate(){
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String newformat = localDate.format(formatter);
        return newformat;
    }
    private String dynamic;
    public String dynamicValue(String locator){
        this.dynamic = locator;
        return dynamic;
    }


}
