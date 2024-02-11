package Pages;

import Utility.SeleniumUtility;
import org.openqa.selenium.By;

public class Login extends SeleniumUtility {
    public static final By LOGIN_BT_LOCATOR = By.linkText("Login");
    public static final By USER_NAME_LOCATOR=By.xpath("//input[@name='username']");
    public static final By PASSWORD_LOCATOR =By.xpath("//input[@name='password']");
    public static final By SIGNIN_BT_LOCATOR =By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");
    public static final By WRONG_USERNAME =By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div");
    public static final By WRONG_PASSWORD =By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div");
}
