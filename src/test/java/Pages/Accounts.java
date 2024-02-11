package Pages;

import Utility.SeleniumUtility;
import org.openqa.selenium.By;

public class Accounts extends SeleniumUtility {
    public static final By ACCOUNT_LOCATOR = By.xpath("/html/body/div[1]/div/div[2]/div/div/a[1]");
    public static final By EMAIL_ADD1 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[2]");
    public static final By FULLNAME_LOCATOR1 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[3]");
    public static final By DOB_LOCATOR1 =By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[6]");
    public static final By NUMBER_LOCATOR = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select");
    public static final By NUMBER_LOCATOR2 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select");
}
