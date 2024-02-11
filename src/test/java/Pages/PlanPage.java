package Pages;

import Utility.SeleniumUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class PlanPage extends SeleniumUtility {
    public static final By PLAN_LOCATOR = By.linkText("Plans");

    public static final By BIKE_LOCATOR= By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[1]");
    public static final By MOTORCYCLE= By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[2]");
    public static final By PRICE_1 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[3]");
    public static final By DATE_CREATED_1 =By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[4]");
    public static final By DATE_EXPIRE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[5]");

    public static final By BOAT_OBJECT =By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[1]");
    public static final By BOAT_TITLE =By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[2]");
    public static final By PRICE_2 =By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[3]");
    public static final By DATE_CREATED_2 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[4]");
    public static final By DATE_EXPIRY2 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[2]/td[5]");

    public static final By HOUSE_LOCATOR = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[1]");
    public static final By RENTERS_TITLE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[2]");
    public static final By PRICE_3 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[3]");
    public static final By DATE_CREATED3 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[4]");
    public static final By DATE_EXPIRY3 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[3]/td[5]");

    public static final By CAR_OBJECT = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[1]");
    public static final By AUTO_TITLE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[2]");
    public static final By PRICE_4 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[3]");
    public static final By DATE_CREATED4 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[4]");
    public static final By DATE_EXPIRY4 = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[4]/td[5]");

}
